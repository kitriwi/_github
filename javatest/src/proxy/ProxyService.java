package proxy;

public class ProxyService implements Service {

	Service s;
	@Override
	public String runSomething() {
		//proxy:비서역할
		System.out.println("proxy가 호출을 대신합니다");

		s = new RealService();
		String result = s.runSomething();
		
		System.out.println("proxy 호출 종료");
		return result;
	}

}
