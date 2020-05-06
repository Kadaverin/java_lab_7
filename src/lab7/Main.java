package lab7;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an array size");

        int size = UserInputManager.getPositiveInteger();

        Integer arr[] = new Integer[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = UserInputManager.getInteger();
        }

        System.out.println("Now set the segment [a,b] boundary to find elements from array contained in segment \n");
        Segment<Integer> segment = UserInputManager.getIntegerSegment();

        List<Integer> res = ArrayUtils.findElementsFromSegment(arr, segment);

        if (res.isEmpty()) {
            System.out.println("There is no elements in your array from provided segment " + segment.toString());
        } else {
            System.out.println("Elements from segment " + segment.toString() + ": \n" + res.toString());
        }
    }
}
