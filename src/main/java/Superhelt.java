public class Superhelt {

    private String superhelteNavn;
    private String styrker;
    private int årSkabt;
    private String erMenneske;

    public Superhelt(String superhelteNavn, String styrker, String erMenneske, int årSkabt) {
        this.superhelteNavn = superhelteNavn;
        this.styrker = styrker;
        this.erMenneske = erMenneske;
        this.årSkabt = årSkabt;
    }
    public String getSuperhelteNavn() {
        return superhelteNavn;
    }
    public String getStyrker() {
        return styrker;
    }
    public int getÅrSkabt() {
        return årSkabt;
    }
    public String getErMenneske() {
        return erMenneske;
    }

    public void setSuperhelteNavn(String superhelteNavn) {
        this.superhelteNavn = superhelteNavn;
    }

    public void setStyrker(String styrker) {
        this.styrker = styrker;
    }

    public void setÅrSkabt(int årSkabt) {
        this.årSkabt = årSkabt;
    }

    public void setErMenneske(String erMenneske) {
        this.erMenneske = erMenneske;
    }

    public String toString () {
        return superhelteNavn + ", " + styrker + ", " + erMenneske + ", " + årSkabt;
    }

}

