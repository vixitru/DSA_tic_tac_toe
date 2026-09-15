import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Board board = new Board();
        char gameBoard[][] = board.getBoard();
        boolean player1Turn = board.getPlayer1Turn();

        boolean isGameOver = false;
        Scanner input = new Scanner(System.in);

        while (!isGameOver){
            player1Turn = board.getPlayer1Turn();
            System.out.println(board.toString());

            System.out.println("Put in the row you want your symbol");
            System.out.print("");
            int rowInput = input.nextInt();
            System.out.println("Put in the col you want your symbol");
            System.out.print("");
            int colInput = input.nextInt();

            board.placeTile(rowInput, colInput, gameBoard, player1Turn);



        }

    }




}