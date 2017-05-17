package sort;

import java.io.*;

public class Sort {
		
	
	public static void main (String args[])throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int temp1=0;
		int x=0;
		
		
		System.out.println("Array länge ? :");
		temp1 = Integer.parseInt(in.readLine());
		
		int a[] = new int[temp1];
		
		
		for(int i=0;i<temp1;i++){
				System.out.println("Wert für stelle '"+i+"' eingeben!");
				a[i] = Integer.parseInt(in.readLine());
		}
		
		a=sort(a,temp1);
		
		for(int i=0;i<temp1;i++){
			System.out.print(a[i]);
			}
	}
		
		
		

	public static int[] sort (int[] a,int temp1){
		int temp2;
		int x=0;
		int b = a.length;
		
			for(int i=0;i<temp1;i++){
				for(int j=0;j<temp1;j++){
					
					//if (a[i]<a[j]){}
					
					if (a[j] > a[i]){
						temp2 = a[i];
						a[i] = a[j];
						a[j] = temp2;
						x+=1;
						}
					else{}
				}
			}
			
			return a;
}
		

		
	
	

		
		
		
	}
	
	

