/** 
 * Class to test the methods of Rect.java
 */
public class TestRect {
	public static void main(String [] args){
		testConstructors();
		testEquals();
		testSetters();
		testScale();
		testTranslate();
		testArea();
		testString();
	}
	/**
	 * Tests the constructors and get functions of Rect
	 * 1. Default constructor
	 * 2. Overloaded constructor w/ width and height parameters (cannot be negative)
	 * 3. Overloaded constructor w/ x, y, width and height parameters (w & h cannot be negative)
	 * 4. Overloaded constructor w/ rectangle object parameter
	 */
	public static void testConstructors(){
		Rect r1 = new Rect();
		Rect r2 = new Rect(3,4);
		Rect r3 = new Rect(1,2,3,4);
		Rect r4 = new Rect(r2);
		Rect r5 = new Rect(1,2,-1,-2);
		Rect r6 = new Rect(1,-2);
		if(r1.getX()==0 && r1.getY()==0 && r1.getWidth() == 0 && r1.getHeight()==0){
			if(r2.getX()==0 && r2.getY()==0 && r2.getWidth() == 3 && r2.getHeight()==4){
				if(r3.getX()==1 && r3.getY()==2 && r3.getWidth() == 3 && r3.getHeight()==4){
					if(r4.getX()==0 && r4.getY()==0 && r4.getWidth() == 3 && r4.getHeight()==4){
						if(r5.getX()==1 && r5.getY()==2 && r5.getWidth() == 0 && r5.getHeight()==0){
							if(r6.getX()==0 && r6.getY()==0 && r6.getWidth() == 1 && r6.getHeight()==0){
								System.out.println("1. All constructors are CORRECT.");
								System.out.println("2. All get functions are CORRECT.");
							}else{
								System.out.println("Constructor w/ width and height parmaeters (negative) is incorrect.");
							}
						}else{
							System.out.println("Constructor w/ all parameters (negative) is incorrect.");
						}
					}else{
						System.out.println("Constructor w/ Rect parameter is incorrect.");
					}
				}else{
					System.out.println("Constructor w/ all parameters is incorrect.");
				}
			}else{
				System.out.println("Constructor w/ width and height parameters is incorrect.");
			}
		}else{
			System.out.println("Default Constructor is incorrect.");
		}
	}
	/** 
	 * Tests the equals method for the Rect class
	 * Compares several rectangles with different values
	 */
	public static void testEquals(){
		Rect r1 = new Rect();
		Rect r2 = new Rect(3,4);
		Rect r3 = new Rect(1,2,3,4);
		Rect r4 = new Rect(r2);
		Rect r5 = new Rect(1,2,3,4);
		if(r3.equals(r5) && r2.equals(r4) && !r2.equals(r3) && !r1.equals(r2)){
			System.out.println("3. Equals function is CORRECT.");
		}else{
			System.out.println("Equals function is incorrect.");
		}
	}
	/**
	 * Tests the setLocation and resize methods of the Rect class
	 * width and height cannot be negative
	 */
	public static void testSetters(){
		Rect r1 = new Rect();
		r1.setLocation(1, 2);
		Rect r2 = new Rect();
		r2.setLocation(-1, 5);
		Rect r3 = new Rect();
		r3.resize(3, 4);
		Rect r4 = new Rect();
		r4.resize(3, -4);
		
		if(r1.equals(new Rect(1,2,0,0)) && r2.equals(new Rect(-1,5,0,0))){
			if(r3.equals(new Rect(0,0,3,4)) && r4.equals(new Rect(0,0,3,0))){
				System.out.println("4. Setter functions are CORRECT.");
			}else{
				System.out.println("resize function is incorrect.");
			}
		}else{
			System.out.println("setLocation function is incorrect.");
		}		
	}
	/**
	 * Tests the scale methods of the Rect class
	 * Multiplies value to the width and height if positive 
	 */
	public static void testScale(){
		Rect r1 = new Rect(2,2,2,2);
		r1.scale(5);
		Rect r2 = new Rect(2,2,2,2);
		r2.scale(-2);
		Rect r3 = new Rect(2,2,2,2);
		r3.scale(3, 4);
		Rect r4 = new Rect(2,2,2,2);
		r4.scale(3, -4);
		if(r1.equals(new Rect(2,2,10,10)) && r2.equals(new Rect(2,2,2,2))){
			if(r3.equals(new Rect(2,2,6,8)) && r4.equals(new Rect(2,2,6,2))){
				System.out.println("5. Scale functions are CORRECT.");
			}else{
				System.out.println("scale w/ two parameters is incorrect.");
			}
		}else{
			System.out.println("scale w/ one parameter is incorrect.");
		}
	}
	/**
	 * Tests the translate methods of the Rect class 
	 * Adds the value to the x and y coordinates
	 */
	public static void testTranslate(){
		Rect r1 = new Rect(2,2,2,2);
		r1.translate(5);
		Rect r2 = new Rect(2,2,2,2);
		r2.translate(-5);
		Rect r3 = new Rect(2,2,2,2);
		r3.translate(5,-5);
		if(r1.equals(new Rect(7,7,2,2)) && r2.equals(new Rect(-3,-3,2,2))){
			if(r3.equals(new Rect(7,-3,2,2))){
				System.out.println("6. Translate functions are CORRECT.");
			}else{
				System.out.println("translate w/ two parameters is incorrect.");
			}
		}else{
			System.out.println("translate w/ one parameter is incorrect.");
		}
	}
	/**
	 * Tests the area method of the Rect class
	 * Checks result and that the values were not changed
	 */
	public static void testArea(){
		Rect r1 = new Rect(1,2,3,4);
		if(r1.area()==12 && r1.equals(new Rect(1,2,3,4))){
			System.out.println("7. Area function is CORRECT.");
		}else{
			System.out.println("area function is incorrect. " + r1.area());
		}
	}
	/** 
	 * Tests the toString method of the Rect class
	 * Compares the resulting string
	 */
	public static void testString(){
		Rect r1 = new Rect(1,2,3,4);
		String s = "Loc = (1,2)  W = 3  H = 4";
		String r = ""+r1;
		if(s.equals(r)){
			System.out.println("8. toString function is CORRECT.");
		}else{
			System.out.println("toString function is incorrect.");
			System.out.println(r1);
			System.out.println(s);
		}
	}
}