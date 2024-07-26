import java.util.Scanner;
public class Week {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value ");
    int val = sc.nextInt();
    if(val==1){
    System.out.println("sunday");
    }else if (val==2){
    System.out.println("monday");
   }else if (val==3)
   System.out.println("tuesday");
   else{
   System.out.println("not found");
   sc.close();
   }
} 
}
