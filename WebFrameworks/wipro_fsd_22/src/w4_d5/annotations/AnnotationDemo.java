package w4_d5.annotations;

public class AnnotationDemo {
	
	@Deprecated
	@SuppressWarnings("deprecation")
	public void display()
	{
		System.out.println("Display method of the class");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationDemo ad=new AnnotationDemo();
		ad.display();

	}

}
