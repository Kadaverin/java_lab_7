package lab7.exceptions;

public class SegmentArgumentException extends IllegalArgumentException {
    public SegmentArgumentException(String errorMessage) {
        super(errorMessage);
    }
}
