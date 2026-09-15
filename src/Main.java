public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    Board board = new Board();
    char gameBoard[][] = board.getBoard();
    boolean player1Turn = board.getPlayer1Turn();

    boolean isGameOver = false;


}