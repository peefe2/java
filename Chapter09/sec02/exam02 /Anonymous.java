package sec02.exam02;

public class Anonymous {
	// 필드 초기값으로 대입
	RemoteControl field=new RemoteControl() {
		@Override
		public void TurnOn() {System.out.println("Tv를 켭니다.");}
		@Override
		public void TurnOff() {System.out.println("Tv를 끕니다.");}
	};
	
	void method1() {
		// 로컬변수값으로 대입
		RemoteControl localVar=new RemoteControl() {
			@Override 
			public void TurnOn() {System.out.println("Audio를 켭니다.");}
			@Override
			public void TurnOff() {System.out.println("Audio를 끕니다.");}
		
		};

		// 로컬변수 사용
		localVar.TurnOn();
	}
	
	void method2(RemoteControl rc) {rc.TurnOn();}
}
