package Generators;

import Domain.Lego;
import Domain.Toy;

public class LegoGenerator extends ToyGenerator {
    public int frequency;

    public LegoGenerator(int frequency) {
        super(frequency);
    }

    @Override
    public Toy create(int id, int frequency) {
        return new Lego(id, "Конструктор", frequency);
    }
}
