package sec01.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1=10;
			method();
			
			field2=10;
			method2();
		}
	}
	
	static class C{
		void method() {
			// field1=10; // 정적 멤버클래스 안에서는 바깥 클래스의 인스턴스 필드, 메소드 접근 x
			// method(); 
			
			field2=10;
			method2(); 
		}
	}

}
