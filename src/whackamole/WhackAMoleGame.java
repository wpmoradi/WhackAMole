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
    ArrayList<String> moleGrid;
    char[][] molGridB; //creates a 2D array of chars

    //TODO create user system input...


    // Constructor
    // method to create a new instance of class
    WhackAMoleGame (int score, int gridDimension){
        this.score = score;
            // TODO fix variables of molesLeft & attemptsLeft.
        this.molesLeft = 3;
        this.attemptsLeft = 2;
        // TODO figure out how to make a 2D array
        this.moleGrid = new ArrayList<String>(3);
        this.molGridB = new char[gridDimension][gridDimension];
    }

    public static void main(String[] args){
        // only ask user input in the main method

        // below is an examples
        WhackAMoleGame wais;
        wais = new WhackAMoleGame(15,10);

        System.out.println("Congrats your score is: "+ wais.score+".");
        System.out.println("You have to whack "+wais.molesLeft+" more moles.");
        System.out.println("You have "+wais.attemptsLeft+" attempts left.");
            //String Array
        wais.moleGrid.add("Patriss");
        wais.moleGrid.add("Wais");
        wais.moleGrid.add("Moradi");
        wais.moleGrid.add("Lais");
        System.out.println("The length of the moleGrid is: " +
                wais.moleGrid.size() + ".");
        System.out.println(wais.moleGrid);
        System.out.println("\n"); //create line space



        // moleGridB
        /***
         * Can find array dimensions via .:
         * rows by: moleGrid.length
         * columns by: moleGrid[0].length
         */

        // using for loop - input 'M' in each slot of the 2D array
        for (char index = 0; index < wais.molGridB.length; index++){
            for (char iB = 0; iB<wais.molGridB[0].length; iB++){
                wais.molGridB[index][iB] = 'M';
            }
        }



        wais.molGridB[0][0] = 'e';
        // print the 2D array
        for (char[] a : wais.molGridB){
            for (char i : a){
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Below is MoleGridB: " +
                Arrays.deepToString(wais.molGridB));

    }

}
