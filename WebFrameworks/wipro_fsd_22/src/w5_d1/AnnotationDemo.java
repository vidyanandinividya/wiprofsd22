package w5_d1;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartWatch
{
	String os() default "Ios";
	int version() default 1;
}



@SmartWatch(os="Android",version=6)
class fitbit
{
	String modelNo;
	public fitbit(String modelNo)
	{
		this.modelNo=modelNo;
	}
	public String getModelNo()
	{
		return modelNo;
	}
}

public class AnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fitbit fb=new fitbit("xyz-01");
		System.out.println(fb.getModelNo());
		Class c=fb.getClass();
		Annotation an=c.getAnnotation(SmartWatch.class);
		SmartWatch s=(SmartWatch)an;
		System.out.println(s.os());
		System.out.println(s.version());
		

	}

}
