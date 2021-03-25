

//Write a java program which ask users to enter his/her name and prints Hello with Have a good day.

import java.util.Scanner;

class CWH_Ch1_PS3 {

    public static void main(String [] args){

    System.out.println("What is your name ?");
    Scanner sc = new Scanner(System.in);
    String name =sc.next();
    //String name ="Mahesh";
    System.out.println("Hello," + name + " Have a Good Day!");


    }
    
}
