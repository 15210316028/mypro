package day1203;

import java.util.Scanner;

public class Rect {

	protected double height;
	protected double width;
	
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Rect()
	{
		this.setHeight(10);
		this.setWidth(10);
	}
	
	public Rect(double height,double width)
	{
		this.setHeight(height);
		this.setWidth(width);
	}
	
	protected double perimeter()
	{
		double perimeter=(this.getHeight()+this.getWidth())*2;
		return perimeter;
	}
	protected double area()
	{
		double area=this.getHeight()*this.getWidth();
		return area;
	}
	
	public static void main(String[] zhu) 
	{
		Rect r=new Rect();
		System.out.println("周长："+r.perimeter()+"\t面积："+r.area());		
		Scanner I=new Scanner(System.in);
		System.out.print("输入高度：");
		double height=I.nextDouble();
		System.out.print("输入宽度：");
		double width=I.nextDouble();
		Rect rt=new Rect(height, width);
		System.out.println("周长："+rt.perimeter()+"\t面积："+rt.area());
	}

}
