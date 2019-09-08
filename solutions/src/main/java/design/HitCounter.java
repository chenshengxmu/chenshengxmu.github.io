package design;

public class HitCounter
{
    int[] times = new int[300];
    int[] hits = new int[300];

    /**
     * Initialize your data structure here.
     */
    public HitCounter()
    {

    }

    /**
     * Record a hit.
     *
     * @param timestamp - The current timestamp (in seconds granularity).
     */
    public void hit(int timestamp)
    {
        int index = timestamp % 300;
        if (times[index] != timestamp)
        {
            times[index] = timestamp;
            hits[index] = 1;
        }
        else
        {
            hits[index]++;
        }
    }

    /**
     * Return the number of hits in the past 5 minutes.
     *
     * @param timestamp - The current timestamp (in seconds granularity).
     */
    public int getHits(int timestamp)
    {
        int res = 0;
        for (int i = 0; i < times.length; i++)
        {
            int time = times[i];
            int hit = hits[i];
            if (time + 300 > timestamp)
            {
                res += hit;
            }
        }
        return res;
    }
}
