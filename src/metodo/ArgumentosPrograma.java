package metodo;

public class ArgumentosPrograma {
    public static void main(String[] args) {
        /*for (String entrada : args){
            System.out.println(entrada);
        }*/
        if (args.length == 0){
            System.out.println("Digite un ambiente de ejecución de entrada (dev, qa, prod)");
        }

        switch (args[0]){
            case "dev" -> ArgumentosPrograma.ejecutaDev();
            case "qa" -> ArgumentosPrograma.ejecutaQA();
        }
        ModificadoresAcceso modificadoresAcceso = new ModificadoresAcceso();
        //modificadoresAcceso.sumar(5,6);
    }

    private static void ejecutaQA() {
        System.out.println("Ejecución desde qa");
    }

    private static void ejecutaDev() {
        System.out.println("Ejecución desde dev");
    }
}
