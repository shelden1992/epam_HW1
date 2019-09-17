package part5;

public class СhangeBitInPosition {
    public static void main(String[] args) {
        int number = 24; //11000
        int position = 3;

        System.out.println(changeBitForOneInPosition(number, position));
        System.out.println(changeBitForZeroInPosition(number, position));


    }

    private static int changeBitForOneInPosition(int number, int position) {
        try {
            String s = Integer.toBinaryString(number);
            if ((position + 1 > s.length() || position < 0)) {
                throw new IllegalArgumentException();
            }
            return (number | (1 << position));
        } catch (IllegalArgumentException e) {
            System.out.println("Not correct position");
        }
        return 0;

    }

    private static int changeBitForZeroInPosition(int number, int position) {
        try {
            String s = Integer.toBinaryString(number);
            if (position + 1 > s.length() || position < 0) {
                throw new IllegalArgumentException();
            }
            return (number & ~(1 << position));
        } catch (IllegalArgumentException e) {
            System.out.println("Not correct position");
        }
        return 0;

    }

}
