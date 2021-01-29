package c2Collision;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

abstract public class Entity {
    protected int x, y;
    protected Image image;
    protected boolean visible;
    protected int width, height;
    
    public abstract void move();
    
	public Entity(String path, int x, int y) {
        ImageIcon ii =
                new ImageIcon(this.getClass().getResource(path));
            image = ii.getImage();
            visible = true;
            width = image.getWidth(null);
            height = image.getHeight(null);
            this.x = x;
            this.y = y;
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

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}
