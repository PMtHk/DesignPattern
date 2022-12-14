public class Movie {
  private String name;
  private Integer prodYear;
  private Integer price;
  private String resolution;

  public Movie(String name, Integer year, Integer price, String res) {
    this.name = name;
    this.prodYear = year;
    this.price = price;
    this.resolution = res;
  }

  public String getName() {
    return name;
  }

  public Integer getProductionYear() {
    return prodYear;
  }

  public void setPrice(int newPrice) {
    this.price = newPrice;
  }

  public Integer getPrice() {
    return price;
  }

  public String getResolution() {
    return resolution;
  }

  // toString() 구현
  public String toString() {
    return "제목 : " + getName() + ", 가격 : " + getPrice() + " 원\n";
  }

  // equals() 제목과 제작년도 비교
  public boolean equals(Movie mv) {
    if (name == mv.getName() && prodYear == mv.getProductionYear())
      return true;
    return false;
  }
}