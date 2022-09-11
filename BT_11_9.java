package BT_11_9;

import java.util.Scanner;

public class BT_11_9 {
	
	public static int dem_mang(int arr[]) {
		int i=0;
		int count=0;
		System.out.println(arr.length);
		while(i < arr.length-1) {
			if(arr[i] < arr[i+1] && arr[i+1] < arr[i+2]) {
				i+=3;
			}
			else if (arr[i] < arr[i+2]) {
				i+=2;
			}
			else {
				i+=1;
			}
			count+=1;
			System.out.println(i);
		}
		if (i == (arr.length)-1) {
			count+=1;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap So luong phan tu: ");
//		int n = sc.nextInt();
		int []arr = {1,2,3,3};
		System.out.println("Dem mang :" + dem_mang(arr));
		
	}

}
