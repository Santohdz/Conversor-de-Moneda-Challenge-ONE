import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversor {

    public static void exibirMenu() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("""
                ********************************************************
                Bienvenido/a al Conversor de Moneda

                Elija una opción válida:

                1) Dólar => Peso Argentino
                2) Peso Argentino => Dólar
                3) Dólar => Real Brasileño
                4) Real Brasileño => Dólar
                5) Dólar => Peso Colombiano
                6) Peso Colombiano => Dólar
                7) Salir
                ********************************************************
                """);

            try {
                System.out.print("Ingrese su opción: ");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1 -> ConvertidorMoneda.convertirMoneda("USD", "ARS");
                    case 2 -> ConvertidorMoneda.convertirMoneda("ARS", "USD");
                    case 3 -> ConvertidorMoneda.convertirMoneda("USD", "BRL");
                    case 4 -> ConvertidorMoneda.convertirMoneda("BRL", "USD");
                    case 5 -> ConvertidorMoneda.convertirMoneda("USD", "COP");
                    case 6 -> ConvertidorMoneda.convertirMoneda("COP", "USD");
                    case 7 -> System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                    default -> System.out.println("Opción inválida. Intente de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debe ingresar un número.");
                teclado.nextLine();
            }

            System.out.println();
        }
    }
}

