import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


public class ConvertidorMoneda {

    public static void convertirMoneda(String monedaBase, String monedaObjetivo) {
        Scanner teclado = new Scanner(System.in);
        double cantidad = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Ingrese la cantidad de " + monedaBase + " que desea convertir a " + monedaObjetivo + ":");
                cantidad = teclado.nextDouble();

                if (cantidad <= 0) {
                    System.out.println("La cantidad debe ser mayor que cero.");
                } else {
                    entradaValida = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                teclado.nextLine();
            }
        }

        Double tasa = API.obtenerTasaCambio(monedaBase, monedaObjetivo);

        if (tasa != null) {
            double resultado = cantidad * tasa;

            NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.US);
            String cantidadFormateada = formatoMoneda.format(cantidad);
            String resultadoFormateado = formatoMoneda.format(resultado);

            switch (monedaObjetivo) {
                case "ARS" -> formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "AR"));
                case "BRL" -> formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
                case "COP" -> formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
                case "USD" -> formatoMoneda = NumberFormat.getCurrencyInstance(Locale.US);
            }
            resultadoFormateado = formatoMoneda.format(resultado);

        } else {
            System.out.println("No se pudo obtener la tasa de cambio. Intente más tarde.");
        }
    }
}
