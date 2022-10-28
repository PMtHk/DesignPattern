
public class Main {
    public static void main(String[] args) {
        final int MIN = 11;
        final int MAX = 110;
        final int NUMS = 50;
        IntArrays intArrays = new IntArrays(MIN, MAX, NUMS);

        int[] randints = intArrays.getNumbers();
        Finder finder = new Finder(new linearSearch());
        System.out.println(finder.Search(randints, randints[NUMS - 10]));
        System.out.println(finder.Search(randints, randints[NUMS - 20]));
        System.out.println(finder.Search(randints, MAX + 10));
        System.out.println(finder.Search(randints, MIN - 10));

        finder.setSearchable(new binarySearch());
        System.out.println(finder.Search(randints, randints[NUMS - 10]));
        System.out.println(finder.Search(randints, randints[NUMS - 20]));
        System.out.println(finder.Search(randints, MAX + 10));
        System.out.println(finder.Search(randints, MIN - 10));
    }
}