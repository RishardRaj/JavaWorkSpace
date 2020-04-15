
public class TestApp {

	public static void main(String[] args) {
		String text="10000,20,3";
		 float pAmt=Float.parseFloat(text.substring(0,text.indexOf(",")));  
		  float time=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(","))); 
		    float rate=Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
		    
		    System.out.println(pAmt+"    "+time+"    "+rate);

	}

}
