// Leaders in an Array
public class leadersinanarray {
    public static void main(String[] args) {
        int arr[] = {15 , 14 , 3, 8, 9, 10};
        int n = arr.length;
        int rightMax = arr[n - 1];
        System.out.print(rightMax + " "); 

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > rightMax) {
                rightMax = arr[i];
                System.out.print(rightMax + " ");
            }
        }
    }
}