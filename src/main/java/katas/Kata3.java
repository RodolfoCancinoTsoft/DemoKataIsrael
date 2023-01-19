package katas;

public class Kata3 {

    public static int maximoComunDivisor(int numero1, int numero2){

        int resultadocambio;
        while (numero2 != 0) {
            resultadocambio = numero2;
            numero2 = numero1 % numero2;
            numero1 = resultadocambio;
        }
        return numero1;
    }


}
