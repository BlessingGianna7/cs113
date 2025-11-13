import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Board {
    public static void display(int[][] board) {
		int height = board.length;
		int width = board[0].length;
       for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				if(board[i][j] == -1){
					System.out.print("X ");
				}else {
					System.out.print(board[i][j] + " ");
				}
			}
		   System.out.println();
		 } 
    }
	public static int getWidth(String filename) {
		try {
			Scanner s = new Scanner(new File(filename));
			String line = s.nextLine();
			s.close();
			int width = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ' ') {
                    width++;
                }
            }
			return width;
		} catch(FileNotFoundException e) {
			return -1;
		}
	}
	public static int getHeight(String filename) {
		try {
			Scanner s = new Scanner(new File(filename));
			String line;
			int count = 0;
			while(s.hasNextLine()) {
				s.nextLine();
				count++;
			}
			s.close();
			return count;
		} catch(FileNotFoundException e) {
			return -1;
		}
	}

   public static int[][] generate(String fileName) {
		try {
			int width = getWidth(fileName);
			int height = getHeight(fileName);
            int[][] b1 = new int[height][width];
			Scanner sc = new Scanner(new File(fileName));
			for(int i = 0; i < height; i++) {
                String line = sc.nextLine();
                int col = 0;
                for(int j = 0; j < line.length(); j++) {
                    char c = line.charAt(j);
                    if (c == ' ') {
                        continue; 
                    }
                    if (c == 'X') {
                        b1[i][col] = -1;
                    } else {
                        b1[i][col] = 0;
                    }
                    col++;
                }
            }
            sc.close();
			for (int i = 0; i < height; i++) {
 			   for (int j = 0; j < width; j++) {
        		   if (b1[i][j] == -1) {
                   continue;
         		} else {
            		int count = 0;
            
                  //left
            		if (j - 1 >=0 && b1[i][j-1] == -1) count++;
            		//right
            		if (j + 1 < width && b1[i][j+1] == -1) count++;
            		//top
            		if (i - 1 >= 0 && b1[i-1][j] == -1) count++;
            		//bottom
            		if (i + 1 < height && b1[i+1][j] == -1) count++;
            	
        				if(i - 1 >= 0 && j - 1 >= 0 && b1[i-1][j-1] == -1 )count++;
						if(i - 1 >= 0 && j + 1 < width && b1[i-1][j+1] == -1)count++;
						if(i + 1 < height && j + 1 < width && b1[i+1][j+1] == -1)count++;
						if(i + 1 < height && j - 1 >= 0 && b1[i+1][j-1] == -1)count++;
						b1[i][j] = count;
        			}
			   }	
	 	     }
		
			return b1;
			

		} catch (FileNotFoundException e){
			return null;
		}
    
   }
    public static void main(String[] args) {
      if (args.length < 1) {	
			 System.out.println("Please enter a file");
          return;
      }
		File f = new File(args[0]);
		if(!f.exists()){
			System.out.println("File does not exist");
			return;
		}		
		
		int[][] board = generate(args[0]);
		display(board);

    }


 

}
