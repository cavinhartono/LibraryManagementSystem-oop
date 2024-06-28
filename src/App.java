import java.util.Scanner;

public class App {
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library();
        User user = new User("Admin", "master");
        Auth auth = new Auth();

        String username = "", password = "";

        Book codeComplete = new Book("Code Complete 2");
        Book secondChances = new Book("Second Chances");

        library.addBook(codeComplete);
        library.addBook(secondChances);

        System.out.print("Masukan username Anda: ");
        username = ip.nextLine();
        System.out.print("Masukan password Anda: ");
        password = ip.nextLine();

        boolean isAuth = auth.isLogin(user, username, password);

        if (isAuth) {
            boolean isExit = false;
            System.out.println("Selamat datang di sistem perpustakaan!");
            while (!isExit) {
                System.out.println("1. List Buku\n2. Buku Dipinjemkan\n3. Memgembalikan buku\n4. Keluar");
                int option = ip.nextInt();
                ip.nextLine();

                switch (option) {
                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }

            }
        } else {
            System.err.println("Invalid username and password.");
        }
    }
}
