import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    final static String DB_FILE_NAME = "addrbook.db";
    final static String DB_TABLE_NAME = "persons";

    Connection connection = null;
    ResultSet rs = null;
    Statement statement = null;

    public PersonDaoImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            final String table = " (ID INTEGER PRIMARY KEY AUTOINCREMENT, name text, address text)";

            // create table
            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(Person p) {
        try {
            String fmt = "INSERT INTO %s VALUES(%d, '%s', '%s')";
            String q = String.format(fmt, DB_TABLE_NAME, p.getId(), p.getName(), p.getAddress());
            
            statement.execute(q);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Person> findAll() {
        ArrayList<Person> persons = new ArrayList<Person>();
        try {
            rs = statement.executeQuery("SELECT * FROM " + DB_TABLE_NAME);
            while (rs.next()) {
                persons.add(new Person(rs.getInt("id"), rs.getString("name"),
                                       rs.getString("address")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public Person findById(int id) {
        Person person = null;
        try {
            String fmt = "SELECT * FROM %s WHERE id = %d";
            String q = String.format(fmt, DB_TABLE_NAME, id);
            rs = statement.executeQuery(q);
            if (rs.next()) {
                person = new Person(rs.getInt("id"), rs.getString("name"),
                                   rs.getString("address"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return person;
    }

    public void update(int id, Person p) {
        Person person = findById(id);
        if (person != null) {
            try {
                String fmt = "UPDATE %s SET name = '%s', address = '%s' WHERE id = %d";
                String q = String.format(fmt, DB_TABLE_NAME, p.getName(), p.getAddress(), p.getId());
                
                statement.execute(q);
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(int id) {
        try {
            String fmt = "DELETE FROM %s WHERE id = %d";
            String q = String.format(fmt, DB_TABLE_NAME, id);
            
            statement.execute(q);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Person p) {
        delete(p.getId());
    }
}
