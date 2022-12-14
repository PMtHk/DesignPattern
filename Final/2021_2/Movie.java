public class Movie implements MovieComposite {
  private String name;
  private Integer prodYear;
  private double price = 0.0;
  private String resolution;

  public Movie(String name, Integer year, int i, String res) {
    this.name = name;
    this.prodYear = year;
    this.price = i;
    this.resolution = res;
  }

  public String getName() {
    return name;
  }

  public Integer getProductionYear() {
    return prodYear;
  }

  public void setPrice(Double newPrice) {
    this.price = newPrice;
  }

  public double getPrice() {
    return price;
  }

  public String getResolution() {
    return resolution;
  }

  // toString() 구현
  public String toString() {
    return "제목 : " + getName() + ", 가격 : " + getPrice() + " 원";
  }

  // equals() 제목과 제작년도 비교
  public boolean equals(Movie mv) {
    if (name == mv.getName() && prodYear == mv.getProductionYear())
      return true;
    return false;
  }
}