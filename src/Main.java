import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1: ");
        int x = scanner.nextInt();
//        System.out.println("Input 2: ");
//        int y = scanner.nextInt();

        String num = String.valueOf(x);
        int sum = 0;
        char[] number = num.toCharArray();
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
            System.out.println(sum);
        }
        System.out.println(sum);

    }
}

