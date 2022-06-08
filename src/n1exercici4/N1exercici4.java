package n1exercici4;

import java.util.ArrayList;
import java.util.List;

    /* Exercici 4
    Fer la mateixa impressió del punt anterior, però mitjançant method reference. */

public class N1exercici4 {

    private static List<String> months = new ArrayList<>(

            List.of("Enero","Febrero", "Marzo",
                    "Abril","Mayo","Junio",
                    "Julio","Agosto","Septiembre",
                    "Octubre","Noviembre","Diciembre"));

    public static void main(String[] args) {

        //Method of reference
        months.forEach(System.out::println);

    }

}
