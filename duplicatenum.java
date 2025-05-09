// Find duplicate number in array
class duplicatenum {
    public static void main(String[] args) {
        int[] arr = {37, 2, 3, 4, 5, 37, 22, 1, 43};
        

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate number is: " + arr[i]);
                           return;
                    }
            }
       }
        System.out.println("No duplicate number");
   }
}