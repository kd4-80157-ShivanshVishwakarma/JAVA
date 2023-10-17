package assign_3_2;

//package com.sunbeam.classes;
import java.math.*;

public class Point2DArr {

	private int x;
	private int y;
	
	public Point2DArr(int x, int y) {
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
	
	public boolean isEqual(Point2DArr p1) {
		if((this.x==p1.x) && (this.y==p1.y)) {
			return true;
		}
		return false;
	}
	public double distanceP(Point2DArr p1) {
		int x=this.x-p1.x;
		int y=this.y-p1.y;
		double P1= Math.pow(x,2);
		double P2= Math.pow(y,2);
		double P=P1+P2;
		double dist=Math.sqrt(P);
		return dist;
	}
	
}



