import java.util.Scanner;

public class Taxcalculator {
    public static void main(String[] args) {
        int income;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the income");
        income =sc.nextInt();
        if(income<=10000)
        System.out.println("No tax");
        else if(income >=10000 && income<=30000)
        System.out.println("10% tax ="+(0.10*income));
         else if(income >=30000 && income <=50000)
        System.out.println("20% tax = "+(0.20*income));
           else if(income >=50000)
        System.out.println("30 tax ="+(0.30*income));
        else
        System.out.println("not valid");
        sc.close();
    }

}
