import java.util.ArrayList;

public class MovieLibrary {

  ArrayList<Movie> movies = new ArrayList<Movie>();
  ArrayList<MovieSeries> movieSeries = new ArrayList<MovieSeries>();

  private String name; // 라이브러리 이름
  private double totalPrice = 0;

  public MovieLibrary(String libName) {
    name = libName;
  }

  public String getLibName() {
    return name;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void insert(Movie mv, boolean replace) {
    if (replace == false) {
      movies.add(mv);
      totalPrice += mv.getPrice();
      System.out.println("MovieLibrary: " + mv.getProductionYear() + " 년도에 제작된(구성된) 영화(시리즈) " + mv.getName() + "가(이) 추가되었습니다.");
    }
    // TODO: replace 가 true 면 기존 것 삭제 후 새로 추가
  }

  public void insert(MovieSeries mvs, boolean replace) {
    if (replace == false) {
      movieSeries.add(mvs);
      totalPrice += mvs.getTotalPrice();
      System.out.println("MovieLibrary: " + mvs.getCreatedYear() + " 년도에 제작된(구성된) 영화(시리즈) " + mvs.getName() + "가(이) 추가되었습니다.");
    }
    // TODO: replace 가 true 면 기존 것 삭제 후 새로 추가
  }

  public void delete(Movie mv) {
    boolean inList = false;
    for (int i = 0; i < movies.size(); i++) {
      if (movies.get(i).getName() == mv.getName()) {
        // 영화가 list에 존재
        movies.remove(i);
        System.out.println("MovieLibrary: " + mv.getProductionYear() + " 제작된 영화(시리즈) " + mv.getName() + " 를(을) 삭제했습니다.");
        inList = true;
      }
    }

    if (!inList) {
      System.out.println("MovieLibrary: " + mv.getProductionYear() + " 년도에 제작된 영화(시리즈) " + mv.getName() + " 가(이) 없습니다.");
    }
  }

  public void delete(MovieSeries mvs) {
    boolean inList = false;
    for (int i = 0; i < movies.size(); i++) {
      if (movieSeries.get(i).getName() == mvs.getName()) {
        // 영화가 list에 존재
        movieSeries.remove(i);
        System.out.println("MovieLibrary: " + mvs.getCreatedYear() + " 제작된 영화(시리즈) " + mvs.getName() + " 를(을) 삭제했습니다.");
        inList = true;
      }
    }

    if (!inList) {
      System.out.println("MovieLibrary: " + mvs.getCreatedYear() + " 년도에 제작된 영화(시리즈) " + mvs.getName() + " 가(이) 없습니다.");
    }
  }

  public String toString() {
    String str = "영화 라이브러리 : " + getLibName() + "\n";
    str += "영화(시리즈) 개수 : " + (movies.size() + movieSeries.size()) + "       영화 라이브러리 전체 구매 가격 : " + getTotalPrice() + " 원\n";  

    return str;
  }
}
