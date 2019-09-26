package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //todo declare variables a, b, c, discriminant, axis of symmetry, parabla facing, x, y
        double a,b,c,Disciriminant,AxisOfSymmetry,x,y;
        String ParabolaFacing;
        Scanner Radar;
        //todo initialize manually
        Radar = new Scanner(System.in);
        System.out.println("Give me an a");
        a - Radar.nextDouble();
        System.out.println("Give me an b");
        b = Radar.nextDouble();
        System.out.println("Give me an c");
        c = Radar.nextDouble();
//        a=5;
//        b=3;
//        c=1;
        //todo calculations

        AxisOfSymmetry = -b/(2*a);
        Disciriminant = (b*b)-4*(a*c);
        if(Disciriminant>0)
            System.out.println("There are 2 real solutions");
        else if(Disciriminant == 0){
            System.out.println("There is 1 real solutions");
        }
        else {
            System.out.println("There are NO real solutions");
        }
        //todo print results
        System.out.println("Axis of Symmetry: "+AxisOfSymmetry);
        System.out.println("Discriminant: "+Disciriminant);
        //todo initialize for scanner and redo the initialized area

        //todo double check results

































    }
}
