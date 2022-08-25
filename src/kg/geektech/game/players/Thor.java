package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.STUNED);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean thorHamer= RPG_Game.random.nextBoolean();
        if (thorHamer){
            boss.setDamage(0);
            System.out.println("Boss oglushen");
        }else {
            boss.setDamage(50);
        }
    }
}
