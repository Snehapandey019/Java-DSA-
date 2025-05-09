//Count the number of occurrences of an element
class countoccurrence2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 37, 4, 5, 37, 2, 11};
        int countelement = 37;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == countelement) {
                count++;
            }
        }

        System.out.println("Element " + countelement + " occurs " + count + " times");
    }
}
