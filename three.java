 import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int s1 = in.nextInt();
        int summ = 0;
        for (int i=0; i<s1; i++){
            summ += s+10*i;
        }
        System.out.println(summ);
    }
}