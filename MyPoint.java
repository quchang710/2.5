public class MyPoint {
    private int x;
    private int y;
    public MyPoint (){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint (int x, int y) {
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "MyPoint [x=" + x + ", y=" + y + "]";
    }
}
