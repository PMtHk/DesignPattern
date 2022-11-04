import java.util.List;

public interface PasswordDAO {
  public void insert(PasswordInfo p);
  public List<PasswordInfo> findAll();
  public PasswordInfo findByKey(String key); // url -> key 일반화
  public void update(String key, PasswordInfo p);
  public void delete(String key); // url -> key 일반화
  public void delete(PasswordInfo p);
}