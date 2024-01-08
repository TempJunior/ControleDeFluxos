package ProgramaIdade;

import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Do you want to generate the multiplication table of a number?");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Enter a number to generate the multiplication table; ");
            int num = s.nextInt();
            for (int i = 0; i <=10;i++){
                System.out.println(num + "X" + i + "=" + num*i);
            }
            System.out.println("Do you want to generate the multiplication table for a number again?");
            resposta = s.next();
        }
        System.out.println("Obrigado! ");
    }
}