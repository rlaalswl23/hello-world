package chap06;

public interface Lendable {

	// 추상메소드
	abstract void checkOut(String borrower, String date);  // 대출하는 기능
	abstract void checkIn();                               // 반납하는 기능
}


