//11-1
public class SimpleGeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**Construct a default geometric object构造默认几何对象*/
	public SimpleGeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	/**Construct a geometric object object with the specified color
	 * and filed value	 */
	public SimpleGeometricObject(String color,boolean filled) {
		dateCreated = new java.util.Date();
		this.filled = filled;
	}
	
	/**return color*/
	public String getcolor() {
		return color;
	}
	
	/**Set a new color*/
	public void setColor(String color) {
		this.color = color;
	}
	
	/**Return filled. Since filled is boolean,
	 * its getter method is name isFilled*/
	public boolean isFilled() {
		return filled;
	}
	
	/**Set a new filled*/
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/**Get dateCreated*/
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	/**Return a String representation of this project*/
	public String toString() {
		return "created on" + dateCreated + "\ncolor: " + color + "and filled: " + filled;
	}
}







