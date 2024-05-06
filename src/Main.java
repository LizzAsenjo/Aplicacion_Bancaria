import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1599.99;
        int opcion;

        System.out.println("Cliente: Tony Stark");
        System.out.println("Cuenta Corriente con saldo inicial: $" + saldo);

        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("9. Salir");
            System.out.print("Escriba el número de la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el valor que desea retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("El saldo restante después de nuestro retiro es $" + saldo);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el valor que desea depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("El saldo actualizado con la adición o con el depósito es $" + saldo);
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}
