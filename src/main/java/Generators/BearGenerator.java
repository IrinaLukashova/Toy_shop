package Generators;

import Domain.BearToy;
import Domain.Toy;

public class BearGenerator extends ToyGenerator {

    public BearGenerator(int frequency) {
        super(frequency);
    }
    @Override
    public Toy create(int id, int frequency) {
        return new BearToy(id, "Медведь", frequency);
    }
}
