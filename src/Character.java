public class Character{
    private CharacterClass characterClass;

    public Character(CharacterClass characterClass){
        this.characterClass = characterClass;
    }
    
    public void attack(){
        characterClass.attack();
    }

    public void defend(){
        characterClass.defend();
    }
}