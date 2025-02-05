public class RPG {
    public static void main(String[] args) {
        Character knight = new Character(new Knight());
        Character archer = new Character(new Archer());
        Character wizard = new Character(new Wizard());
        
        knight.attack();
        knight.defend();
        archer.attack();
        archer.defend();
        wizard.attack();
        wizard.defend();
    }
}
