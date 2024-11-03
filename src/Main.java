import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Здравствуйте, в какой папке следует посмотреть зависимости?");

        Scanner scan = new Scanner(System.in);
        String myPath = scan.nextLine();
        // выполнить проверку пути

        System.out.println(myPath);
    }
}