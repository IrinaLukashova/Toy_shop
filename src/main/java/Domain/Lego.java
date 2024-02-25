package Domain;

public class Lego extends Toy{

    public Lego(int id, String name, int frequency) {
        super(id, name, frequency);
    }

    public void take() {
        System.out.println("Выпал конструктор Лего");

    }
}
