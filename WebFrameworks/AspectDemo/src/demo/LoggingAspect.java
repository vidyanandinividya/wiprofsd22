package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
@Before("execution(* demo.ShoppingCart.checkout(..))")
public void beforelogger() //point cut
	{
		System.out.println(" Before Loggers");	
	}
@After("execution(* *.*.checkout(..))")
public void afterlogger() //point cut
	{
		System.out.println(" After Loggers");	
	}
}
