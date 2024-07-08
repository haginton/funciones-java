package metodo;

public class UsoMetodos {
    public static void main(String[] args) {
        UsoMetodos.saludar("Harrison");
        System.out.println(UsoMetodos.inviertePalabra("Soy un texto"));
    }

    private static void saludar(String nombre){
        System.out.println("Hola te llamas " + nombre);
    }

    private static String inviertePalabra(String texto){
        return new StringBuilder(texto).reverse().toString().trim();
    }

    //firma metodo
    //modificador de acceso - ambito (opcional static) - valor retorno (void si no retorna algo) - nombre metodo - parametros
}
