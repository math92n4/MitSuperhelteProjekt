import java.util.InputMismatchException;
import java.util.Scanner;

public class Interface {

    public void startProgram() {

        Scanner s = new Scanner(System.in);
        Database database = new Database();

        System.out.println("Velkommen til superhelteprogrammet");
        int menuvalg;

        do {

            System.out.println("----------------------------");
            System.out.println("1) Opret superhelt");
            System.out.println("2) Oversigt over superhelte");
            System.out.println("3) Søg efter superhelt");
            System.out.println("4) Rediger superhelt");
            System.out.println("9) Aflsut");
            System.out.println("----------------------------");


            menuvalg = s.nextInt();
            s.nextLine();


            if (menuvalg == 1) {
                System.out.println("Indtast navnet på din superhelt: ");
                String superhelteNavn = s.nextLine();

                System.out.println("Indtast superkræfter: ");
                String superkræfter = s.nextLine();

                System.out.println("Er superhelten et menneske? (ja/nej)");
                String erMenneske = s.nextLine();
                // boolean menneske = erMenneske.equalsIgnoreCase("ja") ? true : false;

                System.out.println("Indtast året hvor superhelten er skabt: ");
                boolean validInput = false;
                int årSkabt = 0;
                while (!validInput) {
                    try {
                        årSkabt = s.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Forkert input, prøv igen");
                        s.nextLine();
                    }
                }

                database.lavSuperhelt(superhelteNavn, superkræfter, erMenneske, årSkabt);
            }

            else if (menuvalg == 2) {
                System.out.println("Oversigt over superhelte!");
                database.visSuperhelteListe();

            } else if (menuvalg == 3) {
                System.out.println("Indtast søgning: ");
                String superhelteNavn = s.nextLine();
                database.søgEfterSuperhelt(superhelteNavn);

            } else if (menuvalg == 4) {
                System.out.println("Hvilken superhelt skal redigeres?");
                database.printsuperhelteliste();
                boolean validInput = false;
                int superhelteId = 0;
                while (!validInput) {
                    try {
                        superhelteId = s.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Forkert input, prøv igen");
                        s.nextLine();
                    }
                }


                System.out.println("Indtast navnet på din superhelt: ");
                String superhelteNavn = s.next();

                System.out.println("Indtast superkræfter: ");
                String superkræfter = s.next();

                System.out.println("Er superhelten et menneske? (ja/nej)");
                String erMenneske = s.next();
                // boolean menneske = erMenneske.equalsIgnoreCase("ja") ? true : false;

                System.out.println("Indtast året hvor superhelten er skabt: ");
                boolean validInputÅr = false;
                int årSkabt = 0;
                while (!validInputÅr) {
                    try {
                        årSkabt = s.nextInt();
                        validInputÅr = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Forkert input, prøv igen");
                        s.nextLine();
                    }

                }

                database.redigerSuperhelt(superhelteId, superhelteNavn, superkræfter, erMenneske, årSkabt);

            } else if (menuvalg == 9) {
                System.out.println("Programmet afluttes");
            }

        } while (menuvalg != 9);

    }

}