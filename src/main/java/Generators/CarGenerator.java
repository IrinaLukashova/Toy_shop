package Generators;

import Domain.Car;
import Domain.Toy;

public class CarGenerator extends ToyGenerator {

    public CarGenerator(int frequency) {
        super(frequency);
    }
    @Override
    public Toy create(int id, int frequency) {
        return new Car(id,"Машинка", frequency);
    }
}
