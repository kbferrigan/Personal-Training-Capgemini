package June;

import java.util.Scanner;

class FactContainer{
    private double sum;
    private double num;
    public FactContainer(double numIn){
        sum = 0;
        num = numIn;
    }
     public void multSum(double numIn){
        if (sum != 0){
            sum = sum * numIn;
        } else{
            sum += numIn;
        }

    }
    public void reduceNum(){
        --num;
    }
    public double getSum(){
        return sum;
    }
    public double getNum(){
        return num;
    }
}

public class Factorial {
    static double runFactorial(FactContainer f){
        if (f.getNum() != 0){
            f.multSum(f.getNum());
            f.reduceNum();
            runFactorial(f);
        }
        return f.getSum();
    }

    public static void main(String[] args){
        System.out.println("What number would you like to factorial? ");
        Scanner scan = new Scanner(System.in);
        double numToFactorial = scan.nextDouble();
        FactContainer f = new FactContainer(numToFactorial);
        System.out.println(runFactorial(f));
    }
}
