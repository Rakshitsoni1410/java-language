import java.util.Scanner;

public class r3 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        int a ;
        System.out.println("enter the no   which you want to check ");
        a =ac.nextInt();
        if (a<0) {
            System.out.println("no is negetive");
        }
       else if(a>0){
        System.out.println("no is postive ");

        }
        else{
            System.out.println("no is zero");
        }
    }
}
