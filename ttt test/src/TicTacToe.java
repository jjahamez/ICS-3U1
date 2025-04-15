import java.util.Scanner;
import java.util.InputMismatchException;

public class TicTacToe {
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2)
                System.out.println("---------");
        }
    }

    public static boolean checkWin(char[][] board) { // checks for win
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) 
                return true; // rows
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return true; // columns
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return true;
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return true; // diagonals

        return false; // no winner yet
    }

    public static boolean checkDraw(char[][] board) { // checks for draw
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O') {
                    return false; // empty spot found
                }
            }
        }
        return true; // no empty spots left
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = {
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' }
        }; // splits the board into 3x3 spots
        boolean turn = true; // true for 'X', false for 'O'

        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("Instructions:");
        System.out.println("Enter your move as a number from 1-9 (refer to grid below) ");
        System.out.println("The first player is 'X', and the second player is 'O'.");
        System.out.println("To win, get three of the same symbol connected in a row, column or diagonal");

        while (true) {
            printBoard(board);
            String currentPlayer = turn ? "X" : "O";
            System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
            int move;
            try {
                move = input.nextInt() - 1;
                int row = move / 3;
                int col = move % 3; // converts number into coordinate
                if (board[row][col] == 'X' || board[row][col] == 'O') {
                    System.out.println("Invalid move, spot is already taken.");
                    continue;
                }
                board[row][col] = currentPlayer.charAt(0); // updates board to 'X' or 'O' (1st string to char)
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException err) {
                System.out.println("Invalid input, please enter a number between 1 and 9.");
                input.nextLine();
                continue;
            }
            if (checkWin(board)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins...");
                break; // Ends the game
            }
            if (checkDraw(board)) {
                printBoard(board);
                System.out.println("It's a draw!!");
                break; // Ends the game
            }

            turn = !turn; // switch turns
        }
        input.close();
    }
}
