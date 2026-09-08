package Array;
class Pgm4{
    public static void main(String[] args){

         String s1="Java";
         String s2="Java";

         if(s1==s2){
             System.out.println("s1 and s2 is true ");
         }else{
             System.out.println("s1 and s2 is false means not true");
         }

         if(s1.equalsIgnoreCase(s2)){
             System.out.println("String are same ");
         }else{
             System.out.println("String are not same ");
         }
    }
}