/**
 * 2018. 5. 15. Dev by KIM.M.J
   chap09
   LongLongString.java
 */
package chap09;

/**
 * @author Administrator
 *
 */
public class LongLongString {

	public static void main(String[] args) {
		
		StringBuilder stringbuilder = new StringBuilder();
		
		for(String str : args) {
			    
			stringbuilder.append(str);
			stringbuilder.append(" ");
		}
		
		System.out.println(stringbuilder);

	}

}
