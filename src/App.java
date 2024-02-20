import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        if(l%2 != 0 && c%2 != 0){
            System.out.println(1);
        }else if(l%2 !=0 &&c%2 ==0){
            System.out.println(0);
        }

        else if(l%2 == 0 && c%2 !=0){
            System.out.println(0);
        }else if(l%2 == 0 && c%2 == 0){
            System.out.println(1);
        }
    }
}
