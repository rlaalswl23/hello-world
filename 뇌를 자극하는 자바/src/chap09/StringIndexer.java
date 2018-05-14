package chap09;

public class StringIndexer {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		int index = str1.indexOf("a");        //1번째 인덱스에 위치하고 있습니다.
		//int index = str1.indexOf("a" , 4);  //10번째 인덱스에 위치하고 있습니다.
		//int index = str1.lastIndexOf("a");  //10번째 인덱스에 위치하고 있습니다.
		
		if(index < 0) 
			System.out.println("검색 결과가 없습니다.");
		else
		    System.out.println(index + " 인덱스에 위치하고 있습니다.");
		
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		
		sb.replace(0, 4, "C#");
		System.out.println(sb);
				
	}

}
