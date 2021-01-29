package c2Collision;

public class Alien extends Entity {
	public final static String ALIEN = "/res/alien.png";
    public final static int ALIEN_SPEED = 1;

    public Alien(int x, int y) {
    	super(ALIEN,x,y);
    	super.visible = true;
    }

    @Override
    public void move() {
        if (x < 0) 
            x = 400;
        x -= 1;
    }
}