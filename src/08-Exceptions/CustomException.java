class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomException {
    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Available: " + balance
            );
        }
        System.out.println("Withdrawn: " + amount);
    }
    static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18+. Got: " + age);
        }
        System.out.println("Age valid: " + age);
    }
    public static void main(String[] args) {
       try {
            withdraw(1000, 1500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Bank Error: " + e.getMessage());
        }
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Age Error: " + e.getMessage());
        }
    }
}
