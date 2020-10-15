class Calculation{
	int z;
	
public void addition(int x, int y){
	z = x + y;
	System.out.println("The sum of the given numbers:" +z);
	}
	
public void Substruction(int x, int y){
	z = x - y;
	System.out.println("The difference between the given numbers:" +z);
    }
}

public class MainClass extends Calculation{
	public void multiplication(int x, int y){
		
		z = x * y;
		System.out.println("The product of the given numbers:" +z);
	}
	
public static void main(String args[]){
	int a = 5, b = 10;
	MainClass obj1 = new MainClass();
	obj1.addition(a,b);
	obj1.Substruction(a,b);
	obj1.multiplication(a,b);
    }
}
