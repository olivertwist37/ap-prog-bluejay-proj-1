import java.util.Scanner;
public class DistFormula{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter first point x");
        double point1x = myObj.nextDouble();
        System.out.println("please enter first pointy");
        double point1y = myObj.nextDouble();
        System.out.println("please enter second point x");
        double point2x = myObj.nextDouble();
        System.out.println("please enter second pointy");
        double point2y = myObj.nextDouble();
        double distance = (point2x-point1x)*2+(point2y-point1y)*2;
        System.out.println("distance = "+distance);
    }
}
