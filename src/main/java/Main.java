import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class Main extends PApplet {

    private static final int HEIGHT = 480;
    private static final int WIDTH = 640;
    private Ball ballOne;
    private Ball ballTwo;
    private Ball ballThree;
    private Ball ballFour;
    private List<Shape> shapes;

    public static void main(String[] args) {
        PApplet.main("Main",args);

    }

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        ballOne=new Ball(this,0,HEIGHT*1/5,1);
        ballTwo=new Ball(this,0,HEIGHT*2/5,2);
        ballThree=new Ball(this,0,HEIGHT*3/5,3);
        ballFour=new Ball(this,0,HEIGHT*4/5,4);
        shapes = Arrays.asList(ballOne, ballTwo, ballThree, ballFour);
    }

    @Override
    public void draw() {
        shapes.forEach(Shape::moveLeftToRight);
        shapes.forEach(shape -> shape.draw(this));

    }

}
