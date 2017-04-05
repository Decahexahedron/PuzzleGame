package puzzlegame;

public class Button {

    boolean press = false;
    int x, y;

    public Button(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public Button(int a, int b, boolean c) {
        this.x = a;
        this.y = b;
        this.press = c;
    }

    public boolean isPress() {
        return press;
    }

    public void setPress(boolean press) {
        this.press = press;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
