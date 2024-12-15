package sec01.exam04;

public class Outter {
	// java7 이전
	public void method1(final int arg) {
		final int localVariable=1;
		// arg=100;
		// localVariable=100;
		class Inner{
			public void method() {
				int result=arg+localVariable;
			}
		}
	}
	
	// java8 이후
	public void method2(int arg) {
		int localVariable=1;
		// arg=100;
		// localVariable=100;
		class Inner{
			public void method() {
				int result=arg+localVariable;
			}
		}
	}

}
