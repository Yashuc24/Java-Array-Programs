import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take size from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // 2. Take array elements
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. Take target sum
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // 4. Find two numbers that add up to target
        boolean found = false;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair found at indexes: " + i + " and " + j);
                    System.out.println("Numbers: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("No pair found with sum = " + target);
        }

        sc.close();
    }
}
