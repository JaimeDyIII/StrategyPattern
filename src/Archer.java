public class Archer implements CharacterClass{
    @Override
    public void attack(){
        ShootArrow shootArrow = new ShootArrow();
        System.out.println("Archer " + shootArrow.attack());
    }

    @Override
    public void defend(){
        Dodge dodge = new Dodge();
        System.out.println("Archer " + dodge.defend());
    }
}