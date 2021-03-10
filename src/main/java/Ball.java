import processing.core.PApplet;

public class Ball implements Shape {
    public static final int DIAMETER = 10;
    private int xCoordinate;
    private int yCoordinate;
    private int speed;

    public Ball(int xCoordinate, int yCoordinate, int speed) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.speed = speed;
    }

    public void moveLeftToRight() {
        xCoordinate += speed;

    }


    public void draw(PApplet pApplet) {
        pApplet.fill(0,255,0);
        pApplet.ellipse(xCoordinate, yCoordinate, DIAMETER, DIAMETER);
    }
}
