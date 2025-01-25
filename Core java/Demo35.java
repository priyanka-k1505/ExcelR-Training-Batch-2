import java.util.Scanner;
public class Demo35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if (num1 >= num2) {
            System.out.println(num1+"bigger number");
        }else {
            System.out.println(num2+"bigger number");
        }
    }
}