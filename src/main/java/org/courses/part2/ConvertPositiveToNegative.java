package  org.courses.part2;

public class ConvertPositiveToNegative {
    public static void main(String[] args) {

        System.out.println(new ConvertPositiveToNegative().convertMethod(-10));
    }

    public int convertMethod(int a) {
        return ~a + 1;
    }


}
