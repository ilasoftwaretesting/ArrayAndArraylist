import java.util.ArrayList;
import java.util.Scanner;

public class Specific3 {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> A1=new ArrayList<Integer>();
        A1.add(1);
        A1.add(2);
        A1.add(3);
        A1.add(4);
        System.out.println("index of 1:"+A1.indexOf(1));
        System.out.println("index of 2:"+A1.indexOf(2));
        System.out.println("index of 3:"+A1.indexOf(3));

    }
}
