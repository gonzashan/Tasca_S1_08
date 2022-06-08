package n1exercici3;

import java.util.ArrayList;
import java.util.List;

    /*- Exercici 3
    Crea una llista amb els noms dels mesos de l’any.
    Imprimeix tots els elements de la llista amb una lambda.*/

public class N1exercici3 {

    private static List<String> months = new ArrayList<>(

            List.of("Enero","Febrero", "Marzo",
                    "Abril","Mayo","Junio",
                    "Julio","Agosto","Septiembre",
                    "Octubre","Noviembre","Diciembre"));

    public static void main(String[] args) {

        months.forEach(c -> System.out.println(c) );

    }

}
