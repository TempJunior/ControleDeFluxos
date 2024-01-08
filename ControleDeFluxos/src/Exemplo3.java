import java.util.Scanner;

public class Exemplo3 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero:");

        int Numero = s.nextInt();

        if (Numero >8){
            System.out.println(Numero + " É maior que 8");
        }else{
            System.out.println (Numero + " É menor que 8");
        }


    }
}
