package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @Author nicknikandish on 7/24/23
 */
@Component
public class SingletonBean {

	public SingletonBean() {
		System.out.println("Creating a Singleton bean!!!");
	}

	public String getMyScope() {
		return "I'm a Singleton";
	}
}
