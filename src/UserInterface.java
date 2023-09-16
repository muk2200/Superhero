import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface extends Database {
    Database db = new Database();
    Superhero superhero = new Superhero();
    Scanner scanner = new Scanner(System.in);


    public void run() {
        while (true) {
            { //Loop så den køre flere gange
                System.out.println("WELCOME TO THE SUPER HERO DATA BASE!");
                System.out.println("Press 1 if you want to create a superhero");
                System.out.println("Press 2 if you want to see a list of superheroes");
                System.out.println("Press 3 if you want to see a specific superhero");
                System.out.println("Press 4 if you want to exit this program");
                System.out.println("Press 5 : if you want to search up an Superhero");
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

                    //Prøvede at lave en exception men det lykkedes ikke helt
                    try {
                        int yearCreated = scanner.nextInt();
                        superhero.setYearCreated(yearCreated);
                    } catch (ArithmeticException e) {
                        System.out.println("You have to insert a year created, in number!");
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a year created, in numerical form!");
                    } finally {
                        scanner.close();
                    }


                    System.out.println("Is the super hero human? Answer in: {Yes/No}");
                    String isHumanAnswer = scanner.next();
                    boolean isHuman = false;
                    if (isHumanAnswer.equalsIgnoreCase("Yes")) {
                        isHuman = true;

                    } else if (brugerValg == 2) {

                        for (int i = 0; i < SuperheroList.size(); i++) {
                            // String helte = SuperheroList.get()
                            // System.out.println(helte);
                        }
                    }
                    System.out.println("What is the strenght");
                    String strength = scanner.next();
                    superhero.setStrength(strength);

                    db.addSuperhero(name, realname, superPower, brugerValg, isHuman, strength);

                    
                } else if (brugerValg == 4) {
                    System.out.println("You have now exited the program");
                } /*else if(brugerValg == 3){
                    System.out.println(db.getSuperheros());
                }

                */
                else if (brugerValg == 5) {
                    System.out.println("Insert the name of the superhero your looking for");
                    String searchSuperhero = scanner.nextLine();
                    if(db.findSuperhero(searchSuperhero)!=null){
                        System.out.println(db.findSuperhero(searchSuperhero));
                    }else {
                        System.out.println("Superhero not found in the database.");
                    }

                }
                }

            }

        }
    }



