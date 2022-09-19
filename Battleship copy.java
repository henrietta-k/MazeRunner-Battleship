import java.util.*;

public class Battleship {

    //Declaring two 2D arrays, one for the player's map and one for the solution
    public static char[][] myMap;
    public static char[][] solution;
 
    //Global variables used throughout the program 
    public static int hits = 0; 
    public static int misses = 0; 
    public static int shipsSunk = 0; 
    public static int shipsSunkA = 0; 
    public static int shipsSunkB = 0; 
    public static int shipsSunkC = 0; 
    public static int shipsSunkD1 = 0; 
    public static int shipsSunkD2 = 0; 





        public Battleship() {

            myMap = new char[11][11]; 
            solution = new char[11][11]; 

//Filling the map and filling the solution
            fillMap(myMap);
            fillMap(solution);  
            fillSolution(); 

        
    
        } 

//This method is used to check whether each ship has been sunk or not to make sure that the shipsSunk counter is accurate 
        public void shipsSunk() {

            if (shipsSunkA == 0) {
                shipsSunkAircraft();
            }

    
            if (shipsSunkB == 0) {
                shipsSunkBattleship();

            }

            if (shipsSunkC == 0) {
                shipsSunkCruiser();

            }

            if (shipsSunkD1 == 0) {
                shipsSunkDesOne();
            }
            

            if (shipsSunkD2 == 0) {
                shipsSunkDesTwo();
            }

        }

//Method that fills the map with dashes and also the coordinate numbers 
        public static void fillMap(char[][] map) {

            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {

                    map[i][j] = '-';
                }
            }

            map[0][1] = '0'; 
            map [0][2] = '1';
            map [0][3] = '2'; 
            map [0][4] = '3'; 
            map [0][5] = '4'; 
            map [0][6] = '5'; 
            map [0][7] = '6'; 
            map [0][8] = '7'; 
            map [0][9] = '8'; 
            map [0][10] = '9'; 

            map [1][0] = '0'; 
            map [2][0] = '1'; 
            map [3][0] = '2'; 
            map [4][0] = '3'; 
            map [5][0] = '4'; 
            map [6][0] = '5'; 
            map [7][0] = '6'; 
            map [8][0] = '7'; 
            map [9][0] = '8'; 
            map [10][0] = '9'; 

            map [0][0] = ' '; 

/*            for(int i = 0; i<11; i++) {
                
                for(int j = 0; j< 11 ; j++) {
        System.out.print(map[i][j] + " "); 
    
    }

    System.out.println(); 
} */
        }


//Fills the solution array with the ships 
        public void fillSolution() { 

            for (int a = 1; a < 6; a++) {
                solution[1][a] = 'A';
            }
 
            for (int b = 3; b < 7; b++) {
                solution[b][3] = 'B'; 
            }

            for (int c = 1; c < 4; c++) {
                solution[8][c] = 'C'; 
            }


            for (int d = 4; d < 6; d++) {
                solution[d][8] = 'D'; 
            }

            for (int e = 5; e < 7; e++) {
                solution[7][e] = 'D'; 
            }
/*
            for(int i = 0; i<11; i++) {
                
                for(int j = 0; j< 11 ; j++) {
        System.out.print(solution[i][j] + " "); 
    
    } 
    System.out.println(); 

} 

*/ 


} 


//This method is used when the player makes a move. It changes the dashes on the board to either an 'X' or an 'O'
        public void move(int row, int col) {

            if (solution[row][col] == 'A') {
                myMap[row][col] = 'X';
                System.out.println("It's a hit! "); 
                hits++;

            }

            else if (solution[row][col] == 'B') {
                myMap[row][col] = 'X';
                System.out.println("It's a hit!"); 
                hits++;
 

            }

            else if (solution[row][col] == 'C') {
                myMap[row][col] = 'X';
                System.out.println("It's a hit!"); 
                hits++;


            }

            else if (solution[row][col] == 'D') {
                myMap[row][col] = 'X';
                System.out.println("It's a hit!"); 
                hits++;


            }

            else if (solution[row][col] == '-') {
                myMap[row][col] = 'O'; 
                System.out.println("Miss! "); 
                misses++;
            } 


        }

//Prints myMap
        public static void printMap() { // changed this to static 
            printMap(myMap);
        }


//Prints solution 
        public static void printSolution() {
            printMap(solution); 
        }
  
        //Print map method 
        private static void printMap(char[][] map) {
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


//Checks each ship to see if it has been sunk yet 
//If it has been sunk, one will be added to the shipsSunk counter 
/* One will also be added to the individual counter for each ship so that the method won't be called on again if the ship has already been sunk 
(This will be used in the shipsSunk method above) */
        public void shipsSunkAircraft() { 

            if (myMap[1][1] == 'X' && myMap[1][2] == 'X' && myMap[1][3] == 'X' && myMap[1][4] == 'X' && myMap[1][5] == 'X') {
                shipsSunk++; 
                shipsSunkA++; 
                System.out.println("The Aircraft has been sunk! "); 

            }

        } 

        public void shipsSunkCruiser() { 
            
            
            if (myMap[8][1] == 'X' && myMap[8][2] == 'X' && myMap[8][3] == 'X') {
                shipsSunk++; 
                shipsSunkC++; 
                System.out.println("The Cruiser has been sunk! "); 
            } 



        } 

        public void shipsSunkDesOne () {

                if (myMap[4][8] == 'X' && myMap[5][8] == 'X') {
                    shipsSunk++; 
                    shipsSunkD1++; 
                    System.out.println("One of the destroyers have been sunk! "); 


                }
            


        }

        public void shipsSunkDesTwo() {

                if (myMap[7][5] == 'X' && myMap[7][6] == 'X') {
                    shipsSunk++; 
                    shipsSunkD2++; 
                    System.out.println("One of the destroyers have been sunk! "); 


                }


        

        }


        public void shipsSunkBattleship() { 

                if (myMap[3][3] == 'X' && myMap[4][3] == 'X' && myMap[5][3] == 'X' && myMap[6][3] == 'X') {
                    shipsSunk++; 
                    shipsSunkB++; 
                    System.out.println("The Battleship has been sunk!");
                }

        }

        

        //Checks to see if number of ships sunk is equal to 5. If it is, then the game will end and the user has won. 
        public boolean didIWin() {

            if (shipsSunk == 5) {
                return true; 
            }

            else {
                return false; 
            }
        }

    } 


