package Array;
import java.util.*;
public class Pgm13 {
    public static void main(String[] rgs){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=scanner.nextLine();
        char arr[]=str.toCharArray();
        char newArray[]=new char[arr.length];
        int j=newArray.length-1;
        for(int i=0;i<arr.length;i++){
            newArray[j]=arr[i];
            j--;
        }

        String reverse=new String(newArray);
        System.out.println("original array "+str);
        System.out.println("new array "+reverse);


    }
}
