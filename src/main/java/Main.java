import processing.core.PApplet;

public class Main extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public Ball ballOne=new Ball(this,HEIGHT*1/5,1);
    public Ball ballTwo=new Ball(this,HEIGHT*2/5,2);
    public Ball ballThree=new Ball(this,HEIGHT*3/5,3);
    public Ball ballFour=new Ball(this,HEIGHT*4/5,4);
    public static void main(String[] args) {
        PApplet.main("Main",args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        Ball.step();
        ballOne.showBall();
        ballTwo.showBall();
        ballThree.showBall();
        ballFour.showBall();
    }
}
