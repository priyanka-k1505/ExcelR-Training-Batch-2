import java.util.Scanner;
public class Demo34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scanner.nextInt();
        
        if (number % 2 == 0){
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}