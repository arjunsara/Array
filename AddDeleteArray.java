import java.util.Scanner;

public class AddDeleteArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an arrays:");
		int length = sc.nextInt();
		int[] a = new int[length];
//		int index = 0;
		
		for (int i = 0; i < length; i++) {
			System.out.print("Enters the elements: ");
			a[i]= sc.nextInt();
			
		}
		
		System.out.print("Enter the element to delete:");
		int del = sc.nextInt();
		
		for (int i = 0; i < length; i++) {
			if(del==a[i]) {
				for (int j = i; j < length-1; j++) {
					a[j] = a[j+1];
				}
				break;
				
			}
		}
		
		
		for (int i = 0; i < length-1; i++) {
			System.out.print(a[i] +" " );
			}
		}
	}

