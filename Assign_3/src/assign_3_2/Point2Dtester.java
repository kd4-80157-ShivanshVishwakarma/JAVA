package assign_3_2;
import java.util.Scanner;

public class Point2Dtester {
	
	public static int menu() {
		int choice;
		System.out.println("1.Display details of specific points : ");
		System.out.println("2.Display x,y coordinates of all points : ");
		System.out.println("3.Calculate and Display the distance of specified point : ");
		System.out.println("4.Exit : ");
		System.out.println("Enter your choice : ");
		choice=new Scanner(System.in).nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of points : ");
		int c=sc.nextInt();
		Point2DArr point[]=new Point2DArr[c];
		
		for(int i=0;i<c;++i) {
			int x,y;
			System.out.println("Enter x indice : ");
			x=sc.nextInt();
			
			System.out.println("Enter y indice : ");
			y=sc.nextInt();
			point[i]=new Point2DArr(x,y);
		}	
		int choice,x,y;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Enter the index:");
				x = sc.nextInt();
				if (x > point.length)
					System.out.println("Invalid index");
				else
					System.out.println(point[x].toString());
				break;
			case 2:
				for (Point2DArr point2d : point)
					System.out.println(point2d.toString());
				break;
			case 3:
				System.out.println("Enter the index :");
				x = sc.nextInt();
				System.out.println("Enter the index :");
				y = sc.nextInt();
				if (x > point.length || y > point.length)
					System.out.println("Invalid index");
				else
					System.out.println("Distance between two points: " + point[x].distanceP(point[y]));
				break;

			default:
				break;
			}
		}
	}
	
}
