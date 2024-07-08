package recursividad;

public class FactorialNumero {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Factorial del numero " + numero + " es: " + calculaFactorial(numero));
    }

    private static int calculaFactorial(int numero){
        if (numero == 0){
            return 1;
        }else {
            return numero * calculaFactorial(numero - 1);
        }
    }
}
