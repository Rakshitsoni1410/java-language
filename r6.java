import java.util.*;
public class r6 {
    public static void main(String[] args) {
        
        System.out.print("enter the no of product  ");
        Scanner a = new Scanner(System.in);
        System.out.println("enter the amount");
        Scanner b =new Scanner(System.in);
        int  product = a.nextInt();
        float amount = b.nextFloat();   
        float exp;
        if (product>100) {
        exp = product*amount;
        exp = exp -(exp*0.1f);
        }
        else{
            exp = product*amount;

        }
        System.out.println(exp);

    }
}
