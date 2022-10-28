import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {
  private String filename;

  public LoadHudDisplays(String filename) {
    this.filename = filename;
  }

  @Override
  public ArrayList<String> load() {
    ArrayList<String> list = new ArrayList<String>();

    try {
      BufferedReader br = new BufferedReader(new FileReader(filename));
      String line = br.readLine(); // 한줄씩 받아들이기.
      while (line != null) {
        line = line.trim(); // 공백 제거
        if(!line.equals("")) { //공백 제거 후 뭐라도 있을 때,
          list.add(line); 
        }
        line = br.readLine();
      }
      br.close();
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
    return list;
  }
}
