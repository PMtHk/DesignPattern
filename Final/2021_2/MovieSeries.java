import java.util.ArrayList;

public class MovieSeries implements MovieComposite {
  ArrayList<Movie> movies = new ArrayList<Movie>();
  private String name;
  private Integer createdYear;
  private double discountRate;

  public MovieSeries(String name, Integer year, double discountRate) {
    this.name = name;
    this.createdYear = year;
    this.discountRate = discountRate;
    System.out.println("MovieSeries: 영화 시리즈 " + name + " 생성, 할인율 : " + discountRate);
  }

  // eqauls()
  public boolean eqauls(MovieSeries mvs) {
    if (name == mvs.getName() && createdYear == mvs.createdYear)
      return true;
    return false;
  }

  public void add(Movie mv) {
    boolean chk = false;

    for (int i = 0; i < movies.size(); i++) {
      if (movies.get(i).equals(mv)) {
        // 영화 이름이 존재하면
        System.out.println("MovieSeries: 영화 " + mv.getName() + " 가(이) 새로 교체되었습니다.");
        System.out.println("MovieSeries: 기존가격: " + movies.get(i).getPrice() + " 원, 새로운 가격: " + mv.getPrice() + " 원");
        movies.get(i).setPrice(mv.getPrice());
        chk = true;
      }
    }

    if (chk == false) {
      movies.add(mv);
      System.out.println("MovieSeries: 영화 " + mv.getName() + " 가(이) 추가되었습니다.");
    }
  }

  public void remove(Movie mv) {
    movies.remove(mv);
    System.out.println("MovieSeries: 영화 " + mv.getName() + " 가(이) 삭제되었습니다.");
  }

  public Movie getMovie(int i) {
    Movie mv = movies.get(i);
    return mv;
  }

  public String getName() {
    return name;
  }

  public Integer getProductionYear() {
    return createdYear;
  }

  public void list() {
    String str = "";
    for (Movie mv : movies) {
      str += mv + "\n";
    }
    System.out.println(str);
  }

  public double getPrice() {
    double totalPrice = 0.0;
    for (Movie mv : movies) {
      totalPrice += mv.getPrice() * ((100 - getDiscountRate()) / 100);
    }
    return totalPrice;
  }

  private double getDiscountRate() {
    return discountRate;
  }

  public String toString() {
    String str = "Movie Series Name: " + getName() + ", " + getPrice() + "원, " + getDiscountRate() + "%\n";
    for (Movie mv : movies) {
      str += "         제목 : " + mv.getName() + ", 제작년도: " + mv.getProductionYear() + ", 가격: " + mv.getPrice()
          + "원, 해상도: " + mv.getResolution() + "\n";
    }
    return str;
  }

  public boolean equals(MovieSeries mvs) {
    if (name == mvs.getName() && createdYear == mvs.getProductionYear())
      return true;
    return false;
  }
}
