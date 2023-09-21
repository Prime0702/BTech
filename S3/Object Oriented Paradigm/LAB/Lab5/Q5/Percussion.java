package LS5.Q5;

public class Percussion implements Instument{
    public void play(){
        System.out.println("Playing Percussion Instument");
    }
    public String what(){
        return "Drum";
    }
    public void adjust(){
        System.out.println("Adjusting Instument");
    }
}
