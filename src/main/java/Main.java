import processing.core.PApplet;

public class Main extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;

    public static void main(String[] args) {
        PApplet.main("Main",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

}
