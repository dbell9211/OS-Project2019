// Register class 
public class Register {
	
	// Global Variables
	int [] CPU_Register = null; // Initialize To Empty

	// Constructor
	public Register() {}
	
	// Set Register 
	public void setReg(int value, int position) {
		// No space
		if (position == 1) return;
		// If space is available, then assign value to array
		else if (position < CPU_Register.length) {
			CPU_Register[position] = value; 
		} 
		else {
			System.out.println("Something went wrong when tryint to set register");
		}
	}
	
	// Retrieve Register
	public int getReg(int position) {
		return CPU_Register[position];
	}
}
