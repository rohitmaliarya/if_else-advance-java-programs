import java.util.Scanner;

public class VoterIDProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Voter ID: ");
        String voterIDInput = scanner.nextLine();

        try {
            int voterID = Integer.parseInt(voterIDInput);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("Voter ID " + voterID + ": You are eligible to vote.");
            } else {
                System.out.println("Voter ID " + voterID + ": You are not eligible to vote.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Voter ID. Please enter a numeric Voter ID.");
        }

        scanner.close();
    }
}
