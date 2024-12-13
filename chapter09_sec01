package sec01.exam01;

// 바깥 클래스
	class A {
	A() {System.out.println("A객체가 생성됨");}
	
	// 인스턴스 멤버 클래스
	class B{
		B() {System.out.println("B객체가 생성됨");}
		int field;
		// static int field; // 불가능
		
		void method1() {}
		// static method2() {} // 불가능
		
	}
	
	// 정적 멤버 클래스
	static class C{
		C() {System.out.println("C객체가 생성됨");}
		int field;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		// 로컬 클래스
		class D{
			D() {System.out.println("D객체가 생성됨");}
			int field;
			// static int field2; // D클래스는 메소드 내부에서만 사용되므로 필요 x
			void method1() {}
			// static void method2(){} // D클래스는 메소드 내부에서만 사용되므로 필요 x
		}
		D d=new D();
		d.field=3;
		d.method1();
	}
}
