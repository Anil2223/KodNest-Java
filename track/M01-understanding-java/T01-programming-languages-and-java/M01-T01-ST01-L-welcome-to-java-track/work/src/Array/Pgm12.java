package Array;

public class Pgm12 {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Raja");
        System.out.println(sb);
        // toString immutable means after this it will not change
        String res=sb.toString();

        res.concat("Rani");// it will not concat the sb
        System.out.println(res);// you can see only two above output but not this one ?
        // so it is immutable it cann't be change the value .


    }
}
