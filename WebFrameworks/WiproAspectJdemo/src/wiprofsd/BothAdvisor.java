package wiprofsd;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BothAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("Before Method");
		arg0.proceed();
		System.out.println("After Method");
		return null;
	}

}
