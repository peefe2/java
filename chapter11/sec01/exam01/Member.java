package sec01.exam01;

public class Member {
	public String id;


	public Member(String id) {
	this.id=id;
}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // 매개값이 Member타입인지 확인 
			Member member=(Member) obj; // Member타입으로 강제타입 변환
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
