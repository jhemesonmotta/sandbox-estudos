package javaCert;

import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s1="";
        while(scan.hasNext()){
            s1 = scan.nextLine();
        }

        System.out.println("String: " + s1);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
