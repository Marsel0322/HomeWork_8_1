package kg.geektech.game.players;

public class Teacher extends Hero{

    public Teacher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.TEACHER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        System.out.println("ругает босса");
    }
}
