import java.util.Scanner;

public class nam1 {
    public static void main(String[] args) {
        double vnd =23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("moi ban nhap so tien USD: ");
        usd = sc.nextDouble();
        double quydoi= usd * 23000;
        System.out.print("Gia tri VND: "+ quydoi);
    }
}
