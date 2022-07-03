import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if (val == null) {
            return 0;
        }
        /*if (val < (long)min) {
            return min;
        } else if (val > (long)max) {
            return max;
        } else {
            return (int) val.longValue();
        }*/
        return val < (long) min ? min : val > (long) max ? max : (int) val.longValue();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}