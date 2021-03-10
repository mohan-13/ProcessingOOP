import processing.core.PApplet;

public class Box implements Shape {

    public static final int LENGTH = 10;
    public static final int BREADTH = 20;
    private PApplet sketch;
    private int xCoordinate;
    private int yCoordinate;
    private int speed;

    public Box(PApplet sketch, int xCoordinate, int yCoordinate, int speed) {
        this.sketch = sketch;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.speed = speed;
    }

    @Override
    public void moveLeftToRight() {
        xCoordinate += speed;
    }

    @Override
    public void draw(PApplet pApplet) {
        pApplet.fill(255,0,0);
        pApplet.rect(xCoordinate,yCoordinate,LENGTH,BREADTH);

    }
}
