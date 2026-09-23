import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GamePanel extends JPanel {
    
    private final Board board = new Board();

    public GamePanel() {
        // Define o tamanho do painel usando as constantes que criamos
        setPreferredSize(new Dimension(GameConstants.WIDTH, GameConstants.HEIGHT));
        setBackground(java.awt.Color.BLACK); // Opcional: define o fundo como preto para o jogo
    }

    @Override 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Converte o objeto Graphics para Graphics2D para recursos visuais avançados
        Graphics2D g2 = (Graphics2D) g;
        
        // Desenha o tabuleiro do jogo
        board.draw(g2);
    }
}