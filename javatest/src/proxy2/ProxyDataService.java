package proxy2;

public class ProxyDataService implements DataService{
	
	DataService s;
	
	public int insertData(String data){
		initDB();	//공통적인 내용(타겟과 무관하게)
		s = new TargetDataSerivice2();	//여기만 바뀌면 됨 타겟데이터서비스종류가
		int result = s.insertData(data);
		if(result == 1){
			commit();
		}else{
			rollback();
		}
		return result;
	}
	
	//여러 객체 공통 수행 내용을 정의한 메소드들 (타겟이 누가 되느냐와 상관없이)
	void initDB(){
		System.out.println("db 연결");
	}
	void commit(){
		System.out.println("commit합니다");
	}
	void rollback(){
		System.out.println("rollback합니다");
	}
}
