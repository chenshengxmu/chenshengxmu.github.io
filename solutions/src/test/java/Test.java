import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Test
{
    @org.junit.Test
    public void test()
    {
        new LinkedBlockingQueue();
        Objects.hash("hello", 2);
        ConcurrentLinkedDeque deque = new ConcurrentLinkedDeque();
        deque.remove("hello");

        int low = 0;
        int high = 0;
        int mid = (low + high) >>> 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String substring = sb.substring(0, -1);
        System.out.println(substring);

    }
}
