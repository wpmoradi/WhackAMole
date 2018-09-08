package whackamole;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WhackAMoleGame {
    // instance variable fields
    // need 3 main variables
    int score;
    int molesLeft;
    int attemptsLeft;
    char[][] molGrid; //creates a 2D array of chars

    //TODO create user system input...


    // Constructor
    // method to create a new instance of class
    WhackAMoleGame (int score, int gridDimension){
        this.score = score;
            // TODO fix variables of molesLeft & attemptsLeft.
        this.molesLeft = 3;
        this.attemptsLeft = 2;
        this.molGrid = new char[gridDimension][gridDimension];
    }

    public static void main(String[] args){
        // only ask user input in the main method

        // below is an examples
        WhackAMoleGame wais;
        wais = new WhackAMoleGame(15,10);

        System.out.println("Congrats your score is: "+ wais.score+".");
        System.out.println("You have to whack "+wais.molesLeft+" more moles.");
        System.out.println("You have "+wais.attemptsLeft+" attempts left.");

        System.out.println("\n"); //create line space



        // moleGridB
        /***
         * Can find array dimensions via .:
         * rows by: moleGrid.length
         * columns by: moleGrid[0].length
         */

        // using for loop - input 'M' in each slot of the 2D array
        for (char index = 0; index < wais.molGrid.length; index++){
            for (char iB = 0; iB<wais.molGrid[0].length; iB++){
                wais.molGrid[index][iB] = 'M';
            }
        }



        wais.molGrid[0][0] = 'e';
        // print the 2D array
        for (char[] a : wais.molGrid){
            for (char i : a){
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Below is MoleGridB: " +
                Arrays.deepToString(wais.molGrid));

    }

}
