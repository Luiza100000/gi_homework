import java.util.Scanner;

public class ver2 {
    public static int funt(int s1, int s2) {
        int maxi;
        if (s1>s2){
            maxi = s1;
        }
        else{
            maxi = s2;
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        System.out.println(funt(s1, s2));
    }
}

