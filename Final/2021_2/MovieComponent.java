public interface MovieComponent {
    public default String getName() {
        throw new UnsupportedOperationException();
    }

    public default int getProductionYear() {
        throw new UnsupportedOperationException();
    }

    public default double getPrice() {
        throw new UnsupportedOperationException();
    }

    public default void setPrice(double price) {
        throw new UnsupportedOperationException();
    }

    public default boolean equals(MovieComponent m1, MovieComponent m2) {
        if (m1.getName() == m2.getName() && m1.getProductionYear() == m2.getProductionYear()) {
            return true;
        }
        return false;
    }
}