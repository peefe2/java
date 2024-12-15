package sec01.exam06;

import ex01.OnClickListener;

public class Button {
	OnClickListener Listener; // 인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener Listener) {
		this.Listener=Listener; // 매개변수의 다형성
	}
	void touch() {
		Listener.onClick(); // 구현 객체의 onClick()메소드 호출
	}
	static interface OnClickListener{
		void onClick(); // 중첩 인터페이스
	}

}
