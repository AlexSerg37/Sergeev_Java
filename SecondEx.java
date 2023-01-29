import java.util.Scanner;
public class SecondEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()){
            String name = scan.next();
            if (name.equals("Вячеслав"))
            {
                System.out.println("Привет, Вячеслав");
            }
            else{
                System.out.println("Нет такого имени");
            }
        }
    }
}


