import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a secure password that meets these requirements:");
        System.out.println("- Is at least 8 characters long");
        System.out.println("- Contains at least one uppercase letter");
        System.out.println("- Contains at least one lowercase letter");
        System.out.println("- Contains at least one numeric digit");
        System.out.println("- Contains at least one of these symbols: ! @ # $ % ^ & * ?");
        System.out.print("\nEnter your secure password: ");
        String password = scanner.nextLine();

    /* to be implemented
       create and use a SecurePassword object with the user’s password and determine
       if it’s secure (using isSecure()), and if not, provide them a status update
       (using status()) and prompt them to try again until they have a password that
       meets all requirements.  Then inform them, "Password is secure" and end.


       Note that, as the user provides updated passwords, you will need to update the
       password in your SecurePassword object using the setter method, .setPassword(),
    */
        SecurePassword password1 = new SecurePassword(password);

            while (!password1.isSecure())
            {
                System.out.print(password1.status());
                System.out.println("Enter your secure password: ");
                String newPassword = scanner.nextLine();
                password1.setPassword(newPassword);
            }
            System.out.print("Password is secure");
        }
    }


