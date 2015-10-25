import java.util.*;
class Subscription {
	static float Subscription_fee = 27000;
	static float Phoned_price = 0;
	public static float Fee(float Phoned_number){
		if(Phoned_number > 400){
			Phoned_price = 200*120 + 200*80+ (Phoned_number-400);
		} else if (Phoned_number >200){
			Phoned_price = 200*120 + (Phoned_number-200)*80;
		} else {
			Phoned_price = Phoned_number*120;
		}
		return Phoned_price;
	}
	public static void Show(){
		System.out.println(Phoned_price);
	}
	public static void main(String[] args) {
	Scanner Data_input = new Scanner(System.in);
	Subscription fee = new Subscription();
	System.out.println("Nhap vao so dien cua gia dinh ban:");
	float Phoned_number = Data_input.nextFloat();
	System.out.print("Gia tien phai tra:");
	fee.Fee(Phoned_number);
	fee.Show();
	}

}