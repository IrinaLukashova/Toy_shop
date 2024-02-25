package Generators;

import Domain.Doll;
import Domain.Toy;

public class DollGenerator extends ToyGenerator {

    public DollGenerator(int frequency) {
        super(frequency);
    }
    @Override
    public Toy create(int id, int frequency) {
        return new Doll(id, "Кукла", frequency);
    }
}
