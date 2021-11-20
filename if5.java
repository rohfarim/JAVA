package JAVA;

import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int h = Sc.nextInt();
        int m = Sc.nextInt();

        if(m<45){
            h = h - 1;
            m = 60 - (45 - m);
            if (h<0){
                h= 23;
            }
            System.out.println(h+ " " +m);
        }
        else{
            m = m-45;
            System.out.println(h + " " + m);
        }

    }
}