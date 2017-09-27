package proxy2;

public class TargetDataSerivice implements DataService {

	@Override
	public int insertData(String data) {
		System.out.println(data+"를 oracle db에 저장했습니당");
		return 1;
	}

}
