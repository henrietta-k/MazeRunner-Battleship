import java.util.*;

public class Airplane extends Battleship {

//Uses inheritance here to inherit the Battleship class and make a new class called Airplane 
    public Airplane() {

        super(); 
        fillSolution();



    }

    //Overrides the fillSolution method in the inherited class because the plane is in a T-formation 
    public void fillSolution(){


        for (int a = 2; a < 7; a++) {
            Battleship.solution[2][a] = 'A';
        }

        for (int b = 3; b < 7; b++) {
            Battleship.solution[b][3] = 'B'; 
        }

        for (int c = 1; c < 4; c++) {
            Battleship.solution[8][c] = 'C'; 
        }


        for (int d = 4; d < 6; d++) {
            Battleship.solution[d][8] = 'D'; 
        }

        for (int e = 5; e < 7; e++) {
            Battleship.solution[7][e] = 'D'; 
        }

        Battleship.solution[3][4] = 'B'; 
        Battleship.solution[3][2] = 'B'; 

        Battleship.solution[4][7] = 'D'; 
        Battleship.solution[6][6] = 'D'; 
        Battleship.solution[8][6] = 'D'; 
        Battleship.solution[3][8] = 'D'; 

        Battleship.solution[7][1] = 'C'; 
        Battleship.solution[9][1] = 'C'; 

        Battleship.solution[1][6] = 'A'; 
        Battleship.solution[3][6] = 'A';

       //Battleship.printSolution(); 



    }

//Overrides the methods in the inherited class to check if an airplane has been hit since the airplane isn't the same shape as the battleships
    public void shipsSunkAircraft() { 


        if (Battleship.myMap[2][2] == 'X' && Battleship.myMap[2][2] == 'X' && Battleship.myMap[2][3] == 'X' && Battleship.myMap[2][4] == 'X' && Battleship.myMap[2][5] == 'X' && Battleship.myMap[1][6] == 'X' && Battleship.myMap[3][6] == 'X') {
            shipsSunk++; 
            shipsSunkA++; 
            System.out.println("The Aircraft has been sunk! "); 

        }
    } 

    public void shipsSunkCruiser() { 
        
        
        
        if (Battleship.myMap[8][1] == 'X' && Battleship.myMap[8][2] == 'X' && Battleship.myMap[8][3] == 'X' && Battleship.myMap[7][1] == 'X' && Battleship.myMap[9][1] == 'X') {
            shipsSunk++; 
            shipsSunkC++; 
            System.out.println("The Cruiser has been sunk! "); 

        } 



    } 

    public void shipsSunkDesOne () {

            if (Battleship.myMap[4][8] == 'X' && Battleship.myMap[5][8] == 'X' && Battleship.myMap[4][7] == 'X' && Battleship.myMap[3][8] == 'X') {
                shipsSunk++; 
                shipsSunkD1++; 
                System.out.println("One of the destroyers have been sunk! "); 



            }
        


    }

    public void shipsSunkDesTwo() {

            if (Battleship.myMap[7][5] == 'X' && Battleship.myMap[7][6] == 'X' && Battleship.myMap[6][6] == 'X' && Battleship.myMap[8][6] == 'X') {
                shipsSunk++; 
                shipsSunkD2++; 
                System.out.println("One of the destroyers have been sunk! "); 


            }



    }


    public void shipsSunkBattleship() { 

            if (Battleship.myMap[3][3] == 'X' && Battleship.myMap[4][3] == 'X' && Battleship.myMap[5][3] == 'X' && Battleship.myMap[6][3] == 'X') {
                shipsSunk++; 
                shipsSunkB++; 
                System.out.println("The Battleship has been sunk!");
            }

    }


    
}