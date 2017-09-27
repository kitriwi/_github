package tv2;

interface TV{
	public void powerOn();
	public void powerOff();
	public void volumeUp();
	public void volumeDown();
}
class SamsungTV implements TV{
	public void powerOn(){
		System.out.println("삼성 tv: 전원켜다");
	}
	public void powerOff(){
		System.out.println("삼성 tv: 전원끄다");
	}
	public void volumeUp(){
		System.out.println("삼성 tv: 볼륨올리다");
	}
	public void volumeDown(){
		System.out.println("삼성 tv: 볼륨내리다");
	}
}
class LgTV implements TV{
	public void powerOn(){
		System.out.println("엘지 tv: 전원켜다");
	}
	public void powerOff(){
		System.out.println("엘지 tv: 전원끄다");
	}
	public void volumeUp(){
		System.out.println("엘지 tv: 볼륨올리다");
	}
	public void volumeDown(){
		System.out.println("엘지 tv: 볼륨내리다");
	}
}
class TVFactory{
	public static TV getTV(String brand){
		TV tv = null;
		if(brand.equals("samsung")){
			tv = new SamsungTV();
		}else if(brand.equals("lg")){
			tv = new LgTV();
		}
		return tv;
	}
}
//SamsungTV , LgTV 선택권 존재 경우:
//TV 변경시 마다 자바 소스 수정 불가피
//1개 파일 변경 수정 - 다른 파일 변경 수정
//main - factory 시켜서 결과 리턴
public class TVCommandFactoryUser {

	public static void main(String[] args) {
		TV tv = TVFactory.getTV(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}

}
