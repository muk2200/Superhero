import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Database {
    private Superhero[] superheros;
    private  int numbersOfSuperheros;

    public Database(){
        superheros = new Superhero[5];
        numbersOfSuperheros = 0;

    }
private ArrayList<Superhero> SuperheroList = new ArrayList<>();
    public void addSuperhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, String strength) {
        SuperheroList.add(new Superhero(name, realName, superPower, yearCreated, isHuman, strength));







/*
        private Superhero[] db = new Superhero[5];
        int count = 0;

        public void addSuperhero (String name, String realName, String superPower, int yearCreated, boolean isHuman, String strength){

            Superhero superhero = new Superhero (name, realName, superPower,yearCreated, isHuman,strength);
            db[count] = superhero;
            count++;
      */
        }
    }





