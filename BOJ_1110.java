package JAVA;

import java.util.Scanner;

public class BOJ_1110 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int newn = n;
    int count = 0;

    int a; //10의자리
    int b; //1의자리
    int c; //더해진 숫자

    while (true){
        a = n/10;
        b = n%10;
        c = a+b;
        n = b*10 + c%10;
        count ++;
        if(n==newn){
            break;
        }
    }
    System.out.println(count);
}
}
