public final class GameConstants {

    // Construtor privado para evitar instanciação da classe utilitária
    private GameConstants() { } 

    public static final String GAME_TITLE = "Snake Game"; 
    public static final int TILE = 30;  // Tamanho dos pixels
    public static final int COLS = 30;  // Quantidade de colunas
    public static final int ROWS = 30;  // Quantidade de linhas
    
    // Cálculo da largura e altura total da tela
    public static final int WIDTH = TILE * COLS; 
    public static final int HEIGHT = TILE * ROWS; }