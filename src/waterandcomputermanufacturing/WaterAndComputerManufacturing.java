/*
 * Evan Robertson
 * October 1st 2018
 * calculate and output the total number of tons of water used to manufacture computer
 */

package waterandcomputermanufacturing;

import java.util.Scanner;

/**
 *
 * @author evrob0095
 */
public class WaterAndComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        //Variables
        int computers;
        int monitors;
        double combo;
        double total;
        
        //Inputs
        System.out.println("How many computer systems to you own?");
        computers = keyedInput.nextInt();
        System.out.println("How many monitors do you own?");
        monitors = keyedInput.nextInt();
        
        //Calculations
        combo = computers*1 + monitors*0.5;
        total = combo;
        
        //Execution
        System.out.println("Wowow! I took " + total + " tons of water to manufacture all of that");
        
   }
    
}
