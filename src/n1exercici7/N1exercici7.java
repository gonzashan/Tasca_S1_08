package n1exercici7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*  Exercici 7
    Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.*/

public class N1exercici7 {

    public static void main(String[] args) {

        List<Object> kualaLumpur = new ArrayList<>(Arrays.asList(
                7, "Magníficos", "Los Odiosos", 8,
                "Ocean's Eleven", 12, "Monos", 800,
                "balas", "Viernes", 13, 7, "seven",
                "Alien", 9, "Semanas y media"));


        kualaLumpur.stream()
                .filter(sc -> sc instanceof String)
                .map(sc -> (String) sc)
                .sorted(new Comparator<String>() {
                    @Override //to sort alphabetically while ignoring sensitive case
                    public int compare(String o1, String o2) {
                        return o1.compareToIgnoreCase(o2);} })
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

}
