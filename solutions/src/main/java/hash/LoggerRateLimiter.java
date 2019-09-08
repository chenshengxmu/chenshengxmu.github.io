package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LoggerRateLimiter
{
    Map<String, Integer> map = new HashMap<>();

    /**
     * Initialize your data structure here.
     */
    public LoggerRateLimiter()
    {

    }

    /**
     * Returns true if the message should be printed in the given timestamp, otherwise returns false.
     * If this method returns false, the message will not be printed.
     * The timestamp is in seconds granularity.
     */
    public boolean shouldPrintMessage(int timestamp, String message)
    {
        if (map.containsKey(message))
        {
            if (map.get(message) + 10 <= timestamp)
            {
                map.put(message, timestamp);
                return true;
            }

            return false;
        }
        map.put(message, timestamp);
        return true;
    }
}
