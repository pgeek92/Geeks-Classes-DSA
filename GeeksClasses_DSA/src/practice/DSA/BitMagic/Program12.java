package practice.DSA.BitMagic;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			int T = in.nextInt();
			while(T --> 0) {
				int N = in.nextInt();
				int[] arr = new int[N];
				for(int i = 0; i < arr.length; i++) {
					arr[i] = in.nextInt();
				}
				
				int result = 0;
				for(int i = 0; i < arr.length; i++) {
					for(int j = i + 1; j < arr.length; j++) {
						result = result > (arr[i] & arr[j]) ? result : (arr[i] & arr[j]); 
					}
				}
				System.out.println(result);
			}
		} finally {
			if(in != null) {
				in.close();
			}
		}
	}

}
