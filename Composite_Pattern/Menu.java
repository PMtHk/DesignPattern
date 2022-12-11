import java.util.ArrayList;
import java.util.Iterator;

public class Menu implements MenuComponent {
  ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
  String name;
  String description;

  public Menu(String name, String desc) {
    this.name = name;
    this.description = desc;
  }

  public void add(MenuComponent comp) {
    menuComponents.add(comp);
  }

  public void remove(MenuComponent comp) {
    menuComponents.remove(comp);
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void print() {
    System.out.print("\n" + getName());
    System.out.println(", " + getDescription());
    System.out.println("-------------------");
    // Iterator it = menuComponents.iterator();
    // while(it.hasNext()) {
    //   MenuComponent component = (MenuComponent) it.next();
    //   component.print();
    // }  아래와 같이 for each 문으로 바꿀 수 있다.
    for (MenuComponent component : menuComponents) {
      component.print();
    }
  }

}
