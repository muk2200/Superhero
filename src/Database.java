import java.util.ArrayList;

public class Database {
private ArrayList<Superhero> SuperheroList = new ArrayList<>();
    public void addSuperhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, String strength) {
        SuperheroList.add(new Superhero(name,realName,superPower,yearCreated,isHuman, strength));

    }

}



