public class Demo062 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        System.out.println("First element: " + arr[0]);
        System.out.println("Second element: " + arr[1]);
        System.out.println("Last element: " + arr[arr.length - 1]);
    }
}
