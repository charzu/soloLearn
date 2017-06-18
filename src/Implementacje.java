/**
 * Created by lchar on 17.06.2017.
 */


interface Car{
    void drive();

}

interface Jet{
    void fly();
}

class Amfibia implements Car, Jet{
    public void drive(){
        System.out.println("Bruuum!");
    }

    @Override
    public void fly() {
        System.out.println("Wiuuuuu!");
    }
}

public class Implementacje {

    public static void main(String[] args) {
        Amfibia am = new Amfibia();
        am.drive();
        am.fly();

    }
}
