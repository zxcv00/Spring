package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		//2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Look Up)�Ѵ�.
		TV tv = (TV)factory.getBean("tv");		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring �����̳� ����
		factory.close();
		
		
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV)factory.getBean(args[0]);		
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		
		
		
	

	}

}






