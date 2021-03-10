import processing.core.PApplet;

public class Ball implements Shape {
    public static final int DIAMETER = 10;
    private PApplet sketch;
    private int xCoordinate;
    private int yCoordinate;
    private int speed;

    public Ball(PApplet sketch, int xCoordinate, int yCoordinate, int speed) {
        this.sketch = sketch;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.speed = speed;
    }

    public void moveLeftToRight() {
        xCoordinate+=speed;

    }


    public void draw(PApplet pApplet) {
            pApplet.ellipse(xCoordinate,yCoordinate,DIAMETER,DIAMETER);
    }
}
