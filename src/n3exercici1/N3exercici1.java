package n3exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

    /*Exercici 1
    Crea una classe Alumne amb els atributs: Nom, edat, curs i nota.
    Omple una llista amb 10 alumnes*/

public class N3exercici1 {

    public static void main(String[] args) {

        //Mostra per pantalla el nom i l’edat de cada alumne/a
        printHead("Llistat per nom i l'edat");
        getUnsortedEmployeeList().forEach((a) -> {
            System.out.printf("%-15s : %s\n", a.getNom(), a.getEdad());
        });

        // Filtra la llista per tots els alumnes que el seu nom comença per ‘a’.
        // Assigna a aquests alumnes a una altra llista i mostra per pantalla la nova llista
        // (tot amb lambdes).
        printHead("Llistat alumnes que que el seu nom comença per 'a' ");
        getUnsortedEmployeeList()
                .stream()
                .filter((a) -> a.getNom().toLowerCase().startsWith("a"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.
        printHead("Alumnes amb nota mayor igual de 5");
        getUnsortedEmployeeList()
                .stream()
                .filter((a) -> a.getNota() >= 5)
                .collect(Collectors.toList())
                .forEach(System.out::print);
        // Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP.
        printHead("Alumnes amb nota mayor igual de 5 i que estudian PHP");
        getUnsortedEmployeeList()
                .stream()
                .filter((a) -> a.getNota() >= 5 && a.getCurs().equalsIgnoreCase("php"))
                .collect(Collectors.toList())
                .forEach(System.out::print);
        // Mostra tots els alumnes que fan JAVA i són majors d’edat.
        printHead("Alumnes que estudian JAVA i majors d'edat");
        getUnsortedEmployeeList()
                .stream()
                .filter((a) -> a.getEdad() >= 18 && a.getCurs().equalsIgnoreCase("java"))
                .collect(Collectors.toList())
                .forEach(System.out::print);
    }

    private static ArrayList<Alumne> getUnsortedEmployeeList() {

        return new ArrayList<>(Arrays.asList(
                new Alumne("Paquito",    18, "JAVA", 2),
                new Alumne("LLuis",      18, "Go",   5),
                new Alumne("Pep",        18, "GO",   7),
                new Alumne("Andrés",     17, "JAVA", 9),
                new Alumne("Pablo",      18, "CSS",  2),
                new Alumne("Helena",     18, "CSS",  1),
                new Alumne("Segismundo", 18, "JAVA", 0),
                new Alumne("Anna",       11, "JAVA", 6),
                new Alumne("Rigoberta",  18, "PHP",  4),
                new Alumne("Rosalia",    46, "JAVA", 8)));
    }

    public static void printHead(String message) {
        System.out.println("\n*** " + message + " ***");
        System.out.println("---------------------------------");
    }
}
