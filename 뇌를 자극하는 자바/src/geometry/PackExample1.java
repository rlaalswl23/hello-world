/**
 * 2018. 5. 11. Dev by KIM.M.J
   geometry
   PackExample1.java
 */
package geometry;

/**
 * @author Administrator
 *
 */
public class PackExample1 {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(5);
		System.out.println("반지름 = " + circle.radius);
		System.out.println("면적 = " + circle.getArea());
	}
}
