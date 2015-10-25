class Temp{
	static int x = 10;
	public static void show(){ //method
	System.out.println(x);
	}
public static void main (String args[]){
	Temp t = new Temp();
	t.show(); // method call
	Temp t1 = new Temp();//object
	t1.x = 20;
	t1.show();
	}
}