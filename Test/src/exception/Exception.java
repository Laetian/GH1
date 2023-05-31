/**
 * 
 */
package exception;

/**
 * @author Alumno
 *
 */
public class Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, d;
		d = 0;

		try {

		} catch (ArithmeticException e) {
			e.getCause();

		}
		a = 42 / d;

		System.out.println("mensaje");
	}

}
