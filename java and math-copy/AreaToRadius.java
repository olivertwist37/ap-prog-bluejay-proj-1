import java.util.Scanner;
public class AreaToRadius{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter area of circle");
        double area = myObj.nextDouble();
        double radius =Math.sqrt(area/Math.PI);
        System.out.println("radius="+radius);
    }
}