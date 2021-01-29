package c2Collision;

public class Missile extends Entity {
	public final static String MISSILE = "/res/missile.png";
	public final static int MISSILE_SPEED = 2;
	
    public Missile(int x, int y) {
    	super(MISSILE,x,y);
    }

    @Override
    public void move() {
        x += MISSILE_SPEED;
        if (x > Board.WIDTH)
            visible = false;
    }
}