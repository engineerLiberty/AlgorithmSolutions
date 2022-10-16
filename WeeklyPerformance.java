import java.text.DecimalFormat;

public class WeeklyPerformance {
    String john="beautiful";
    public void QuadraticSolution(double a,double b,double c){
        DecimalFormat dem = new DecimalFormat("0.00");
        double x1;
        double x2;
        double d = b*b - 4*a*c;

        double d1 = Math.sqrt(-d);
        //dem.format(d1);
        double d2 = Math.sqrt(d);
        if(a==0) {
            System.out.println("Not a valid root");
        }
        else if (d==0){
            x1 = -(b/2*a);
            x2 = -(b/2*a);
            System.out.println("Equal roots: " + "\nroot1: " + x1 + "\nroot2: " + x2);
        } else if (d > 0){
           x1 = (-b+d2)/2*a;
           x2 = (-b-d2)/2*a;
            System.out.println("Equal roots: " + "\nroot1: "  + x1 + "\nroot2: " + x2);
        } else {
            x1 = -b/2*a;
            x2 = -b/2*a;
            System.out.println("Equal roots: " + "\nroot1: " + x1 + " " + " +" +  " " + dem.format(d1) + "i" + "\nroot2: " + x2 +" " + "-" + dem.format(d1) + "i") ;

        }
    }
}

