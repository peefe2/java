package sec02.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony=new Anonymous();
		
		anony.field.TurnOn(); // field
		anony.method1(); // localVar
		anony.method2(
				new RemoteControl() {
					@Override
					public void TurnOn() {System.out.println("SmartTv를 켭니다.");}
					@Override
					public void TurnOff() {System.out.println("SmartTv를 끕니다.");}
				}
		);

	}

}
