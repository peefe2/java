package sec02.exam03;

import ex01.OnClickListener;

public class Button {
	OnClickListener listener; // 인터페이스 타입 필드
	
	void SetOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	void touch() {
		listener.OnClick(); // 객체의 onClick메소드 호출 
	}
	
	static interface OnClickListener{
		void OnClick(); // 중첩 인터페이스
	}

}
