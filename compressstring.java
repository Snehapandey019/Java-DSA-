// Compress the string
public class compressstring {
    public static void main(String[] args){
        String str = "aaabbbbccc" , res = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++){
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)){
                count++;
            } else {
                res = res + str.charAt(i);
                if (count > 1){
                    res = res + count;
                }
                count = 1;
            }
        }
        
        System.out.println(res);

    }
}
