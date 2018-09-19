package torresdehanoi;

public class ApiRecursividad {

    public static void main(String[] args) {
        System.out.println("Inicia el hilo de ejecución principal.");
        System.out.println("--------------------------------------------");

//        Editar el último parámetro para asignar el número de discos
        Recursividad.hanoi('A', 'B', 'C', 4);

        System.out.println("--------------------------------------------");
        System.out.println("Finaliza el main.");
    }

}
