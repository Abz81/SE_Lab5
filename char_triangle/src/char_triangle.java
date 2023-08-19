import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class char_triangle {
    public static void main(String[] args)
    {   Scanner scanner=new Scanner(System.in);
        System.out.println("char:");

        char ch=scanner.next().charAt(0);
        System.out.println("n :");

        int n=scanner.nextInt();
        System.out.println("m :");

        int m=scanner.nextInt();
        triangle_Builder(ch,n,m);


    }

    public static void triangle_Builder(char ch,int n, int m) {

        for(int k=0;k<m;k++){
        for (int i = 0; i <n; i++)
        {
            for (int j = 0; j <=i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }}
}
