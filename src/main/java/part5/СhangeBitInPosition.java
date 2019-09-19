package part5;

public class СhangeBitInPosition {
    public static void main(String[] args) {
        int number = 24; //11000
        int position = 2;

        System.out.println(changeBitForOneInPosition(number, position));
        System.out.println(changeBitForZeroInPosition(number, position));


    }

    private static int changeBitForOneInPosition(int number, int position) {
        String s = Integer.toBinaryString(number);
        if ((position + 1 > s.length() || position < 0)) {
            System.err.println("Not correct position");
            return 0;
        }
        return (number | (1 << position));
    }

    private static int changeBitForZeroInPosition(int number, int position) {
        String s = Integer.toBinaryString(number);
        if (position + 1 > s.length() || position < 0) {
            System.err.println("Not correct position");
            return 0;
        }
        return (number & ~(1 << position));

    }

}
