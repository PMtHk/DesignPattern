import java.util.List;

public interface PersonDao {
    public void insert(Person p);
    public List<Person> findAll();
    public Person findById(int id);
    public void update(int id, Person p);
    public void delete(int id);
    public void delete(Person p);
}
