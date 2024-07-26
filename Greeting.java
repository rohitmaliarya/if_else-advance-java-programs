import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char time;
        char morning = 'M';  
        char afternoon = 'A';  
        char night = 'N';  
        
        System.out.println("Enter the time (M for Morning, A for Afternoon, N for Night): ");
        time = sc.next().charAt(0);
        
        if (time == morning) {
            System.out.println("GOOD MORNING");
        } else if (time == afternoon) {
            System.out.println("GOOD AFTERNOON");
        } else if (time == night) {
            System.out.println("GOOD NIGHT");
        } else {
            System.out.println("Not a valid time");
            sc.close();
        }
    }
}
