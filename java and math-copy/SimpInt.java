import java.util.Scanner;
public class SimpInt{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter principle amount");
        double principal = myObj.nextDouble();
        System.out.println("please enter rate");
        double rate = myObj.nextDouble();
        System.out.println("please enter years");
        double years = myObj.nextDouble();
        double amount = principal*Math.pow((1+rate),years);
        System.out.println("amount = "+amount);   
    }
}
