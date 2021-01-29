package i1SpaceInvaders;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SpaceInvaders extends JFrame implements Commons {

    public SpaceInvaders()
    {
        add(new Board());
        setTitle("Space Invaders");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGTH);
        setLocationRelativeTo(null);
        
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SpaceInvaders();
    }
}
