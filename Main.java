
import processing.core.PApplet;
import ru.ivt5.v3.Configurator;

public class Main extends PApplet {      //(String[] args) {
    private Configurator Configurator;
    private float prevMouseX, prevMouseY;
    long lastAddTime = 0;          // время последнего добавления
    int delay = 40;
    float mod = 1f;

    public void settings() {
        size(800, 500);
        Configurator = new Configurator(this);
        Configurator.addCircle(width / 2f, height / 2f, 5, 5);
    }

    public void draw() {
        background(64);
        Configurator.updateAndRender();
        prevMouseX = mouseX;
        prevMouseY = mouseY;
    }

    public void mouseDragged() {
        long now = millis(); // текущее время с начала скетча в миллисекундах

        if (now - lastAddTime > delay) {
            switch (Math.round(random(0.5f,3.5f))) {
                case 1: {
                    Configurator.addCircle(mouseX, mouseY, (mouseX - prevMouseX) * mod, (mouseY - prevMouseY) * mod);
                    break;}
                case 2:{
                    Configurator.addRectangle(mouseX, mouseY, (mouseX-prevMouseX)*mod, (mouseY- prevMouseY)*mod);
                    break;}
                case 3:{
                    Configurator.addRomb(mouseX, mouseY, (mouseX-prevMouseX)*mod, (mouseY- prevMouseY)*mod);
                    break;}}
            lastAddTime = now;
        }


    }

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }

}