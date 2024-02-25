import Domain.*;
import Generators.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int[] frequencies = new int[]{4,1,2,1};


        List<ToyGenerator> generators = new ArrayList<>();
        for (int i = 0; i < frequencies[0]; i++) {
            generators.add(new BearGenerator(frequencies[0]));
        }
        for (int i = 0; i < frequencies[1]; i++) {
            generators.add(new LegoGenerator(frequencies[1]));
        }
        for (int i = 0; i < frequencies[2]; i++) {
            generators.add(new DollGenerator(frequencies[2]));
        }
        for (int i = 0; i < frequencies[3]; i++) {
            generators.add(new CarGenerator(frequencies[3]));
        }

        PriorityQueue<Toy> toyQueue = new PriorityQueue<>();
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            int generatorNumber = Math.abs(rnd.nextInt()%generators.size());
            int frequency = generators.get(generatorNumber).frequency;
            Toy toy = generators.get(generatorNumber).create(i,frequency);
            toy.take();
            System.out.println(toy);
            System.out.println();
            toyQueue.add(toy);

        }

        try (FileWriter writer = new FileWriter("file.txt")) {
            for (int i = 0; i < 10; i++) {
                Toy currentToy = toyQueue.poll();
                writer.write("Выпала игрушка: Toy ID: " + currentToy.id + ", Name: " + currentToy.name + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
