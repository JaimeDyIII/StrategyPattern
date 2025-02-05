import java.util.Random;

public class Knight implements CharacterClass {
    Random random = new Random();

    @Override
    public void attack(){
        SwingSword swingSword = new SwingSword();
        System.out.println("Knight " + swingSword.attack());
    }

    @Override
    public void defend(){
        int defensiveStrategy = random.nextInt(3);
        Shield shield = new Shield();
        Dodge dodge = new Dodge();
        CreateMagic createMagic = new CreateMagic();

        switch(defensiveStrategy){
            case 0 -> System.out.println("Knight " + shield.defend());
            case 1 -> System.out.println("Knight " + dodge.defend());
            case 2 -> System.out.println("Knight " + createMagic.defend());
        }
    }
}
