package chap09;

import java.util.StringTokenizer;

public class Exercise9_4 {

	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("고슴도치,앵무새|,토끼", ",|");
		
		while(token.hasMoreTokens()) {
		
			String str = token.nextToken();
			System.out.println(str);
		}
		
	}
}