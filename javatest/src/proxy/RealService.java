package proxy;

public class RealService implements Service {

	@Override
	public String runSomething() {
		return "실제수행서비스입니다";
	}

}
