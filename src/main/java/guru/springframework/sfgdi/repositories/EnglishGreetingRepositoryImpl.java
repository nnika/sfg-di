package guru.springframework.sfgdi.repositories;

/**
 * @Author nicknikandish on 7/23/23
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
	@Override
	public String getGreeting() {
		return "Hello World - EN";
	}
}
