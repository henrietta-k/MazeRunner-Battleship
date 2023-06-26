import java.util.*;

public class MazeRunner {
    static Maze myMap = new Maze(); 
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        intro(); 
        userMover(); 
        myMap.printMap(); 
    }

    public static void intro() {
        System.out.println("\nWelcome to the Maze Runner game! Here is what your maze currently looks like.  "); 
        System.out.println("The 'x' represents your current position and the '.' will turn into either walls ('-') or free space ('*')");
        myMap.printMap(); 
        dashedLines(); 
    }


    //Moves the piece in the direction specified by the user
    public static String userMover() {

        System.out.println("Where would you like to move? (R, L, U, D)"); 
        String userChoice = input.nextLine(); 

        if (userChoice.equals("R") || userChoice.equals("L") || userChoice.equals("U") || userChoice.equals("D")) {
            if (myMap.canIMoveRight() == true){
                myMap.moveRight(); 
            }
            if (myMap.canIMoveLeft() == true){
                myMap.moveLeft(); 
            }
            if (myMap.canIMoveUp() == true) {
                myMap.moveUp(); 
            }
            if (myMap.canIMoveDown() == true){
                myMap.moveDown(); 
            }
        }
        else {
            System.out.println("Your input isn't valid. "); 
        }
        String direction = ""; //use this for now
        return direction; 
    }
    
    public static void dashedLines() {

        System.out.println(); 
        for (int i = 1; i <=150; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
