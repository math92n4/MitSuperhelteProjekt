import java.util.InputMismatchException;
import java.util.Scanner;

public class Interface {

    Scanner s = new Scanner(System.in);
    Database database = new Database();
    private void startProgram() {
        System.out.println("Velkommen til superhelteprogrammet");
    }
    private void menuvalg() {
        int menuvalg;

        do {

            System.out.println("----------------------------");
            System.out.println("1) Opret superhelt");
            System.out.println("2) Oversigt over superhelte");
            System.out.println("3) Søg efter superhelt");
            System.out.println("4) Rediger superhelt");
            System.out.println("5) Slet superhelt");
            System.out.println("9) Aflsut");
            System.out.println("----------------------------");

            menuvalg = s.nextInt();
            s.nextLine();
            //TODO: try catch


            if (menuvalg == 1) {
                System.out.println("Indtast navnet på din superhelt: ");
                String superhelteNavn = s.nextLine();

                System.out.println("Indtast superkræfter: ");
                String superkræfter = s.nextLine();

                System.out.println("Indtast virkelige navn: ");
                String rigtigeNavn = s.nextLine();

                System.out.println("Er superhelten et menneske? (ja/nej)");
                String erMenneske = s.next();
                //TODO: toString, boolean menneske = erMenneske.equalsIgnoreCase("ja") ? true : false;

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

                System.out.println("Indtast styrke: ");
                boolean validStyrke = false;
                double styrke = 0;
                while (!validStyrke) {
                    try {
                        styrke = s.nextDouble();
                        validStyrke = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Forkert input, prøv igen");
                        s.nextLine();
                    }
                }

                database.lavSuperhelt(superhelteNavn, superkræfter, rigtigeNavn, erMenneske, årSkabt, styrke);
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

                System.out.println("Indtast virkelige navn: ");
                String rigtigeNavn = s.nextLine();
                s.nextLine();

                System.out.println("Er superhelten et menneske? (ja/nej)");
                String erMenneske = s.next();
                //TODO: boolean, toString
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

                System.out.println("Indtast styrke: ");
                boolean validStyrke = false;
                double styrke = 0;
                while (!validStyrke) {
                    try {
                        styrke = s.nextDouble();
                        validStyrke = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Forkert input, prøv igen");
                        s.nextLine();
                    }
                }

                database.redigerSuperhelt(superhelteId, superhelteNavn, superkræfter, rigtigeNavn, erMenneske, årSkabt, styrke);

            } else if (menuvalg == 5) {
                System.out.println("Hvilken superhelt skal slettes?");
                database.printsuperhelteliste();
                int superhelteIndex = s.nextInt();
                database.sletSuperhelt(superhelteIndex);
                //TODO: try catch

            } else if (menuvalg == 9) {
                System.out.println("Programmet afluttes");
            }

        } while (menuvalg != 9);
    }
    public void start() {
        startProgram();
        menuvalg();
    }


}