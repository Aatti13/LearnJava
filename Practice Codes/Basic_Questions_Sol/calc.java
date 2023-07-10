import java.util.Scanner;

public class calc {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int a, b;
            String operator;

            System.out.print("Enter Choice (+;-;x;/): ");
            operator = scan.nextLine();
            System.out.print("Enter Number A: ");
            a = scan.nextInt();
            System.out.print("Enter Number B: ");
            b = scan.nextInt();
            
            
            switch(operator){
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "x":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;
                default:
                    System.out.println("ERROR!!");
                    break;
            }

            scan.close();

        }
    }
}
