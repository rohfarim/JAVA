package JAVA;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int [] arr= new int[10];
      int multi = a*b*c;

      while (multi>0){
          arr[multi %10]++;

          multi /= 10;
      }
      for(int i=0; i< arr.length; i++){
          System.out.println(arr[i]);
      }
}
}
