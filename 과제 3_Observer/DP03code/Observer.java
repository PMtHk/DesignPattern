// 옵저버는 update 함수 하나만 있으면 됨.
public interface Observer { 
    // public void updateText(String msg);
    public void update(int value);
}
