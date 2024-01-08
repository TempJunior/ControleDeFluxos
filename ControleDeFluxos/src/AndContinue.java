public class AndContinue {
    public static void main (String [] args){
        for(int contador = 0; contador <=100; contador++){
            if(contador%5!=0){
                continue;
            }
            System.out.println("Contador: " + contador);
        }
    }
    }
