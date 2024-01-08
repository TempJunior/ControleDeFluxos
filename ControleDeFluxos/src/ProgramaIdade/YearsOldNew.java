package ProgramaIdade;

import java.util.Scanner;

public class YearsOldNew {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int Idade = s.nextInt();
        String Idadest = getIdade(Idade);
        System.out.println(Idadest);
    }

    public static String getIdade(int Idade) {
     if (Idade >= 0 && Idade <= 5){
         return "You are a baby";
     }else if (Idade >=6 && Idade <=10){
         return "You are a kid";
     }else if (Idade >= 11 && Idade <=18 ){
         return "You are a teen";
     }else if (Idade >= 19 && Idade <= 40){
         return "You are adult";
     }else {
         return "You are a Grandpa";
     }


    }
}