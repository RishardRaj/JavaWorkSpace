class PrimeGenerator 
{
	public int  generate(){
	for(int i=1;i%2=1;i++){
		System.out.println(i);
	}
	}
}
public class PrimeTest{
public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		PrimeGenerator prime=new PrimeGenerator();
		prime.generate();
	}
}
