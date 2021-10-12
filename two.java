import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        int s3 = in.nextInt();
        if (s1>s2 && s1>s3){
            System.out.println(s1);
        }
        if (s2>s1 && s2>s3){
            System.out.println(s2);
        }
        if(s3>s1 && s3>s2){
            System.out.println(s3);
        }
    }
}