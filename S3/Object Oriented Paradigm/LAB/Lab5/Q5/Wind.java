package LS5.Q5;

public class Wind implements Instument{
    public void play(){
        System.out.println("Playing Wind Instument");
    }
    public String what(){
        return "Wind Instument";
    }
    public void adjust(){
        System.out.println("Adjusting Instument");
    }
}
