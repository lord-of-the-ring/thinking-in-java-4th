package preview;

public class Exercise12_P179
{
    static interface CanFight{//static 在此处多余
        public void Fight();//public 在此处亦多余
    }
    interface CanFly{
        void Fly();
    }
    interface CanSwim{
        void Swim();
    }
    interface CanClimb{
        void Climb();
    }
    static class ActionCharacter{//不让其生成对象
        public void Fight(){System.out.println("Fighting1 !");}
    }
    static class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb{
        @Override public void Fly(){System.out.println("Flying!");}
        @Override public void Swim(){System.out.println("Swimming!");}
        @Override public void Fight(){System.out.println("Fighting2 !");}
        @Override public void Climb(){System.out.println("Climbing!");}
    }
    static class Adventure{

    }
    public static void cfight(CanFight canfight){
        canfight.Fight();
    }
    public static void cfly(CanFly canFly){
        canFly.Fly();
    }
    public static void cswim(CanSwim canSwim){
        canSwim.Swim();
    }
    public static void cclimb(CanClimb canClimb){
        canClimb.Climb();
    }
    public static void ac(ActionCharacter actionCharacter){
        actionCharacter.Fight();
    }
    public static void main(String[] args){
        Hero hero = new Hero();
        cfight(hero);
        cfly(hero);
        cswim(hero);
        cclimb(hero);
        ac((ActionCharacter)hero);
        ActionCharacter actionCharacter = new ActionCharacter();
        ac(actionCharacter);
    }
}
