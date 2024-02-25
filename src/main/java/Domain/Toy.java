package Domain;

import jdk.jfr.Frequency;

public abstract class Toy implements Comparable<Toy>{
    public int id;
    public String name;
    public int frequency;

    public Toy(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    public abstract void take();

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name  +
                ", frequency='" + frequency + "'}";
    }

    public int compareTo(Toy o) {
        if (id > o.id)
            return 1;
        if (id < o.id)
            return -1;
        return 0;
    }
}
