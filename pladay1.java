import java.util.Scanner;

public class pladay1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, x, y;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();

        float m = a / 6f;

        int n = y / 6;
        int p = y % 6;
        float k = ((float) n + (float) p / 10);

        float d = x / k;
        float f = b / m;

        System.out.println(m);
        System.out.printf("%.1f\n", k);
        System.out.printf("%.1f\n",d);
        System.out.println(f);

        if (d > f)
            System.out.println("Eligible to Win");
        else
            System.out.println("Not Eligible to Win");

         
    }
}
