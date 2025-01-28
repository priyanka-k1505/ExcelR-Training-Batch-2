class Calculator{
    void add(int num1, int num2){
        System.out.println("The sum of two numbers is: "+(num1+num2));
    }
    void add(double num1, double num2, double num3){
        System.out.println("The sum of three numbers is: "+(num1+num2+num3));
    }
}
public class Demo054{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(5,4);
        cal.add(3.5,1.8,3.0);
    }
}