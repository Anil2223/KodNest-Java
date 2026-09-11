package Array;
import java.util.*;
class Palindrom{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the String ");
      String str=scanner.nextLine();
      char[]CharArr=str.toCharArray();
      char[]revArr=new char[CharArr.length];

      int j=revArr.length-1;
      for(int i=0;i<=CharArr.length-1;i++){
        revArr[j]=CharArr[i];
        j--;
      }

      String revStr = new String(revArr);
      if(str.equalsIgnoreCase(revStr)){
        System.out.println("Given String is Palindrome ");
      }else{
        System.out.println("Given String  is not Palindrome ");
      }
    }
}