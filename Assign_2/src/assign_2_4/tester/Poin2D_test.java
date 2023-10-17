package tester;
import com.sunbeam.classes.*;

import java.util.Scanner;
import com.sunbeam.classes.*;


public class Poin2D_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x1,x2,y1,y2;
		
		System.out.println("Enter coordinates x and y for point p1 ");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Enter coordinates x and y for point p1 ");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		Point2D pnt1=new Point2D(x1,y1);
		Point2D pnt2=new Point2D(x2,y2);
		
		if(Point2D.isEqual(pnt1,pnt2)) {
			System.out.println("Point P1 and P2 are located in the same position : "+"P1 - "+pnt1.toString()+", P2 - "+pnt2.toString());
		}
		else {
			System.out.println("Distance from P1 to P2 : "+Point2D.distanceP(pnt1,pnt2));
		}
		sc.close();
	}

	

}
