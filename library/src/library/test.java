/* ITC
 115: Final coding project
 *Samuel Tegegn
 */
package library;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		books b1 = new books(10, "Introduction to java");// initializing book
		dvdcd d1 = new dvdcd(20, "Training on python", "DVD"); //initializing DVD 
		magazine m1 = new magazine(30, "Wired");//initializing magazine
		
		d1.reserved();
		System.out.println(b1.toString());
		System.out.println(m1.toString());
		
		int numberofdays = 50; //let say the item keeps the borrower for 30 days
		
		if (numberofdays > 30) {//if the borrower keeps the item more than 30 days
			System.out.println(b1.finesAccured(numberofdays));//prints total fine
		}

	}
	
	
}

