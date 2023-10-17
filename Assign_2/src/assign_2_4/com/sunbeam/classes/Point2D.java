package com.sunbeam.classes;
import java.math.*;
public class Point2D {

	int x;
	int y;
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	public static boolean isEqual(Point2D p1,Point2D p2) {
		if((p1.x==p2.x) && (p1.y==p2.y)) {
			return true;
		}
		return false;
	}
	public static double distanceP(Point2D p1,Point2D p2) {
		int x=p2.x-p1.x;
		int y=p2.y-p1.y;
		double P1= Math.pow(x,2);
		double P2= Math.pow(y,2);
		double P=P1+P2;
		double dist=Math.sqrt(P);
		return dist;
	}
	

}
