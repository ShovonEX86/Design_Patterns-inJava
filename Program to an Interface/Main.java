
interface CAR {

    void startEngine();
    void stopEngine();

}

class Sedan implements CAR{

    @Override
    public void startEngine(){
        System.out.println("Sedan engine started!");
    }
    @Override
    public void stopEngine(){
        System.out.println("Sedan engine stopped!");
    }
}

class SUV implements CAR{

    @Override
    public void startEngine(){
        System.out.println("SUV engine started!");
    }
    @Override
    public void stopEngine(){
        System.out.println("SUV engine stopped!");
    }
}

public class Main{
    public static void main(String[] arg){

        CAR mycar = new Sedan();

        mycar.startEngine();
        mycar.stopEngine();

        mycar = new Sedan();
        mycar.startEngine();
        mycar.stopEngine();

    }
}
