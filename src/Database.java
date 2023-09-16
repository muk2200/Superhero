import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    private Superhero[] superheros;
    private int numbersOfSuperheros;

    public Database() {
        superheros = new Superhero[5];
        numbersOfSuperheros = 0;

    }

    public Superhero[] getSuperheros() {
        return superheros;
    }

    public ArrayList<Superhero> SuperheroList = new ArrayList<>();
// gør så helte bliver tilføjet her


    public void addSuperhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, String strength) {
        Superhero superhero = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);
        SuperheroList.add(superhero);
        System.out.println(superhero);
    }

    public Superhero findSuperhero(String name) {
        for (Superhero S : SuperheroList) {
            if (S.getName() == name) {
                return S;
            }
        }
        return null;
    }
}
//Classer og objekter starter med stort, og variabler og metoder starter med små







