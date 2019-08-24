package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoSumDesign
{
    List<Integer> list;
    public TwoSumDesign() {
        list = new ArrayList<>();
    }

    public void add(int number) {
        list.add(number);
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer a : list)
        {
            if (set.contains(value - a))
            {
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
