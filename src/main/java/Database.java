import java.util.ArrayList;

public class Database {

    private ArrayList<Superhelt> superhelte = new ArrayList<>();


    public void lavSuperhelt(String superhelteNavn, String superkræfter, String rigtigeNavn, String erMenneske, int årSkabt, double styrke) {
        Superhelt superhelt = new Superhelt(superhelteNavn, superkræfter, rigtigeNavn, erMenneske, årSkabt, styrke);
        superhelte.add(superhelt);
    }

    public void visSuperhelteListe() {
        if(superhelte.isEmpty()) {
            System.out.println("Her er ingen superhelte endnu!");
        } else {
            for (Superhelt liste : superhelte) {
                System.out.println("Superhelt: " + liste.getSuperhelteNavn());
                System.out.println("Superkræfter: " + liste.getSuperkræfter());
                System.out.println("Rigtige navn: " + liste.getRigtigeNavn());
                System.out.println("Er menneske: " + liste.getErMenneske());
                System.out.println("År skabt: " + liste.getÅrSkabt());
                System.out.println("Styrke: " + liste.getStyrke());
            }
        }
    }

    public void søgEfterSuperhelt(String superhelteNavn) {

        for (Superhelt søgning : superhelte) {
            if(søgning.getSuperhelteNavn().equals(superhelteNavn)) {
                System.out.println("Denne helt er oprettet: " + søgning.getSuperhelteNavn());
            }

            else if(søgning.getSuperhelteNavn().startsWith(superhelteNavn)) {
                System.out.println("Denne helt er oprettet: " + søgning.getSuperhelteNavn());
                break;
            }

        }

    }

    public void redigerSuperhelt(int superhelteId, String superhelteNavn, String superkræfter, String rigtigeNavn, String erMenneske, int årSkabt, double styrker) {
        Superhelt superhelt = superhelte.get(superhelteId - 1);
        if(!superhelteNavn.isEmpty()) {
            superhelt.setSuperhelteNavn(superhelteNavn);
        }
        if (!superkræfter.isEmpty()) {
            superhelt.setSuperkræfter(superkræfter);
        }
        if (!rigtigeNavn.isEmpty()) {
            superhelt.setRigtigeNavn(rigtigeNavn);
        }
        if (!erMenneske.isEmpty()) {
            superhelt.setErMenneske(erMenneske);
        }
        if (årSkabt != 0) {
            superhelt.setÅrSkabt(årSkabt);
        }
        if (styrker != 0) {
            superhelt.setStyrke(styrker);
        }
    }

    public void printsuperhelteliste() {
        for (int i=0; i<superhelte.size(); i++) {
            System.out.println(i+1 + ":" + superhelte.get(i));
        }
    }

}