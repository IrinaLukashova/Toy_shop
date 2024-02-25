package Domain;

public class BearToy extends Toy{
    public BearToy(int id, String name, int frequency) {
        super(id, name, frequency);
    }

    public void take() {
        System.out.println("Выпал плюшевый медведь");
    }
}
