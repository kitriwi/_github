package command;
//====================================
//Command Pattern
abstract class Command{
	abstract public void run();//2가지 실행 경우
}
class ACommand extends Command{
	public void run(){
		System.out.println("ACommand 실행");
	}
}
class BCommand extends Command{
	public void run(){
		System.out.println("BCommand 실행");
	}
}
//===========================================
//factory method pattern
//===========================================
class CommandFactory{
	public Command getCommand(String name){
		Command c = null;
		if(name.equalsIgnoreCase("a")){
			c=new ACommand();
		}else if(name.equalsIgnoreCase("b")){
			c=new BCommand();
		}
		return c;
		
	}
}
//입력값 - Command 결정 권한 factory : 세부사항 모른다
public class CommandTest {

	public static void main(String[] args) {
		/*//명령형 매개변수 a A 입력
		Command c = null;//ACommand,BCommand
		
		c.run();*/
		CommandFactory factory = new CommandFactory();
		Command c = factory.getCommand(args[0]);
		c.run();
		//새로 객체 생성 x : 기존 객체 재사용
	}

}
