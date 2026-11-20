public class Missing {
    public static void main(String args[]) {

        int arr[] = {1, 2, 4};

        int n = arr.length + 1;

        int sum = n * (n + 1) / 2;

        int actualSum = 0;

        for(int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missing = sum - actualSum;

        System.out.println(missing);
    }
}
