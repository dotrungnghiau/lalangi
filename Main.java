public class Main {
    public static void main(String[] args) {
        ActionCharacter hero = new Hero();
        ((CanSwim) hero).swim();
        ((CanFight) hero).fight();    
    }
}
// ko cần implements lại fight() 