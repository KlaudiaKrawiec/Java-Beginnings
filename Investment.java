importimport java.util.Scanner;
import java.util.Locale;
public class Investment{
    public static void Investor(int a){
        System.out.println("Investor #"+a+":");
    }
    public static double PresentValue(){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.UK);
        System.out.print("Initial amount? ");
        double pv = sc.nextDouble();
        return pv;
    }
    public static double Rate(){
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);
        System.out.print("Interest rate%? ");
        double r = s.nextDouble();
        return r;
    }
    public static int NumMonths(){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Num. of months? ");
        int nm = sc.nextInt();
        return nm;
    }
    public static double FutureValue(double pv, double r, int n){
        double x = 1 - r;
        for(int i=0;i<n;i++)
            x *= (1-r);
        double fv = pv * x;
        System.out.printf("Final amount = $%.2f%n",fv);
        return fv; 
    }
    public static double Profit(double pv, double fv){
        double prof = fv - pv;
        double perc = (prof/pv)*100;
        System.out.printf("Profit = $%.2f (%.0f%) %n",prof,perc);
        return perc;
    }
    public static void category(double perc){
        if (perc<=10)
            System.out.println("weak");
        else if (perc>10 && perc<=50)
            System.out.println("medium");
        else if (perc>50)
            System.out.println("strong");
        System.out.println();
    }
    public static void bye(){
        System.out.println("Have a nice day!");
    }
    public static void main(String[] args){
        Investor(1);
        double pv = PresentValue();
        double r = Rate();
        int n = NumMonths();
        double fv = FutureValue(pv,r,n);
        double perc = Profit(pv,fv);
        category(perc);
        
        Investor(2);
        double pv2 = PresentValue();
        double r2 = Rate();
        int n2 = NumMonths();
        double fv2 = FutureValue(pv2,r2,n2);
        double perc2 = Profit(pv2,fv2);
        category(perc2);
        bye();
    }
}
