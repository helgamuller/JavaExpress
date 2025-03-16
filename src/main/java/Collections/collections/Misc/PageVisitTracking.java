package Collections.collections.Misc;

import java.util.HashMap;

public class PageVisitTracking {
    private static HashMap<String, Integer> visits;
    static {
        visits = new HashMap<>();
    }
    private static void trackPageVisit(String page) {

        if(visits.containsKey(page)) {
            Integer count = visits.get(page);
            count++;
            visits.replace(page, count);
        }
        else {
            visits.put(page, 1);
        }

    }

    public static void main(String[] args) {
        trackPageVisit("1");
        trackPageVisit("1");
        trackPageVisit("2");
        visits.forEach((key, value) -> System.out.println(" Page " + key + " was visited " + value  + " times"));
    }
}
