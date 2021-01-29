package b2ShootingMissles;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Missile {

    private int x, y;
    private Image image;
    boolean visible;

    private final int MISSILE_SPEED = 2;
    private final static int BOARD_WIDTH = 390;

    public Missile(int x, int y) {

        ImageIcon ii =
            new ImageIcon(this.getClass().getResource("/res/missile.png"));
        image = ii.getImage();
        visible = true;
        x = this.x;
        y = this.y;
    }


    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void move() {
        x += MISSILE_SPEED;
        if (x > BOARD_WIDTH)
            visible = false;
    }
}
