/*
Problem Statement:
-> Write a java program to create an interface that consists of a method to display volume () as an abstract method and redefine this method in the derived classes to suit their requirements.
Create classes called Cone, Hemisphere and Cylinder that implements the interface. Using these three classes, design a program that will accept dimensions of a cone, cylinder and hemisphere interactively and display the volumes.

Volume of cone = (1/3)πr2h
Volume of hemisphere = (2/3)πr3 
Volume of cylinder = πr2h

Dated: May.17.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/


import java.util.Scanner;

interface Demo{
 void volume();
}

class Cone implements Demo
{
	double r,h,vol;
	Cone(double rad,double hei)
	{
		r=rad;
		h=hei;
	}
	public void volume(){
		vol=(1/3.0)*3.14*r*r*h;
		System.out.println("Volume of Cone is: "+vol);
	}
}

class Hemisphere implements Demo{
	double r,vol;
	Hemisphere(double rad)
	{r=rad;
	}
	public void volume() {
		vol=(2/3.0)*3.14*r*r*r;
		System.out.println("Volume of Hemisphere is: "+vol);
	}
}

class Cylinder implements Demo{
	double r,vol,h;
	Cylinder(double rad,double hei)
	{
		r=rad;
		h=hei;
	}
	public void volume() {
		vol=3.14*r*r*h;
		System.out.println("Volume of Cylinder is: "+vol);
	}
}
public class CalculateVolumeInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r,h;

		System.out.print("Input radius of Cone: ");
		r=sc.nextDouble();
		System.out.print("Input height of Cone: ");
		h=sc.nextDouble();
		Cone con=new Cone(r,h);
		con.volume();
		System.out.print("Input radius of Hemisphere: ");
		r=sc.nextDouble();
		Hemisphere hemi=new Hemisphere(r);
		hemi.volume();
		System.out.print("Input radius of Cylinder: ");
		r=sc.nextDouble();
		System.out.print("Input height of Cydlinder: ");
		h=sc.nextDouble();
		Cylinder cyl=new Cylinder(r,h);
		cyl.volume();
	
	
	}

}
