
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Windely
 */
public class Ej10 {
   


    public static void main(String[] args) {
        String texto = "Febrero es un mes curioso, ya que para cuadrar el calendario, un año bisiesto debe ser divisible entre 4, salvo que sea año secular -el último de cada siglo, terminado en 00- en cuyo caso también ha de ser divisible entre 400. De esta manera, nunca existirá el 30/02/ de cualquier año, pero sí el 29/02/2024. En consecuencia, este año no hay 29/02/2026, ni existió el 29/02/1900, pero sí el 29/02/2000. Por otro lado, hay meses que no tienen 31 días, y por eso no existe el 31/09/2025, al igual que no existió el 31/11/2024, pero sí el 30/11/2014. Adicionalmente, hay fechas que no cumplen el formato que nosotros hemos diseñado, por ejemplo el 13-2-2025, aunque conceptualmente sea una fecha válida. Por cierto, hoy es 13/02/2025.";

        // Expresión regular para dd/mm/yyyy
        Pattern patron = Pattern.compile("\\b(\\d{2})/(\\d{2})/(\\d{4})\\b");
        Matcher matcher = patron.matcher(texto);

        while (matcher.find()) {
            int dia = Integer.parseInt(matcher.group(1));
            int mes = Integer.parseInt(matcher.group(2));
            int anio = Integer.parseInt(matcher.group(3));

            if (esFechaValida(dia, mes, anio)) {
                System.out.println("Fecha válida: " + matcher.group());
            }
        }
    }

    public static boolean esFechaValida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) return false;

        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Comprobar año bisiesto
        if (esBisiesto(anio)) {
            diasMes[1] = 29; // febrero
        }

        return dia >= 1 && dia <= diasMes[mes - 1];
    }

    public static boolean esBisiesto(int anio) {
        // Regla completa: divisible por 4, excepto si es secular y no divisible por 400
        if (anio % 4 != 0) return false;
        if (anio % 100 == 0 && anio % 400 != 0) return false;
        return true;
    }
} //class
