public class Superhelt {

    private String superhelteNavn;
    private String superkræfter;
    private String rigtigeNavn;
    private int årSkabt;
    private String erMenneske;
    private double styrke;

    public Superhelt(String superhelteNavn, String superkræfter, String rigtigeNavn, String erMenneske, int årSkabt, double styrke) {
        this.superhelteNavn = superhelteNavn;
        this.superkræfter = superkræfter;
        this.rigtigeNavn = rigtigeNavn;
        this.erMenneske = erMenneske;
        this.årSkabt = årSkabt;
        this.styrke = styrke;
    }
    public String getSuperhelteNavn() {
        return superhelteNavn;
    }
    public String getSuperkræfter() {
        return superkræfter;
    }
    public String getRigtigeNavn() {
        return rigtigeNavn;
    }
    public int getÅrSkabt() {
        return årSkabt;
    }
    public String getErMenneske() {
        return erMenneske;
    }
    public double getStyrke() {
        return styrke;
    }

    public void setSuperhelteNavn(String superhelteNavn) {
        this.superhelteNavn = superhelteNavn;
    }

    public void setSuperkræfter(String superkræfter) {
        this.superkræfter = superkræfter;
    }

    public void setÅrSkabt(int årSkabt) {
        this.årSkabt = årSkabt;
    }

    public void setErMenneske(String erMenneske) {
        this.erMenneske = erMenneske;
    }
    public void setRigtigeNavn(String rigtigeNavn) {
        this.rigtigeNavn = rigtigeNavn;
    }
    public void setStyrke(double styrke) {
        this.styrke = styrke;
    }

    public String toString () {
        return superhelteNavn + ", " + superkræfter + ", " + rigtigeNavn + ", " + erMenneske + ", " + årSkabt + ", " + styrke;
    }

}

