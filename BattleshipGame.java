import java.util.*;

public class BattleshipGame {
    static Battleship myMap = new Battleship(); //creating new Battleship called myMap 
    static Scanner input = new Scanner(System.in);
    static String game; //Asks user if they want to see game statistics or not 
    static int numberOfMoves; 

    public static void main(String[] args) {
        intro(); 
        dashedLines(); 
        System.out.println(" "); 
        myMap.printMap();
        numberOfMoves = 0; 
     
        //Asks the user what move they want to make while there is no winner
        while (myMap.didIWin() == false) {
            System.out.print("\nWhich row? ");
            int row = input.nextInt(); 
            System.out.print("Which column? "); 
            int col = input.nextInt(); 

            myMap.move(row + 1 ,col + 1); 
            myMap.shipsSunk(); //Checks to see if any ships have been sunk 
            System.out.println(); 

            myMap.printMap();
            numberOfMoves++; 

            //If user wants to see game statistics, the method will be called on 
            if (game.equals("Y")) {
                gameStatistics();
            }

            myMap.didIWin(); 
            dashedLines();

            if (myMap.didIWin() == true) { 
                System.out.println("Congratulations! You sunk all 5 ships! "); 
            }
        }

        //Asks the user if they want to see the solution board after they've won 
        System.out.print("\nWant to see the solution board? 'Y' or 'N'. ");
        String dummy = input.nextLine(); 
        String solutionBoard = input.nextLine(); 
        
        if (solutionBoard.equals("Y")) {
            Battleship.printSolution(); 
        }
    }

 
    //Introducing the game to the user and asks them if they want to see game statistics 
    public static void intro() {
        System.out.println("\nWelcome to the Battleship Game! There are currently 5 ships on the board: 1 (A)ircraft Carrier (size 5), 1 (B)attleship (size 4), 1 (C)ruiser (size 3), and 2 (D)estroyers (size 2). Here is what your board currently looks like: ");
        myMap.printMap();
        System.out.println("When you hit a ship, your board will be marked wtih an 'X'. If you miss, your board will be marked with an 'O'. Let's start! ");
        System.out.print("Would you like to view game statistics while you're playing the game? 'Y' or 'N' "); 
        game = input.nextLine(); 
    }

    //Prints out the game statistics 
    public static void gameStatistics() {
        System.out.println("Moves made: " +  numberOfMoves);
        System.out.println("Hits: " + Battleship.hits); 
        System.out.println("Misses: " + Battleship.misses); 
        System.out.println("Ships sunk: " + Battleship.shipsSunk); 

        double accuracy = (Battleship.hits * 100.0) / numberOfMoves ; 
        System.out.println("Accuracy: " + accuracy + "%"); 
    }
 
    public static void dashedLines() {
        System.out.println(); 
 
         for (int i = 1; i <=150; i++) {
             System.out.print("-");
         }
         System.out.println();
    }
} 
