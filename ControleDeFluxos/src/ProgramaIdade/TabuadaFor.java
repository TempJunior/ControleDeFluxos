package ProgramaIdade;

import java.util.Scanner;

public class TabuadaFor {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a number to generate the multiplication table: ");
        int num = s.nextInt();
        for(int i = 0; i <=10; i++){
            System.out.println(num + "X" + i + "=" + num*i);
        }
    }
}
