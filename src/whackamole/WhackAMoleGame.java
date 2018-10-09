package whackamole;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WhackAMoleGame {
    // instance variable fields
    // need 3 main variables
    int score;
    int molesLeft;
    int attemptsLeft;
    char[][] molGrid; //creates a 2D array of chars

    // Constructor
    // method to create a new instance of class
    WhackAMoleGame (int attemptsLeft, int gridDimension){
        this.score = 0;
            // TODO fix variables of molesLeft & attemptsLeft.
        this.molesLeft = 0;
        this.attemptsLeft = 0;
        this.molGrid = new char[gridDimension][gridDimension];
    }

    /*TODO - update playing of num of moles..:
    * update place method to keep placing moles until target
    * moles count has reached... using while statement?
     */

    // TODO implement boolean place(int x, int y);
    // getter & setter functions
    public boolean place(int x, int y){
            // check if slot is empty
         if (this.molGrid[x][y] != 'M'){
             // code for empty slot
             // place mole at x,
             this.molGrid[x][y] = 'M';
             this.molesLeft++;
             System.out.println("Now there are a total of " +
                     this.molesLeft + " left.");
             return true;

                }else{
                    //code for not empty slot
                    System.out.println("There is a mole here!");
                    return false;
                }
    }


    public void whack(int x, int y){
        if (this.molGrid[x][y] == 'M'){
            //code for true case
            this.score ++;
            this.molesLeft--;
            System.out.println("There are " + this.molesLeft + " moles left.");
            System.out.println("Your score is now " + this.score + ".");
        }else{
            //code for false case
            System.out.println("now you have " + this.attemptsLeft + " attempts left.");
        }
        this.attemptsLeft--;
    }

    //TODO print GRID method
    /*
    void printGridToUser() – Print the grid without showing where the moles are. For every spot that has
    recorded a “whacked mole,” print out a W, or * otherwise.
     */
    public void printGrid(){
               // using for loop - input '*' in each slot of the 2D array
        for (char index = 0; index < this.molGrid.length; index++){
            for (char iB = 0; iB < this.molGrid[0].length; iB++){
                this.molGrid[index][iB] = '*';
            }
        }

        for (int i =0; i < 10; i++){
            int x = new Random().nextInt(10);
            int y = new Random().nextInt(10);
            this.place(x,y);
        }

                // print entire GRID out 2D array
        for (char[] a : this.molGrid){
            for (char i : a){
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }

    }
        //TODO write CllientGrid to show user where attmepted whack was and how grid looks like.
    public void ClientGrid(){
        // Show the grid to the client
        // get inputs from clients on whack attempts assign a W on Client Side grid
        for (char indexRow = 0; indexRow < this.molGrid.length; indexRow++){
            for (char indexCol = 0; indexCol < this.molGrid[0].length; indexCol++){

            }
        }

    }

    public static void main(String[] args){
        // only ask user input in the main method
        // below is an examples
        WhackAMoleGame wais;
        wais = new WhackAMoleGame(50,10);

        //TODO generate grid with 10 moles
        //wais.genMoles(int 10);  <- something like that
        //

        wais.printGrid();

        while (wais.molesLeft > 0) {
            // get set of x,y coordinates
            Scanner in = new Scanner(System.in);
            int CoordinateX;
            int CoordinateY;
            System.out.println("type the x coordinate: ");
            CoordinateX = in.nextInt();
            System.out.println("type y coordinate: ");
            CoordinateY = in.nextInt();

            if((CoordinateX == -1) && (CoordinateY == -1)) {
                //end the game
                System.out.println("Thank you for playing you have chosen to end the game!");
                // TODO print entire grid to user
                //wais.printGrid
                break;

            }else {
                wais.whack(CoordinateX,CoordinateY);
            }

        }

        System.out.println("\n"); //create line space
        System.out.println("You have "+wais.attemptsLeft+" attempts left.");
        System.out.println("\n"); //create line space

    }

}
