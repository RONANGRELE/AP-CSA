 import java.util.Scanner;
 public class TikTakToeBoard {
   private String[][] board = new String[3][3];
  public TikTakToeBoard() {
   board[0][0] = "1";   board[0][1] = "2";  board[0][2] = "3";
   board[1][0] = "4";   board[1][1] = "5";  board[1][2] = "6";
   board[2][0] = "7";   board[2][1] = "8";  board[2][2] = "9";
  }
    
  public void enterX(int pos) {
   Scanner scan = new Scanner(System.in);
   System.out.println("player X your turn");
   int XEntry = scan.nextInt();
   for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 3; j++) {
     if (XEntry == board[i][j]) {
      board[i][j] = "O";
     }
    }
   }
  }
    
  public void enterO(int pos) {
    /*
    Scanner scan = new Scanner(System.in);
    System.out.println("player O enter the row");
    int OVertEntry = scan.nextInt();
    System.out.println("player O enter the column");
    int OHorEntry = scan.nextInt();
    board[OVertEntry-1][OHorEntry-1] = "O";
    */
   int count = 1;
   for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 3; j++) {
     if (count == pos) {
      board[i][j] = "O";
     }
     count++;
    }
   }
  }
    
  public boolean checkRowsForXWinner(){
   for(int i = 0; i < 3; i++) {
    int count = 0;
    for(int j = 0; j < 3; j++) {
     if (board[i][j].equals("X")) {
      count++;
     }
    }
    if (count == 3) {
     return true;
    }
   }
   return false;
  }
  
  public boolean checkColsForXWinner() {
   for(int i = 0; i < 3; i++) {
    int count = 0;
    for(int j = 0; j < 3; j++) {
     if (board[j][i].equals("X")) {
      count++;
     }
    }
    if (count == 3) {
     return true;
    }
   }
   return false;
  }
  
  public boolean checkDiagsForXWinner() {
   for(int i = 0; i < 3; i++) {
    int count = 0;
    if (board[i][i].equals("X")) {
     count++;
    }
    if (count == 3) {
     return true;
    }
   }
   for(int i = 2; i > -1; i--) {
    int count = 0;
    if (board[i][i].equals("X")) {
      count++;
    }
    if (count == 3) {
     return true;
    }
   }
   return false;
  }
    
  public boolean checkRowsForOWinner(){
   for(int i = 0; i < 3; i++) {
    int count = 0;
    for(int j = 0; j < 3; j++) {
     if (board[i][j].equals("O")) {
      count++;
     }
    }
    if (count == 3) {
     return true;
    }
   }
   return false;
  }
  
  public boolean checkColsForOWinner() {
   for(int i = 0; i < 3; i++) {
    int count = 0;
    for(int j = 0; j < 3; j++) {
     if (board[j][i].equals("O")) {
      count++;
     }
    }
    if (count == 3) {
     return true;
    }
   }
   return false;
  }
  
  public boolean checkDiagsForOWinner() {
   for(int i = 0; i < 3; i++) {
    int count = 0;
    if (board[i][i].equals("O")) {
     count++;
    }
    if (count == 3) {
     return true;
    }
   }
   for(int i = 2; i > -1; i--) {
    int count = 0;
    if (board[i][i].equals("O")) {
      count++;
    }
    if (count == 3) {
     return true;
    }
   }
   return false;
  }
  
  public boolean checkForWinner() {
   if (checkRowsForXWinner() == true || checkColsForXWinner() == true || checkDiagsForXWinner() == true || 
       checkRowsForOWinner() == true || checkColsForOWinner() == true || checkDiagsForOWinner() == true || ) {
       return true;
   } else {
       return false;
   }
  }
 }