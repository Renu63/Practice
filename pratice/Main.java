package pratice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("pratice/Spring.xml");
		student bean = (student) ap.getBean("s");
		System.out.println(bean.getSid());
		System.out.println(bean.getSname());
		address[] ad = bean.getAddress();
		for (address a : ad) {
			System.out.println(a.getAreaName());
			System.out.println(a.getCityName());
		}

	}

}
