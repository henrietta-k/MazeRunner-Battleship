import java.util.*;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

//AirplaneGame class is inherited from the BattleshipGame class 
public class AirplaneGame extends BattleshipGame {

    public static Airplane s = new Airplane(); 

    public static void main(String[] args) {
        //Airplane.printSolution(); 
        intro(); 
        dashedLines(); 

        s.printMap();
        numberOfMoves = 0; 

        //Had to rewrite parts of the main method too so that it says 'planes' instead and prints out the correct boards 
        while (s.didIWin() == false) {
            

            System.out.print("\nWhich row? ");
            int row = input.nextInt(); 
            System.out.print("Which column? "); 
            int col = input.nextInt(); 

            s.move(row + 1 ,col + 1); 

            s.shipsSunk(); 

            System.out.println(); 

            s.printMap();
    

            numberOfMoves++; 

            if (game.equals("Y")) {

                gameStatistics(); // fix this too 
            }

            s.didIWin(); 

            dashedLines();

            if (myMap.didIWin() == true) {
                System.out.println("Congratulations! You hit all 5 planes! "); 

            }

        }

        System.out.print("\nWant to see the solution board? 'Y' or 'N'. ");
        String dummy = input.nextLine(); 
        String solutionBoard = input.nextLine(); 
        
        if (solutionBoard.equals("Y")) {

            Battleship.printSolution(); 
        }





    } 

//Overrides intro() method because it introduces the game as 'Airplanes' instead of 'Battleship'
    public static void intro() {
        System.out.println("\nWelcome to the Airplane Game! There are currently 5 airplanes on the board, all in a 'T' configuration: 1 (A)ircraft Carrier (size 7), 1 (B)attleship (size 6), 1 (C)ruiser (size 4), and 2 (D)estroyers (size 4). Here is what your board currently looks like: \n");
        s.printMap();
        System.out.println("When you hit an airplane, your board will be marked wtih an 'X'. If you miss, your board will be marked with an 'O'. Let's start! ");
        System.out.print("Would you like to view game statistics while you're playing the game? 'Y' or 'N' "); 
        game = input.nextLine(); 


        
    }

//Changed the wording to 'Planes hit' 
    public static void gameStatistics() {

        System.out.println("Moves made: " +  numberOfMoves);
        System.out.println("Hits: " + Battleship.hits); 
        System.out.println("Misses: " + Battleship.misses); 
        System.out.println("Planes hit: " + Battleship.shipsSunk); 

        //fix this it doesn't work 
        double accuracy = (Battleship.hits * 100.0) / numberOfMoves ; 

        System.out.println("Accuracy: " + accuracy + "%"); 


    }



} 