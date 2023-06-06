import java.util.Scanner;

public class Sem1 {

    public static void main(String[] args) {
        //int i; // от 0 до 1000 простые числа

        for(int i = 2; i < 1001; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            if(count<2)
                System.out.println(i);
        }

        Scanner scanner=new Scanner(System.in);
        System.out.print("1-е число: ");
        String first = scanner.nextLine();
        System.out.print("2-е число: ");
        String second = scanner.nextLine();
        System.out.print("действие: ");
        String word = scanner.nextLine();
        switch (word){
            case "+":
                int tmp=Integer.parseInt(first)+Integer.parseInt(second);
                System.out.println(tmp);
                break;
            case "-":
                tmp=Integer.parseInt(first)-Integer.parseInt(second);
                System.out.println(tmp);
                break;
            case "*":
                tmp=Integer.parseInt(first)*Integer.parseInt(second);
                System.out.println(tmp);
                break;
            case "/":
                tmp=Integer.parseInt(first)/Integer.parseInt(second);
                System.out.println(tmp);
                break;
            case "tbs":
                System.out.println(Integer.toBinaryString(Integer.parseInt(second)));
                break;
            default:
                System.out.println("Действие неверно");
        }


    }
}

