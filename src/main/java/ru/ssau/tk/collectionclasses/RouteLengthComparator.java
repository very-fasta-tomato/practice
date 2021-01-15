package ru.ssau.tk.collectionclasses;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class RouteLengthComparator implements Comparator<Route> {

    Map<Route, Double> routeLengthMap = new HashMap<>();

    @Override
    public int compare(Route route1, Route route2) {
        if (routeLengthMap.get(route1) == null) {
            routeLengthMap.put(route1, route1.length());
        }
        if (routeLengthMap.get(route2) == null) {
            routeLengthMap.put(route2, route2.length());
        }
        return Double.compare(routeLengthMap.get(route1), routeLengthMap.get(route2));
    }
}
