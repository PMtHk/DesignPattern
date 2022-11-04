public class PasswordBookWithDAO {
  public static void main(String[] args) {
    PasswordInfo pw;
    PasswordDAO passwordDao = new PasswordDAOImpl();

    // 1. 데이터 DB에 출력.
    System.out.println("--- inserting...");
    pw = new PasswordInfo("https://www.smu.ac.kr", "smu", "abcde");
    passwordDao.insert(pw);
    pw = new PasswordInfo("https://www.smu2.ac.kr", "smu2", "abcde");
    passwordDao.insert(pw);

    // 2. 모든 데이터 출력.
    System.out.println("--- finding all...");
    for (PasswordInfo pi : passwordDao.findAll()) {
      System.out.println("reading... " + pi);
    }

    // 3. 두 번째 데이터의 id인 "smu2" 를 "smu1" 으로 수정.
    System.out.println("--- updating smu2 to smu1...");
    pw = passwordDao.findByKey("https://www.smu2.ac.kr");
    pw.setId("smu1");
    passwordDao.update(pw.getUrl(),pw);

    // 4. 해당 데이터가 제대로 수정되었는지 데이터 출력으로 확인.
    System.out.println("--- checking updated information...");
    pw = passwordDao.findByKey("https://www.smu2.ac.kr");
    if (pw != null) {
      System.out.println(pw);
    }

    // 5-1. key를 이용해 https://www.smu2.ac.kr 데이터 삭제.
    System.out.println("--- deleting...");
    passwordDao.delete("https://www.smu2.ac.kr");

    // 5-2. 정상적으로 삭제 되었는지 확인. (전체출력).
    System.out.println("--- finding all for checking deletion...");
    for (PasswordInfo pi : passwordDao.findAll()) {
      System.out.println("reading... " + pi);
    }
  }
}