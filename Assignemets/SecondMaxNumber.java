public class SecondMaxNumber {

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int arr[] = {12, 5, 8, 20, 15, 20, 7};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Max is " + max);
        System.out.println("Second Max is " + secondMax);
    }
}