package Array;

public class Pgm11 {
    public static void main(String[] args){
        // if you want to change string value there we can use StringBuilder
        // String builder is mutable means can be change the size it automatically change the size .
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("java");
        System.out.println("length of 'java' "+sb.length());
        sb.append("Java programming language");
        // automatically increase capacity n*2+2 this formula will be applied to increase the capacity of the StringBuilder

        System.out.println(sb.length());
        System.out.println(sb.capacity());
       // if full then again formula will be applied
        // and size will get increase automatically .

        sb.append("java is object oriented programming language .");
        System.out.println("new size of string builder "+sb.capacity());

        StringBuilder sub=new StringBuilder("new java");
        sub.ensureCapacity(100);
        System.out.println(sub);
        System.out.println("ensureCapacity "+sub.capacity());
        System.out.println("new java length "+sub.length());

        sub.insert(0,"python programming ");
        System.out.println(sub);
        sub.delete(0,4);
        System.out.println(sub);
        sub.reverse();
        System.out.println("reverse "+sub);


    }
}
