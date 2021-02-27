import java.util.Scanner;

public class Gravitacija{
    
    public static final double C = (6.674) * (Math.pow(10, -11));
    public static final double M = (5.972) * (Math.pow(10, 24));
    public static final double r = (6.371) * (Math.pow(10, 6));
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double a = (C*M) / Math.pow((r+(h*1000)),  2);
        System.out.println(a);
    }
}
