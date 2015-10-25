import java.util.*;
class Number_tower {
	static int Max_number = 100;
	static int[] arrays = new int[100];
	static int length=0;
	static int x =1;
	public static void Show(int number){
		for(int i=1; i<=number;i++){
			arrays[length] = i;
			length++;
			for(int k=0;k<length;k++){
				System.out.print(arrays[k]+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
	Scanner Data_input = new Scanner(System.in);
	Number_tower Tower = new Number_tower();
	System.out.println("Nhap vao so phan tu cua mang:");
	int number = Data_input.nextInt();
	System.out.println("Ket qua:");
	Tower.Show(number);
	}

}