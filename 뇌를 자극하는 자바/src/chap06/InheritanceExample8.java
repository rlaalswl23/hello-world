/**
 * 2018. 5. 17. Dev by KIM.M.J
   chap06
   InheritanceExample6.java
 */
package chap06;

class InheritanceExample8 {

	public static void main(String[] args) {
		
		EmailSender obj1 = new EmailSender("생일을 축하합니다", "고객센터",
				"admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다,");
		
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hahaha.com");
		
	}
	static void send(MessageSender obj, String recipient) {
		obj.sendMessage(recipient);
	}
 
	
}