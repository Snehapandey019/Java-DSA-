//Move all negative numbers to beginning and positive to end
public class negativetopositive {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        rearrange(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;
        int j = 0; 

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
               
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
    }
}
