package bt_thong_tin;

import java.util.Scanner;


public class bt_10_9 {
	//TODO:
	/*Khai bao lop sinh vien gom co:
	  	1.Ho va ten.
		2.que quan.
		3.Diem trung binh.
	**Khai bao lop class 
		4.Ten class
		5.so sinh vien.
		6.Danh sach cac sinh vien.
		7.Nhap danh sach.
		8.sap xep danh sach theo ten.
		9.dem so sinh vien o hue.
		10.Cong diem trung binh len 0.3 cho nhung ban que ơ quang nam, nhung khong qua 10.
	 */

	public static class Student{
		private	String name;
		private String Village;
		private float Medium_score;//diem trung binh
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getVillage() {
			return Village;
		}
		public void setVillage(String village) {
			Village = village;
		}
		public float getMedium_score() {
			return Medium_score;
		}
		public void setMedium_score(float medium_score) {
			Medium_score = medium_score;
		}
		public String name() {
			return name;
		}
		public void name(String name){
			this.name=name;
		}
		public String Village() {
			return Village;
		}
		public void setname(String Village) {
			this.Village=Village;
		}
		public float Medium_score() {
			return Medium_score;
		}
		public void Medium_score(float Medium_score) {
			this.Medium_score=Medium_score;
		}
		public String toString() {
			return name + "," + Village + "," + Medium_score;
		}
	}		
		
	class Student_list{
		Student a[];
		int element; // element phantu
		void input(){
			System.out.println("Nhap so luong Sinh_Vien:");
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
			a = new Sinh_Vien[n];
			for(int i=0; i<n; i++){
				float diem;
				String ten;
				String que;
				a[i]=new Sinh_Vien();
				System.out.println("Nhap diem_tb: ");
				diem_tb= sc.nextFloat();
				a[i].setdiem_tb(diem);
				System.out.println("Nhap ho va ten: ");
				name = sc.nextLine();
				a[i].setname(ten);
				System.out.println("Nhap que quan: ");
				que_quan = sc.nextLine();
				a[i].setque_quan(que);
				
			}
		}
	}
		
		
		void input(){
			Scanner sc = new Scanner(System.in);
			System.out.print("que quan: ");
			String que_quan=sc.nextLine();
			System.out.print("Diem trung binh: ");
			int diem_tb =sc.nextInt();
		}
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
