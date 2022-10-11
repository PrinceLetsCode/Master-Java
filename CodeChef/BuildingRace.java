package CodeChef;

import java.util.Scanner;

public class BuildingRace {



    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();

        if(T<=0 || T>2500) return;

        while(T-->0)
        {
            double A=scan.nextDouble();
            double B=scan.nextDouble();
            double X=scan.nextDouble();
            double Y=scan.nextDouble();

            double chef_time=A/X;
            double chefina_time=B/Y;

            if(chefina_time>chef_time) System.out.println("Chef");
            else if(chefina_time<chef_time) System.out.println("Chefina");
            else System.out.println("Both");
        }
    }

}
