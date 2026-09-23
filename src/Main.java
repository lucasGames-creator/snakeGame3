import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Garante que a interface gráfica seja executada na thread correta (EDT)
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Snake Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            GamePanel panel = new GamePanel(); 
            frame.add(panel); 
            
            frame.pack(); // Ajusta a janela ao tamanho do painel
            frame.setLocationRelativeTo(null); // Centraliza a janela na tela
            frame.setVisible(true);
        });
    }
}