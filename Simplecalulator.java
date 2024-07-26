import java.util.Scanner;

public class Simplecalulator {
    public static void main(String[] args) {
        int a,b,num;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first number a");
         a = sc.nextInt();
        System.out.println("enter the second number b");
         b =sc.nextInt();
        System.out.println("enter your choice 1->addtion 2->substraction 3->multiply 4->divide /n enter your choice ");
        num=sc.nextInt();
        if(num==1)
        System.out.println("addtion ="+(a+b));
        else if(num==2)
        System.out.println("substraction"+(a-b));
        else if(num==3)
        System.out.println("multiply"+(a*b));
        else if (num==4)
       System.out.println("divide"+(a/b));
       else
       System.out.println("invalid choice");
       sc.close();
      
    }
}
