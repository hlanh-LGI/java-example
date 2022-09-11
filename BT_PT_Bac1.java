package bt_892022;

import java.util.Scanner;
import java.util.Random;

/*_TODO:
 	1.solve first degree equation._(Giai phuong trinh bac 1)
 	2.Nhap day diem.Tim 2 diem có khoang cach lon nhat.
 	3.Tim tam giac gom 3 diem co dien tich lon nhat.
 	4.Tim da giac chua tat ca cac diem có dien tich la nho nhat.(convex hull.)
 */


	//*****************************************************************************************************
	//1.solve first degree equation._(Giai phuong trinh bac 1)
//	double first_order_coefficient,quadratic_coefficient;
//	BT_PT_Bac1 (double B1, double B0)
//	{
//		first_order_coefficient=B1;quadratic_coefficient=B0;
//	}
//	BT_PT_Bac1()
//	{
//		first_order_coefficient=quadratic_coefficient=0;
//	}
//	public String toString() 
//	{
//		return "PT has coefficient B1= " + first_order_coefficient + "\nPT has coefficient B0= "+ quadratic_coefficient;	
//	}
//	
//	void solve_the_equation()
//	{
//		if(first_order_coefficient==0)
//				if(quadratic_coefficient==0)
//					System.out.println("\nPhuong trinh co vo so nghiem !!!");
//				else
//					System.out.println("\nPhuong tring co nghiem!!!");
//		else
//			System.out.println("Phuong tring co nghiem =" + (-quadratic_coefficient/first_order_coefficient));
//	}
	//****************************************************************************************************
	//2.Nhap day diem.Tim 2 diem có khoang cach lon nhat.
class the_point{
		private int x,y;
		the_point(int x,int y){
			this.x=x;
			this.y=y;
		}
		the_point(){
			this.x=0;
			this.y=0;
		}
		//distance:khoang cach.
		double distance(the_point b) {
			return Math.sqrt(Math.pow(this.x -b.x,2) + Math.pow(this.y -b.y,2));
		}
		public String toString()
		{
			return "("+ x + "," + y +")";
		}
	}
//point_sequence: day diem.
public class BT_PT_Bac1{
	the_point []a;
	
	void input()
	{
		System.out.println("input the_point: ");
		int array;
		Scanner sc = new Scanner(System.in);
		array = sc.nextInt();
		a = new the_point[array];
		//random diem
		for(int i=0; i<n; i++) {
			
		}
		
//		for(int i=0; i<array; i++) {
//			a[i] = new the_point();
//		}
	}
	void output() {
		System.out.println("day gom co" + a.length + "the_point:");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	void capdiem()
	{
		double dmax=a[0].distance(a[1]);
		int v1=0, v2=1;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j.length; j++) {
				double d=a [i].distance(a[j]);
				if(d>dmax) {
					dmax=d;
					v1=i;
					v2=j;
				}
			}
			System.out.println("\nhai diem co khoang cach lon nhat= "+ dmax);
			System.out.println("\nhai diem do la: "+ a[v1] + " va " + a[v2]);
		}
		
	}
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*****************************************************************
//		BT_PT_Bac1 m = new BT_PT_Bac1(3,7);
//		System.out.println(m.toString());
//		m.solve_the_equation();
//****************************************************************		
		BT_PT_Bac1 m= new BT_PT_Bac1();
		m.input();
		m.output();
	}

}
