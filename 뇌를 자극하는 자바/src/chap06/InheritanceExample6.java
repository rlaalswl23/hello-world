/**
 * 2018. 5. 17. Dev by KIM.M.J
   chap06
   InheritanceExample6.java
 */
package chap06;

abstract class MessageSender {

	String title;
	String senderName;
	
	public MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	
	abstract void sendMessage(String recipient);
}

class EmailSender extends MessageSender{
	
	String senderAddr;
	String emailBody;
	
	public EmailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	@Override
	void sendMessage(String recipient) {
		
		System.out.println("-------------------------");
		System.out.println("제목: " + title);
        System.out.println("보내는 사람: " + senderName + 
        		           " " + senderAddr);
        System.out.println("받는 사람: " + recipient);
        System.out.println("내용: " + emailBody);
	}
}

public class InheritanceExample6 {

	public static void main(String[] args) {
		
/*		EmailSender emailSender = new EmailSender("생일을 축하합니다", "고객센터", "admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
        emailSender.sendMessage("hatman@yeyeye.com");
        emailSender.sendMessage("stickman@hahaha.com");*/
		
		MessageSender messageSender = new EmailSender("생일을 축하합니다", "고객센터", "admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		messageSender.sendMessage("rlaalswl223@naver.com");
	}

}
