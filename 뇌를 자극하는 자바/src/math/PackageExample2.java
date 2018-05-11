/**
 * 2018. 5. 11. Dev by KIM.M.J
   math
   PackageExample2.java
 */
package math;

//import geometry.polygon.Rectangle;
// import geometry.polygon.*;

/**
 * @author Administrator
 *
 */
public class PackageExample2 {

	public static void main(String[] args) {

		geometry.polygon.Rectangle rectangle = new geometry.polygon.Rectangle(2, 3);
        System.out.println("넓이:" + rectangle.width);
        System.out.println("높이:" + rectangle.height);
        System.out.println("면적:" + rectangle.getArea());

	}

}
