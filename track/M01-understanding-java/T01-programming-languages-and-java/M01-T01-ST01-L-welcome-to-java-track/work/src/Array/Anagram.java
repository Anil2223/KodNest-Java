package Array;

import java.util.*;
class Anagram{
    public static void main(String[]args){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String one and two ");
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();

        if(str1.length()!=str2.length()){
           System.out.println("Not anagram ");
           return ;
        }
        char[]charArr1=str1.toCharArray();
        char[]charArr2=str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        String Charstr1=new String(charArr1);
        String Charstr2=new String(charArr2);

         if(Charstr1.equalsIgnoreCase(Charstr2)){
            System.out.println("String is Anogram ");
         }else{
            System.out.println("String is Not Anogram ");
         }
    }
}