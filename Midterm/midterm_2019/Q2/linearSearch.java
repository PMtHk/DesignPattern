public class linearSearch implements Searchable{
  /** public boolean linearSearch(int[] objs, int num)
     * <p> 단순 반복문을 이용해서 정수를 찾고 있으면 해당 값을 반환함
     * </p>
     * @param objs 오름차순으로 정렬되어 있는 정수 배열
     * @param num 검색할 정수값
     * @return 배열에 검색할 정수값이 있는지 확인하고 true 또는 false를 반환
     */
    public boolean search(int[] objs, int num) {
      for (int n : objs) {
          if (num == n) return true;
      }
      return false;
    }
}
