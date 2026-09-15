import java.util.Scanner;

public class Board {
    private char[][] board;
    int rows = 0;
    int cols = 0;



    Scanner playerInput = new Scanner(System.in);
    boolean player1Turn = true;

    public Board(int rows, int cols)
    {
        char[][] board = new char[rows][cols];
        this.rows = rows;
        this.cols = cols;
    }

    public char[][] getBoard()
    {
        return board;
    }

    public void placeTile()
    {

    }




}
