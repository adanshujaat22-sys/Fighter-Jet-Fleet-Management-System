package fleetmanagement;

import java.util.Scanner;

public class JetInput {
    private Scanner scanner;

    public JetInput() {
        scanner = new Scanner(System.in);
    }

    public String getStringInput(String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be empty. Please try again.");
        }
    }

    public String getJetTypeInput() {
        String[] validTypes = { "Bomber", "Stealth", "Multirole", "Air Superiority" };
        while (true) {
            System.out.print("Enter Jet Type (Bomber, Stealth, Multirole, Air Superiority): ");
            String input = scanner.nextLine().trim();
            for (String type : validTypes) {
                if (type.equalsIgnoreCase(input)) {
                    return type;
                }
            }
            System.out.println("Invalid jet type. Please enter one of the specified types.");
        }
    }

    public String getGenerationInput() {
        while (true) {
            System.out.print("Enter Generation: ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Generation cannot be empty. Please try again.");
        }
    }
}
