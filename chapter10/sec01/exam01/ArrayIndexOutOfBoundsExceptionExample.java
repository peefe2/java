package sec01.exam01;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		String data1=args[0]; // 최소 2개의 인수를 전달하지 않았기에 args배열 인덱스 범위 초과 오류 
		String data2=args[1];
		
		System.out.println("args[0]: "+data1);
		System.out.println("args[1]: "+data2);
		
		// [Run]-[Run Configurations]-[Arguments]-[Program arguments]에 두 개의 매개값 입력하고 실행하면 에외발생 x

	}

}
