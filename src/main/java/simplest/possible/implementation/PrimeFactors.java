package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int i) {
        List<Integer> list = new ArrayList<>();
        if (i != 1) {
            list.add(i);
        }
        return list;
    }
}
