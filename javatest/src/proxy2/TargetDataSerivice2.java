package proxy2;

public class TargetDataSerivice2 implements DataService {

	@Override
	public int insertData(String data) {
		System.out.println(data+"를 mysql db에 저장했습니당");
		return 1;
	}

}
