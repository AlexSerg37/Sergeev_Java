import java.util.Scanner;
public class FisrtEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i > 7) {
                System.out.println("Привет");
            }
        }
    }
}

