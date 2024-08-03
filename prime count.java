 import java.util.Scanner;
import java.util.ArrayList;
 class PrimeCompositeCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (separated by spaces):");

        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (String token : tokens) {
            try {
                int number = Integer.parseInt(token);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + token + " is not an integer.");
                return;
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
            return;
        }

        int primeCount = 0;
        int compositeCount = 0;

        for (int number : numbers) {
            if (number < 2) {
                continue;
            } else if (isPrime(number)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }

        System.out.println("Number of prime numbers: " + primeCount);
        System.out.println("Number of composite numbers: " + compositeCount);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

INPUT
 enter numbers: 1 2 3 4 5 6 7 8 
  Number of Prime numbers :4
  number of Composite numbers:3
