import Domain.Toy;

import java.util.Comparator;

import javax.management.RuntimeErrorException;

public class ToyComparator  implements Comparator<Toy>{


    @Override
    public int compare(Toy o1, Toy o2){
        int result = o1.name.compareTo(o2.name);
        if (result == 0) {
            result = Integer.toString(o1.frequency).compareTo(Integer.toString(o2.frequency));
        } else {
            return result;
        }
        throw new RuntimeErrorException(null);
    }
}
