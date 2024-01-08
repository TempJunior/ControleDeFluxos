package ExemploSwitchCase;

import java.util.Scanner;

public class ScannerCod {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int Idade = s.nextInt();
        System.out.println("Voce tem " + Idade + " Anos");

    }
}
