package n2exercici2;

import java.util.*;
import java.util.stream.Collectors;

/* - Exercici 2
    Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers.
    Cada element ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o”
    si el nombre és imparell. Per exemple, si la llista d’entrada és (3, 55, 44),
    la sortida ha de ser “o3, o55, e44”. Imprimeix el resultat.*/

public class N2exercici2 {

    public static void main(String[] args) {

        List<Integer> kualaLumpuro = new ArrayList<>(
                Arrays.asList( 3, 5, 9, 2, 44, 89, 28));

        List<String> collect = kualaLumpuro.stream()
                .map(a -> (a %2 == 0 ? "e" + a : "o" + a))
                .collect(Collectors.toList());

        System.out.println(collect);

    }

}
















       /* One reference to kkep in mind
        String pair = stream1
                .filter(i -> i % 2 != 0)
                .map(n -> n * n)
                .collect(StringBuilder::new,
                        (builder, n) -> builder.append(",e").append(n),
                        (x, y) -> x.append(",").append(y)).substring(1);

        System.out.println(pair);
     */
