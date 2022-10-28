public class binarySearch implements Searchable {
  /** public boolean binarySearch(int[] objs, int num)
     * <p> 이진 검색 방법을 이용해서 정수를 찾고 있으면 해당 값을 반환함
     * </p>
     * @param objs 오름차순으로 정렬되어 있는 정수 배열
     * @param num 검색할 정수값
     * @return 배열에 검색할 정수값이 있는지 확인하고 true 또는 false를 반환
     */
    public boolean search(int[] objs, int num) {
      int left = 0;
      int right = objs.length - 1;
      while (left <= right) {
          int mid = (right - left)  / 2 + left;
          if (objs[mid] == num) return true;
          else if (objs[mid] > num) { // remove right half
              right = mid - 1;
          } else {  // remove left half
              left = mid + 1;
          }
      }
      return false;
    }
}
