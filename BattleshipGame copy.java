import java.util.*;

public class BattleshipGame {
    static Battleship map = new Battleship(); //creating new Maze called myMap 
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        intro(); 

        //while ()
    }


    public static void intro() { 
        dashedLines(); 
        System.out.println("\nWelcome to Battleship! There are currently 5 ships on the board: (A)ircraft Carrier (size 5), (B)attleship (size 4), (C)ruiser (size 3), and 2 (D)estroyers (size 2). "); 
        System.out.println("\nHere is your board. If you have successfully hit a ship, your board will be marked with an 'X', if you just hit water, your board will be marked with an 'O'. \n");
        map.printMap(); 
        dashedLines(); 
    } 


    //This method is used to make it easier for the user to read what is in the console 
    public static void dashedLines() {

        System.out.println(); 

        for (int i = 1; i <=150; i++) {

            System.out.print("-");

        }

        System.out.println();

    }
 
} 