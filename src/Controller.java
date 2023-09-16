public class Controller {
    Database database = new Database();

    public void addHeroDatabase(String name, String realName, String superPower, int yearCreated, boolean isHuman, String strength) {
        database.addSuperhero(name, realName, superPower, yearCreated, isHuman, strength);
    }

    public Database getDatabase() {
        return database;
    }
}
