import java.lang.Math;

public class Point {
	public double xPoint=0;
	public double yPoint=0;
	public double ANG;
	
	public final double AMPLITUDE=100;
	public final double PIE=3.14f;
	
	
	
	public Point(double xPoint, double ang) {
		super();
		this.xPoint = xPoint;
		setANG(ang);
		this.yPoint = (AMPLITUDE) * (Math.sin(ANG*PIE)/180);
		
	}
	
	public Point() {
	}
	
	public void setANG(double ang) {
		this.ANG = ang % 360;
        if (this.ANG < 0) {
            this.ANG += 360;
        }
	}

	
	public double getxPoint() {
		return xPoint;
	}
	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}
	public double getyPoint() {
		return yPoint;
	}
	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}
	
	
	
}
