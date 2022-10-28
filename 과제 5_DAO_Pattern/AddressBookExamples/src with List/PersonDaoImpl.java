import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    List<Person> persons;

    public PersonDaoImpl() {
        persons = new ArrayList<Person>();
    }

    public void insert(Person p) {
        persons.add(p);
    }

    public List<Person> findAll() {
        return persons;
    }

    public Person findById(int id) {
        for (Person pi : persons) {
            if (pi.getId() == id) {
                return pi;
            }
        }
        return null;
    }

    public void update(int id, Person p) {
        Person person = findById(id);
        if (person != null) {
            person.setName(p.getName());
            person.setAddress(p.getAddress());
        }
    }

    public void delete(int id) {
        Person person = findById(id);
        if (person != null) {
            persons.remove(person);
        }
    }

    public void delete(Person p) {
        persons.remove(p);
    }
}
