import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PasswordDAOImpl implements PasswordDAO {
  final static String DB_FILE_NAME = "passwordbook.db";
  final static String DB_TABLE_NAME = "passwords";

  Connection connection = null;
  ResultSet rs = null;
  Statement statement = null;
  
  public PasswordDAOImpl() {
    try {
      connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
      statement = connection.createStatement();
      statement.setQueryTimeout(30);  // set timeout to 30 sec.
      final String table = " (url text PRIMARY KEY, id text, password text)";

      // create table after deleting existing one.
      statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
      statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);
    } 
    catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void insert(PasswordInfo pw) {
    try {
      String fmt = "INSERT INTO %s VALUES ('%s', '%s', '%s')"; // fmt = format
      String q = String.format(fmt, DB_TABLE_NAME, pw.getUrl(), pw.getId(), pw.getPassword()); // query statement

      statement.execute(q);
    } 
    catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public List<PasswordInfo> findAll() {
    ArrayList<PasswordInfo> passwords = new ArrayList<PasswordInfo>();
    try {
      rs = statement.executeQuery("SELECT * FROM " + DB_TABLE_NAME);
      while (rs.next()) {
        passwords.add(
          new PasswordInfo(
            rs.getString("url"), 
            rs.getString("id"), 
            rs.getString("password")
          )
        );
      }
    } 
    catch (SQLException e) {
      e.printStackTrace();
    }
    return passwords;
  }

  public PasswordInfo findByKey(String url) {
    PasswordInfo pw = null;
    try {
      String fmt = "SELECT * FROM %s WHERE url = '%s'";
      String q = String.format(fmt, DB_TABLE_NAME, url);

      rs = statement.executeQuery(q);

      if (rs.next()) {
        pw = new PasswordInfo(
          rs.getString("url"), 
          rs.getString("id"), 
          rs.getString("password")
        );
      } 
    } 
    catch (SQLException e) {
      e.printStackTrace();
    }
    return pw;
  }

  public void update(PasswordInfo pw) {
    if (pw != null) {
      try {
        String fmt = "UPDATE %s SET id = '%s' WHERE url = '%s'";
        String q = String.format(fmt, DB_TABLE_NAME, pw.getId(), pw.getUrl());
        
        statement.execute(q);
      } 
      catch (Exception e) {
        e.printStackTrace();
        // TODO: handle exception
      }
    }
  }

  public void delete(String url) {
    try {
      String fmt = "DELETE FROM %s WHERE url = '%s'";
      String q = String.format(fmt, DB_TABLE_NAME, url);

      statement.execute(q);
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void delete(PasswordInfo p) {
    delete(p.getUrl());
  }
}
