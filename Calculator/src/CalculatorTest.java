import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        double x , y;
        char s;

        Scanner input = new Scanner(System.in);

        x = input.nextDouble();
        s = input.next().charAt(0);
        y = input.nextDouble();
        if(s=='-')
        {
        	Sub sub = new Sub(x,y);
            System.out.println("Difference="+sub.getSub());
        }
        else if(s=='+')
        {
        	Add sum = new Add(x,y);
            System.out.println("Summation= "+sum.getSum());
        }

        else if(s=='/')
        {
        	Div div = new Div(x , y);
            System.out.println("Quotient= "+div.getDiv());
        }

        else if(s=='*')
        {
        	Mul mul = new Mul(x ,y);
            System.out.println("Product= "+mul.getMul());
        }

        else if(s=='^')
        {
        	Power p = new Power(x, y);
            System.out.println("Power= "+ p.getPow());
        }
    }
}