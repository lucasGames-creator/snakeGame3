import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private final Board board = new Board();

    public GamePanel() {

        setPreferredSize(new Dimension(GameConstants.WIDTH, GameConstants.HEIGTH));
    }

    @Override //substitui um método já existente na classe pai JPanel
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        board.draw(g2);
    }
}