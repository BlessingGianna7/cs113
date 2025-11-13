import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Minesweeper {
    public static void main(String[] args) {
      System.out.println("Welcome to Minesweeper");
      if (args.length < 1) {
            System.out.println("Please enter a file");
            return;
        }
      int[][] board = Board.generate(args[0]);
      int height = board.length;
      int width = board[0].length;
      for(int i = 0; i < height; i++){
          for(int j = 0; j < width; j++){
            System.out.print(". ");
     	  }
	 	      System.out.println();
  	  }
		  Scanner sc = new Scanner(System.in);
	    boolean[][] uncov = new boolean[board.length][board[0].length];

		  while(true){
		      System.out.println("Enter a row:");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter an integer!");
                sc.next();
                continue;
            }
          int r = sc.nextInt();
          if (r < 0 || r >= height) {
              System.out.println("Enter an integer in the range [0, " + height + ")");
              continue;
          }
          int row = r;

		      System.out.println("Enter a col:");
          if (!sc.hasNextInt()) {
              System.out.println("Please enter an integer!");
              sc.next(); 
              continue;
          }
          int c = sc.nextInt();
          if (c < 0 || c >= width) {
              System.out.println("Enter an integer in the range [0, " + width + ")");
              continue;
          }
          int col = c;

		      uncov[row][col] = true;
		      if(board[row][col] == -1){
                System.out.println("You hit a BOMB! You lose!");
                System.out.println("Game Over");
                Board.display(board);
                break;
          }
          int covered = 0;    
          for (int i = 0; i < height; i++)
          for (int j = 0; j < width; j++)
          if (board[i][j] != -1 && !uncov[i][j])
              covered++;

          if (covered == 0) {
              System.out.println("You WIN!!");
              System.out.println("Game Over!");
               Board.display(board);
               break;
        }

          
	       for(int i = 0; i < height; i++){
              for(int j = 0; j < width; j++){
                 if(uncov[i][j]) {
                   if(board[i][j] == -1) {
                     System.out.print("X ");
                   } else {
                     System.out.print(board[i][j] + " ");
                   }
                } else {
                    System.out.print(". ");
                }
                }
                System.out.println();
           }


		  
      }
      sc.close();
	}
}
