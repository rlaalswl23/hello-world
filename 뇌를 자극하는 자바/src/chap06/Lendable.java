package chap06;

public interface Lendable {

	// 추상메소드
	abstract void checkOut(String borrower, String date);
	abstract void checkIn();
}


