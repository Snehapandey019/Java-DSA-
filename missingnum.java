//Missing number in array [1 to n]
class missingnum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5 , 6}; 
        int n = arr.length + 1; 
        int total = (n * (n + 1)) / 2; 
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        int missingnum = total - sum;
        System.out.println("Missing number is: " + missingnum);
    }
}