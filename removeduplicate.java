//Remove duplicates from a string

class removeduplicate {
    public static void main(String[] args){
        String str = "Heeellooo";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (newStr.indexOf(ch) == -1) {
                newStr = newStr + ch;
            }
     
        }
        System.out.println(newStr + "  ");
    }
}