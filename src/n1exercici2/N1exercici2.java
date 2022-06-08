package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//Exercici 2
//A partir d’una llista de Strings, escriu un mètode que retorna una llista
// de totes les cadenes que contenen la lletra ‘o’ i també tenen més de 5 lletres. Imprimeix el resultat

public class N1exercici2 {

    private static List<String> listA = new ArrayList<>(
            List.of("elemento nitro",
                    "elementa",
                    "Pomposo",
                    "manzana",
                    "oso"));

    public static void main(String[] args) {

        // letter to filter the string list
        String letterToFind = "o";
        // length to filter the string list
        int length = 5;
        int sizeList = getLetterOFromList(listA, letterToFind,length).size();

        if (sizeList > 0) {

            System.out.println( "\nLa lista contiene " + sizeList
                        + " elementos con la letra '"
                        + letterToFind.toUpperCase() + "' - '"
                        + letterToFind.toLowerCase() +"', y de longitud mayor de "
                        + length + ".\n" +
                       getLetterOFromList(listA, letterToFind,length));

        } else System.out.println("La lista no contiene elementos con la letra " + letterToFind);


    }

    public static List<String> getLetterOFromList(
                                         List<String> list,
                                                  String letterToFind,
                                                  int length)
    {
        return list.stream()
                .filter(c -> c.contains(letterToFind.toLowerCase()))
                .filter(c -> c.length() > length)
                .collect(Collectors.toList());
    }

}
