//Find Union and Intersection of two arrays
class unioninter {
    public static void main(String[] args){
        int [] arr1 = new int[] {1, 2, 3, 4, 5};
        int [] arr2 = new int[] {4, 5, 6, 7, 8};

        // Find Union
        System.out.print("Union: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }   
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
        // Find Intersection
        System.out.print("Intersection: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
        System.out.println();

    }
    
}