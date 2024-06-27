import java.util.Scanner;

public class App {
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library();
        User user = new User("Admin", "master");
        Auth auth = new Auth();

        String username = "", password = "";

        Book codeComplete = new Book("Code Complete 2", "Microsoft", "Computer Science");
        Book secondChances = new Book("Second Chances", "Miyobi", "Finansial");

        library.addBook(codeComplete);
        library.addBook(secondChances);

        System.out.print("Masukan username Anda: ");
        username = ip.nextLine();
        System.out.print("Masukan password Anda: ");
        password = ip.nextLine();

        boolean isAuth = auth.isLogin(user, username, password);

        if (isAuth) {
            System.out.println("Selamat datang di sistem perpustakaan!");
        } else {
            System.err.println("Invalid username and password.");
        }
    }
}
