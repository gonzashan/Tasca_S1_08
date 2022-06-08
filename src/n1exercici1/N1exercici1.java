package n1exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//Exercici 1
//A partir d’una llista de Strings, escriu un mètode que retorna una llista
// de totes les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.

public class N1exercici1 {

    private static List<String> listA = new ArrayList<>(
            List.of("elemento nitro",
                    "elementa",
                    "Pomposo",
                    "manzana",
                    "oso"));

    public static void main(String[] args) {

        String letterToFind = "o";
        int sizeList = getLetterOFromList(listA, letterToFind).size();

        if (sizeList > 0) {

            System.out.println( "\nLa lista contiene " + sizeList
                        + " elementos con la letra '"
                        + letterToFind.toUpperCase() + "' - '"
                        + letterToFind.toLowerCase() +"'.\n" +
                       getLetterOFromList(listA, letterToFind));

        } else System.out.println("La lista no contiene elementos con la letra " + letterToFind);


    }

    public static List<String> getLetterOFromList(List<String> list, String letterToFind) {

        return list.stream().filter(c ->
                c.contains(letterToFind.toLowerCase())).collect(Collectors.toList());

    }

}
