import java.util.Scanner;

public class nam2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("a :");
        a = sc.nextDouble();
        System.out.print("b :");
        b = sc.nextDouble();
        System.out.print("c :");
        c = sc.nextDouble();
        if(a !=0) {
            double answer = (c-b) / a;
            System.out.print("Equation pass with x =%f!\n");
        }else{
            if (b==0){
                System.out.print("The solution is al x!");

            }else{
                System.out.print("No solutinon");

            }
        }

    }
}
