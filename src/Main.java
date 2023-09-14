import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        Superhero superhero = new Superhero();
        Scanner scanner = new Scanner(System.in);
        while (true) { //Loop så den køre flere gange
            System.out.println("WELCOME TO THE SUPER HERO DATA BASE!");
            System.out.println("Press 1 if you want to create a superhero");
            System.out.println("Press 2 if you want to exit this program");
            int brugerValg = scanner.nextInt();
            if (brugerValg == 1) {

                System.out.println("Insert superhero name");
                String name = scanner.next();
                superhero.setName(name);

                System.out.println("Insert real name");
                String realname = scanner.next();
                superhero.setRealName(realname);

                System.out.println("Insert the superpower");
                String superPower = scanner.next();
                superhero.setSuperPower(superPower);

                System.out.println("Insert the the year created");
                int yearCreated = scanner.nextInt();
                superhero.setYearCreated(yearCreated);

                System.out.println("Is the super hero human? Answer in: {Yes/No}");
                String isHumanAnswer = scanner.next();
                boolean isHuman = false;
                if (isHumanAnswer.equalsIgnoreCase("Yes")) {
                    isHuman = true;
                }


                System.out.println("What is the strenght");
                String strength = scanner.next();
                superhero.setStrength(strength);

                db.addSuperhero(name, realname, superPower, yearCreated, isHuman, strength);

// oversigt over superhelte arbejd videre

            } else if (brugerValg == 2) {
                System.out.println("You have now exited the program");
            }

        }
    }
}