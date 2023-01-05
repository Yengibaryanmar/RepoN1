import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scan = new Scanner(System.in);

        System.out.println("a=");
        a = Integer.parseInt(scan.nextLine());

        System.out.println("b=");
        b = Integer.parseInt(scan.nextLine());

        System.out.println("c=");
        c = Integer.parseInt(scan.nextLine());

        int t;

        if (a > c) {
            t = a;
            a = c;
            c = t;
        }

        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }

        System.out.println("numbers: " + a +" " + " "+b+" "+c);

        if(a + b >= c){
            System.out.println("right numbers to construct triangle");
        }else{
            System.out.println("wrong numbers to construct triangle");
        }
    }
}