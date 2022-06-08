package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    /** Exercici 1
    Crea una llista de cadenes amb noms propis. Escriu un mètode que retorna una
    llista de totes les cadenes que comencen amb la lletra 'A' (majúscula) i tenen exactament
    3 lletres. Imprimeix el resultat.
    */

public class N2exercici1 {

    public static void main(String[] args) {

        List<String> kualaLumpuro = new ArrayList<>(Arrays.asList(
                "Ana","angelica","Alba","Aba","Segismundo","Braulio"));


        kualaLumpuro.stream()
                .filter(sc -> sc.startsWith("A"))
                .filter(sc -> sc.length() <= 3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

}
