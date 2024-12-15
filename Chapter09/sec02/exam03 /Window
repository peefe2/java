package sec02.exam03;

public class Window {
	Button button1=new Button();
	Button button2=new Button();
	
	// 필드 초기값으로 대입
	Button.OnClickListener listener=new Button.OnClickListener() {
		
		@Override
		public void OnClick() {
			System.out.println("전화를 겁니다");
		}
	};
	
	Window(){
		button1.SetOnClickListener(listener);
		button2.SetOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("메시지를 보냅니다.");
				
			}
		});
	}

}
