package LS5.Q5;

public class Stringed implements Instument{
    public void play(){
        System.out.println("Playing Stringed Instument");
    }
    public String what(){
        return "Gitar";
    }
    public void adjust(){
        System.out.println("Adjusting Stringed Instument");
    }
}
