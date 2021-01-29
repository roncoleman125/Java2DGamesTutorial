package c2Collision;

import java.awt.event.KeyEvent;

import java.util.ArrayList;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Craft extends Entity {
    public final static String CRAFT = "/res/craft.png";
    public final static int CRAFT_SPEED = 1;

    protected ArrayList missiles;

    protected int dx = 0;
    protected int dy = 0;
    
    public Craft() {
    	super(CRAFT,40,60);
    	super.visible = true;
    	missiles = new ArrayList();
    }

    @Override
    public void move() {
        x += dx;
        y += dy;

        if (x < 1) {
            x = 1;
        }

        if (y < 1) {
            y = 1;
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -CRAFT_SPEED;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = CRAFT_SPEED;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -CRAFT_SPEED;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = CRAFT_SPEED;
        }
    }

    public void fire() {
        missiles.add(new Missile(x + width, y + height/2));
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
    

    public ArrayList getMissiles() {
        return missiles;
    }
}