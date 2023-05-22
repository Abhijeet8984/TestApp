import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int ar[] = {20,30,40,50,60,70,80};
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		boolean flag =false;
		
		for(int i=0;i<ar.length;i++) {
			if(key==ar[i]) {
			System.out.println("key "+key+"found at index" +i);
			flag=true;
			break;
			}
		}
		if(flag==false) {
		System.out.println("key not found");
		}
	}

}
