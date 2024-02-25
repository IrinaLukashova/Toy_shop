package Domain;

public class Car extends Toy{
    public Car(int id, String name, int frequency) {
        super(id, name, frequency);
    }
    public void take() {
        System.out.println("Выпала машина");
    }
}
