import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
  public void brew() {
    System.out.prinln("필터로 커피를 우려내는 중");
  }

  public void addCondiments() {
    System.out.prinln("우유와 설탕을 추가하는 중");
  }

  public boolean customerWantsCondiments() {
    char answer = getUserInput();
    return (answer == 'y') ? true : false;
  }

  public char getUserInput() {
    String answer = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("커피에 우유와 설탕을 추가하시겠습니까?");
    answer = sc.next();
    return answer.charAt(0);
  }
}
