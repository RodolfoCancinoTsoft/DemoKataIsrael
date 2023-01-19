package katas;

public class Kata2 {


    public static boolean numeroPrimo(int numero){

        if (numero <=1)
            return false;
        else if( numero == 2)
            return true;
        else {
            for (int i =2 ; i<numero; i++){
                if (numero % i == 0)
                    return false;
            }
            return true;
        }
    }
}


/* int contador=0;
        boolean primo = true;

        if ( numero <=1)
            return false;
        else if (numero == 2)
            return true;
        else {
            for (int i=2; i<=numero;i++){
                if (numero % i == 0){
                    contador++;
                }
            }
            if (contador == 2){
                System.out.println("Primo");
            }
            else {
                System.out.println("No Primo");
            }
            return true ;
            }*/
