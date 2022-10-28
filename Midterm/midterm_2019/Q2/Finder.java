public class Finder {
  private Searchable searchable = null;

  public Finder(Searchable search) {
    this.searchable = search;
  }

  public boolean Search(int[] objs, int num){
    return searchable.search(objs, num);
  };

  public void setSearchable(Searchable search){
    searchable = search;
  }
}
