package lab7;

import lab7.exceptions.SegmentArgumentException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputManager {
    private static BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    public static int getInteger() {
        Integer inputInt = null;

        while (inputInt == null) {
            try {
                inputInt = Integer.parseInt(inputReader.readLine());
            } catch (NumberFormatException nfe) {
                System.err.println("Your input is not an integer, try again");
            } catch (IOException e) {
                System.err.println("An IOException was caught :" + e.getMessage());
            }
        }

        return inputInt;
    }

    public static Segment<Integer> getIntegerSegment() {
        Segment<Integer> segment = null;

        while (segment == null) {
            try {
                System.out.println("Enter a:");
                int a = getInteger();

                System.out.println("Enter b:");
                int b = getInteger();

                segment = new Segment<>(a, b);
            } catch (SegmentArgumentException ex) {
                System.err.println("You entered invalid segment boundary. " + ex.getMessage());
            }
        }

        return segment;
    }

    public static int getPositiveInteger() {
        int res = -1;

        while (res < 0) {
            res = getInteger();

            if (res < 0) {
                System.err.println("Your integer is not positive. Please, enter positive integer");
            }
        }

        return res;
    }
}
