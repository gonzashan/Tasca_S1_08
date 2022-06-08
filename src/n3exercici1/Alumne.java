package n3exercici1;

public class Alumne {

    private String nom;
    private int edad;
    private String curs;
    private int nota;

    public Alumne(String nom, int edad, String curs, int nota) {
        this.nom = nom;
        this.edad = edad;
        this.curs = curs;
        this.nota = nota;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(byte nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("[%-3s '%-10s' %-3s %-3s %-5s %s %-5s %s\n"
                ,"nom:",this.getNom(),"edat:",this.getEdad(),"curs:",this.getCurs(),"nota:",this.getNota());

    }
}
