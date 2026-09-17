package Array;

class Pgm14 {
    public static void main(String[] args) {
        String str = "Mam";
        char[] charArr = str.toCharArray();
        char[] revArr = new char[charArr.length];
        int j = revArr.length - 1;
        for (int i=0;i<=charArr.length-1;i++) {
            revArr[j] = charArr[i];
            
            j--;
        }
        String str2 = new String(revArr);
        if (str.equalsIgnoreCase(str2)) {
            System.out.println("String is palindrome ");
        } else {
            System.out.println("String is Not palindrome ");
        }
    }
}