import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int month;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter number from 1 to 12 month=");

        month = Integer.parseInt(scan.nextLine());

        if(month < 1 || month > 12){
            System.out.println("Enter right number");
            System.exit(0);
        }

        int days = 0;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
        }

        System.out.println("Month = " + month + " days = " + days);
    }
}