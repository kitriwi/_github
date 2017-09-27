package proxy;

public class ProxyMain {

	public static void main(String[] args) {
	//방법1. RealService 호출
	//방법2. ProxyService 호출해서 비서가 대신 하도록
		Service s = new ProxyService();	//Service s = Class.forNmae(args[0]).instance; 쓰면 1,2 선택 가능
		String result = s.runSomething();
		System.out.println(result);
	}
	
	/*방법2의 결과==> 
	proxy가 호출을 대신합니다
	proxy 호출 종료
	실제수행서비스입니다
	
	==> realService 결과물도 얻고, 그 전후에 proxy가 해야하는일도 get.
	
	반복되는 부분은 별도로 분리해서 재사용할수있도록해줌
	*/
}
