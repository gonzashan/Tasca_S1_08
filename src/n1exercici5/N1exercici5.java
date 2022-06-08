package n1exercici5;

    /*- Exercici 5
    Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double.
    Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415.
    Invoca el mètode getPiValue() i imprimeix el resultat. */

public class N1exercici5 {


    public static void main(String[] args) {

        // Instance calling
        FunctionalInterface fdlp = x -> x;
        System.out.println(fdlp.getPiValue(3.1415));

    }
}
