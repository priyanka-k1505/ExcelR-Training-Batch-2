import java.util.Scanner;
public class Demo037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        int num4= scanner.nextInt();
        if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
            System.out.println(num1 + "is bigger");
        }else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
             System.out.println(num2 + "is bigger");
        }else if (num3 >= num1 && num3 >= num2 && num3 >= num4) {
            System.out.println(num3 + "is bigger");
        }else {
            System.out.println(num4 + "is bigger");
        }
    }
}