import java.util.Scanner;
import java.lang.Math;
public class D6{
    public static void main(String[] args){
       int amount1 = (int) (Math.random() * (6-1+1)+1);
       int amount2 = (int) (Math.random() * (6-1+1)+1);
       int amount3 = (int) (Math.random() * (6-1+1)+1);
       int amount4 = (int) (Math.random() * (6-1+1)+1);
       int amount5 = (int) (Math.random() * (6-1+1)+1);
       int amount6 = (int) (Math.random() * (6-1+1)+1);
       int amount7 = (int) (Math.random() * (6-1+1)+1);
       int amount8 = (int) (Math.random() * (6-1+1)+1);
       int amount9 = (int) (Math.random() * (6-1+1)+1);
       int amount10 = (int) (Math.random() * (6-1+1)+1);
       System.out.println("D1 = "+amount1+"   D2 = "+amount2+"   D3 = "+amount3+"   D4 = "+amount4+"   D5 = "+amount5+"   D6 = "+amount6+"   D7 = "+amount7+"   D8= "+amount8+"   D9 = "+amount9+"   D10 = "+amount10);
    }
}
