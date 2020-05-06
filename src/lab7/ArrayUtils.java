package lab7;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public static <T extends Comparable<T>> List<T> findElementsFromSegment(T[] array, Segment<T> segment) {
        List<T> res = new ArrayList<T>();

        for (int i = 0; i < array.length; i++) {
            if (segment.contains(array[i])) {
                res.add(array[i]);
            }
        }

        return res;
    }

}
