package chap06;

public class Square extends Rectangle {

	Square(int sideLenth){
		super(sideLenth, sideLenth);
		
	}
	
	int getSideLenth() {
		return (getWidth() + getHeight()) * 2;
	}
}
