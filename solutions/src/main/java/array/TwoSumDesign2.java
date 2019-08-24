package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumDesign2
{
    List<Integer> list;
    Set<Integer> set;
    public TwoSumDesign2() {
        list = new ArrayList<>();
        set = new HashSet<>();
    }

    public void add(int number) {
        for (Integer a : list)
        {
            set.add(a + number);
        }
        list.add(number);
    }

    public boolean find(int value) {
        return set.contains(value);
    }
}
