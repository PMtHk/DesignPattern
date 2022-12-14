import java.util.ArrayList;

public class MovieSeries implements MovieComponent {
  private ArrayList<MovieComponent> movieSeries = new ArrayList<MovieComponent>();

  private String name;
  private int year;
  private double discountRate;

  public MovieSeries(String name, int year, double discountRate) {
    this.name = name;
    this.year = year;
    this.discountRate = discountRate;
    System.out.println("MovieSeries: 영화 시리즈 " + name + " 생성, 할인율: " + discountRate);
  }

  public String getName() {
    return name;
  }

  public int getProductionYear() {
    return year;
  }

  public double getPrice() {
    double totalPrice = 0.0;
    for (MovieComponent movie : movieSeries) {
      totalPrice += movie.getPrice();
    }
    totalPrice = totalPrice * (100 - discountRate) / 100;
    return totalPrice;
  }

  public void add(MovieComponent m) {
    for (MovieComponent movie : movieSeries) {
      if (equals(movie, m)) {
        System.out.println("MovieSeries: 영화 " + movie.getName() + "가(이) 교체되었습니다.");
        System.out.println("MovieSeries: 기존 가격: " + movie.getPrice() + "원, 새로운 가격: " + m.getPrice());
        movie.setPrice(m.getPrice());
        return;
      }
    }
    movieSeries.add(m);
    System.out.println("MovieSeries: 영화 " + m.getName() + "가(이) 추가되었습니다.");
  }

  public void remove(MovieComponent m) {
    for (MovieComponent movie : movieSeries) {
      if (equals(movie, m)) {
        movieSeries.remove(movie);
        System.out.println("MovieSeries: 영화 " + m.getName() + "가(이) 삭제되었습니다.");
      }
    }
  }

  public void list() {
    for (MovieComponent movie : movieSeries) {
      System.out.println("영화: " + movie.getName() + ", 가격: " + movie.getPrice() + " 원");
    }
  }

  public MovieComponent getMovie(int i) {
    if (movieSeries.get(i) != null) {
      return movieSeries.get(i);
    }
    return null;
  }

  public String toString() {
    String str = "";
    for (MovieComponent movie : movieSeries) {
      str += "\t\t" + movie + "\n";
    }
    return "Movie Series Name: " + getName() + ", Price: " + getPrice() + "원, Discount rate: " + discountRate + "%"
        + "\n" + str;
  }
}