package Domain;

public class Doll extends Toy{
    public Doll(int id, String name, int frequency) {
        super(id, name, frequency);

    }
    @Override
    public void take() {
        System.out.println("Выпала кукла");
    }
}
