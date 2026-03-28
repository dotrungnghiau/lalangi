public class ActionCharacter 
{
    public void fight(){
        System.out.println("Đấm bốc");
    }
}
interface CanFLy{void fly();}
interface CanSwim{void swim();}
interface CanFight{void fight();}

class Hero extends ActionCharacter implements CanFLy, CanSwim, CanFight {
    public void fly(){
        System.out.println("bay");
    }
    public void swim(){
        System.out.println("boi");
    }
   // public void fight(){
  //      System.out.println("danh");
   // }
}
