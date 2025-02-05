public class Wizard implements CharacterClass{
    @Override
    public void attack(){
        CastSpell castSpell = new CastSpell();
        System.out.println("Wizard " + castSpell.attack());
    }

    @Override
    public void defend(){
        CreateMagic createMagic = new CreateMagic();
        System.out.println("Wizard " + createMagic.defend());
    }
}
