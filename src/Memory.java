
public class Memory {
	
	//
	public String [] instArr = new String[4096];
	//when secondary memory is create an array of string is created to take in 
	private Memory() 
	{
		instArr = new String[4096];
	}
	//read function takes in an index and returns the value at read in index in the instArr
	public String read(int i) 
	{
		return instArr[i];
	}
	//write function takes in a string value and an index then assign the String value to read in index
	public void write(String val, int j) 
	{
		instArr[j] = val;
	}
}
