package LS5.Q5;
/*
 * Create and implement the scenario as shown in the png file in the same folder.
 */
public class driver {
    public static void main(String[] args) {
        Stringed a = new Stringed();
        Percussion b = new Percussion();
        Wind c = new Wind();
        Woodwind d = new Woodwind();
        Brass e = new Brass();
        a.play();
        System.out.println(a.what());
        a.adjust();
        b.play();
        System.out.println(b.what());
        b.adjust();
        c.play();
        System.out.println(c.what());
        c.adjust();
        d.play();
        System.out.println(d.what());
        d.adjust();
        e.play();
        System.out.println(e.what());
        e.adjust();
    }
}
