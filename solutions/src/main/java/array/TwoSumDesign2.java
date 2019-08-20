package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumDesign2
{
    List<Integer> list;
    Set<Integer> set;
    /** Initialize your data structure here. */
    public TwoSumDesign2() {
        list = new ArrayList<>();
        set = new HashSet<>();
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        for (Integer a : list)
        {
            set.add(a + number);
        }
        list.add(number);
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        return set.contains(value);
    }
}
