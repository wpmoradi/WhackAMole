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
    WhackAMoleGame (int attemptsLeft, int gridDimension){
        this.score = 0;
            // TODO fix variables of molesLeft & attemptsLeft.
        this.molesLeft = 3;
        this.attemptsLeft = 2;
        this.molGrid = new char[gridDimension][gridDimension];

    }

    // TODO implement boolean place(int x, int y);
    // getter & setter functions
    public boolean place(int x, int y){
        // adjust for 0 indexing
        x--;
        y--;
            // check if slot is empty
         if (this.molGrid[x][y] == 0){
             // code for empty slot
             //place mole at x,
             this.molGrid[x][y] = 'M';
             System.out.println("its empty and mole placed here");
             //update num of moles left
             this.molesLeft++;
             System.out.println("Now there are a total of " +
                     this.molesLeft + " left.");
             System.out.println("\n");
             return true;

                }else{
                    //code for not empty slot
                    System.out.println("this slot is NOT empty. - no moles placed");
                    System.out.println("There is a mole here!");
                    return false;
                }
    }

    // TODO need to implement a mole counter


    public void whack(int x, int y){
        // TODO implement whack method
        x --; y--; //adjust for 0 indexing
        if (this.molGrid[x][y] == 'M'){
            //code for true case
            System.out.println("AHA!!! Here is a mole!!");
            this.score ++;
            this.molesLeft--;
            System.out.println("There are " + this.molesLeft + " moles left.");
            System.out.println("Your score is now " + this.score + ".");
        }else{
            //code for false case
        }

        System.out.println("you had " + this.attemptsLeft + " attempts left.");
        this.attemptsLeft--;
        System.out.println("now you have " + this.attemptsLeft + " attempts left.");

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


        wais.place(4,6);
        wais.place(10,10);
        wais.place(1,5);

        // print the 2D array
        for (char[] a : wais.molGrid){
            for (char i : a){
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }

        // attempt to whack moles
        wais.whack(2,2);
        wais.whack(10,10);

        /***
         * Can find array dimensions via .:
         * rows by: moleGrid.length
         * columns by: moleGrid[0].length
         */

        // using for loop - input 'M' in each slot of the 2D array
//        for (char index = 0; index < wais.molGrid.length; index++){
//            for (char iB = 0; iB<wais.molGrid[0].length; iB++){
//                wais.molGrid[index][iB] = '*';
//            }
//        }


        // print the 2D array
        for (char[] a : wais.molGrid){
            for (char i : a){
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }

    }

}
