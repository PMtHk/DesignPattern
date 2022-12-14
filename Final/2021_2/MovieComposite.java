public interface MovieComposite {
  public String getName();

  public Integer getProductionYear();

  public double getPrice();

  public String toString();

  public default boolean equals(Movie mv) {
    throw new UnsupportedOperationException();
  }

  public default boolean equals(MovieSeries mvs) {
    throw new UnsupportedOperationException();

  }
}