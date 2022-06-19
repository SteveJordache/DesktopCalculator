import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String stringInput = scanner.nextLine();
        int lowIndex = scanner.nextInt();
        int highIndex = scanner.nextInt();
        System.out.println(stringInput.substring(lowIndex, highIndex + 1));
    }
}