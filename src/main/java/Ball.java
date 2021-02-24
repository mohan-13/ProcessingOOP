import processing.core.PApplet;

public class Ball {
    public static final int DIAMETER = 10;
    private PApplet sketch;
    private int ballPosition;
    private int ballSpeed;
    private static int counter;

    public Ball(PApplet sketch, int ballPosition, int ballSpeed) {
        this.sketch = sketch;
        this.ballPosition = ballPosition;
        this.ballSpeed = ballSpeed;
    }

    public static void step()
    {
        counter++;
    }
    public void showBall()
    {
        sketch.ellipse(ballSpeed*counter,ballPosition,DIAMETER, DIAMETER);
    }


}
