// Name: Siddharth Agarwal
// class: CSE 360 
// Assignment:1 

package cse360assignment02;

class AddingMachine

{
	 private int total;
	 private String history;
	  
	  public AddingMachine () 
	  {
	    total = 0; // not needed - included for clarity
	    history= "0";
	  }
	  // method to get total
	  public int getTotal () 
	  {  
	    return total;
	  }
	  //method to add
	  public void add (int value) 
	  {
		  total += value;
	        history += " + " + value;
	  }
	  //method to subtract
	  public void subtract (int value) 
	  { 
		  total -= value;
	        history += " - " + value;
	  }
	  // method toString return the result at last
	  public String toString () 
	  { 
	    return history;
	  }
	  // method to clear 
	  public void clear() 
	  { 
		  total=0;
		  history="0";
	  }

}