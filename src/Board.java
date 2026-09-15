import java.util.Scanner;

public class Board {
    private char[][] board;

    Scanner playerInput = new Scanner(System.in);
    boolean player1Turn = true;

    public Board()
    {
        char[][] board = new char[3][3];
    }

    public char[][] getBoard()
    {
        return board;
    }

    public void setPlayer1Turn(boolean set)
    {
        player1Turn = set;
    }

    public boolean getPlayer1Turn()
    {
        return player1Turn;
    }

    public void placeTile(int row, int col, char [][] board, boolean player1Turn)
    {
        if (player1Turn)
        {
            board[row][col] = 'X';
            setPlayer1Turn(false);
        }
        else
        {
            board[row][col] = 'O';
            setPlayer1Turn(true);
        }
        public String Check(){
           for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){

               }
           }
    }
    }




}
