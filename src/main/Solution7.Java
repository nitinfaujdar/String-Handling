import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        char[] inputCharArray = input.nextLine().toCharArray();
        for (int i = 0; i < inputCharArray.length; i++) {
            int val = inputCharArray[i];
            sum += val;
        }
        System.out.println("Total Weight: " + sum);
    }
}
