import java.util.Scanner;
public class ThirdEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine())
        {
            String[] inputArray = scanner.nextLine().split(" ");
            for (int i = 0; i < inputArray.length; i++) {
                try{
                    int input = Integer.parseInt(inputArray[i]);
                    if (input%3==0)
                    {
                        System.out.println(input);
                    }
                }
                catch(Exception e){}
            }
        }
    }
}
