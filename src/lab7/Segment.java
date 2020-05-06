package lab7;

import lab7.exceptions.SegmentArgumentException;

public class Segment<T extends Comparable<T>> {
    private T start;
    private T end;

    public Segment(T start, T end) {
        if (start.compareTo(end) > 0) {
            throw new SegmentArgumentException("Segment 'start' can not be larger than 'end'");
        }

        this.start = start;
        this.end = end;
    }

    public boolean contains(T value) {
        return value.compareTo(start) >= 0 && value.compareTo(end) <= 0;
    }

    @Override
    public String toString() {
        return "[" + start + ";" + end + "]";
    }
}
