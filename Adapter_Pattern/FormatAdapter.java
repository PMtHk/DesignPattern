public class FormatAdapter implements MediaPlayer {
  private MediaPackage media;

  public FormatAdapter(MediaPackage mp) {
    media = mp;
  }

  @Override
  public void play(String fileName) {
    System.out.print("Using Adapter --> ");
    media.playFile(fileName);
  }
}
