class MainChild extends MainParent
{
	public static void main(String[] args) 
	{
		System.out.println("Child Class Main Method Called");
		methodOne();
	}
	public  static void methodOne(){
		System.out.println("Child Class Method");
	}
}
