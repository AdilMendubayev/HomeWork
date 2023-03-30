// программа принимает все int до любого другого символа (кроме пробелов)
// после ввода другого символа выводит сумму всех int
import java.util.Scanner;

public class TaksOne {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
