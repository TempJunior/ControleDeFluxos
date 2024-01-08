package ProgramaIdade;

import java.util.Scanner;

public class YearsCod {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);

        System.out.println("How old are you? for class definition; ");
          int idade = s.nextInt();
          if (idade >= 0 && idade <=7) {
              System.out.println("You are a Children");
          }else if (idade >=8 && idade <=13) {
              System.out.println("You are a pre-teen");
          }else if (idade >=14 && idade <=18){
              System.out.println("You are a teen");
          }else if (idade >= 19 && idade <= 30){
              System.out.println("You are a adult");
          }else if (idade >=60 && idade <= 90){
              System.out.println("You are old");

          }
    }
}
