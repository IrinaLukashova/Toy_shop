package Generators;

import Domain.Toy;

public abstract class ToyGenerator {
    public int frequency;

    public ToyGenerator(int frequency) {
        this.frequency = frequency;
    }


    public abstract Toy create(int id, int frequency);
}
