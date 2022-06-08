package n2exercici4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

    /* Exercici 4
    Crea una llista que contingui algunes cadenes de text i nombres.**/

public class N2exercici4 {

    public static void main(String[] args) {

        List<String> lista = Arrays.asList("9", "Ana", "Zamore", "1"
                , "Bernarda", "Yoqui", "4", "Encarna", "Pogote");

        // 1 by alphabetical
        printHead("Alfabéticamente");
        lista.stream()
             .sorted()
             .collect(Collectors.toList())
             .forEach(System.out::println);

        // 2 by character "e" contained into string
        printHead("Primero cadenas que contiene 'e' o 'E' ");
        lista.stream()
             .sorted(
                        Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)))
             .collect(Collectors.toList()).forEach(System.out::println);

        // 3 replacing, at any string, character 'a' by character '4'
        printHead("Remplazar en las cadenas el carácter 'a' por '4' ");
        lista.stream()
             .map(c -> c.contains("a")? c.replace("a", "4") : c)
             .sorted()
             .collect(Collectors.toList())
             .forEach(System.out::println);

        // 4 showing only numerics elements
        printHead("Mostrar solo valores numéricos");
        lista.stream()
             .filter(c -> c.matches("^[0-9]*$"))
             .collect(Collectors.toList())
             .forEach(System.out::println);
    }

    public static void printHead(String message) {
        System.out.println("*** " + message + " ***");
        System.out.println("---------------------------------");
    }

}
