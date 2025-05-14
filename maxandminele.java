//. Find the 'Kth' max and min element of an array
import java.util.Arrays;

class maxandminele{
    public static void 
    findthemaxandminele(int arr[], int k) {
        if (arr.length < k) {
            System.out.println("Not enough elements in the array");
            return;
        }
        Arrays.sort(arr);
        int max = arr[arr.length - k];
        int min = arr[k - 1];
        System.out.println("The " + k + "th maximum element is: " + max);
        System.out.println("The " + k + "th minimum element is: " + min);

    }
    public static void main(String[] args) {
        int arr[] = { 12, 3, 5, 7, 19 };
        int k = 2;
        findthemaxandminele(arr, k);
    }
    
    }
