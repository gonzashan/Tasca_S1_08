package n2exercici3;

    /** Exercici 3
    Crea una Functional Interface que contingui un mètode anomenat operacio().
    Aquest mètode ha de retornar un float. Injecta a la interfície creada mitjançant
    una lambda, el cos del mètode, de manera que es pugui transformar l’operació
    amb una suma, una resta, una multiplicació i una divisió.**/


public class N2exercici3 {

    private static float action(float a, float b, IntefaceOperacio op) {

        return op.operacio(a,b);
    }

    public static void main(String[] args) {

        IntefaceOperacio sumar = Float::sum;
        IntefaceOperacio restar = (a, b) -> a - b;
        IntefaceOperacio multiplicacio = (a, b) -> a * b;
        IntefaceOperacio divisio = (a, b) -> a / b;

        System.out.printf("%-13s %-10s = %s\n","sumar","(68 + 1)", action(68, 1, sumar));
        System.out.printf("%-13s %-10s = %s\n","restar","(667 - 1)", action(667, 1, restar));
        System.out.printf("%-13s %-10s = %s\n","multiplicar","(1 * 76)" , action(1, 76, multiplicacio));
        System.out.printf("%-13s %-10s = %s\n","divisió","(10 / 2)", action(20, 2, divisio));

    }
}
