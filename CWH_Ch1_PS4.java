//This java program converts Distance from kilometers to miles.

import java.util.Scanner;

class CWH_Ch1_PS4 {

    public static void main(String [] args)
    {

        double kilometers;

        System.out.print("Please Enter Kilometers :");

        Scanner in = new Scanner(System.in);
        kilometers = in.nextDouble();

        double miles = kilometers/1.6;

        System.out.println(miles+" Miles  ");
        
        
    }

    
}
