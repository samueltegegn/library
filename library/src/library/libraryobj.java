package library;

public abstract class libraryobj {
	private int itemnum;
	private String title;

	
	
	public libraryobj(int itemnum, String title) {
		this.itemnum= itemnum;
		this.title=title;
				
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void reserved() {
		System.out.println("The item is reserved");

	}

	public void checkedln() {
		System.out.println("The item is checked in");
	}
	public void dueDate() {
		System.out.println("Return in 30 days");
		
	}
	public Double finesAccured(int numberofdays) {
			return  numberofdays * 0.50;
		
	}
	public String toString() {
		return ("The item number was " + this.itemnum + " and the title was " + this.title);
	}
}
