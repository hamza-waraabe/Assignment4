/** 
 * 
 * @author haa2224
 * Name:Hamza Abshir
 * Assignment4
 * This is a class that describes one room in a house.
 *  The room will have walls that are painted a color. 
 *  The floor will either be hard wood, carpeting, or tiled. 
 *  The room may or may not have windows, but it is possible to have multiple windows in the room. 
 *  This class must include a constructor that takes no input arguments and also an overloaded constructor that takes an input argument for each attribute. 
 *  The class must include a set and get method for each attribute. The class must also include a toString method that will return the current values of all attributes. 
 *  
 * 
 *
 */
    // Create a public class that describes a room.
  public class Room  { 

	//Declaring variables 
	
	//Wallcolor & floor set as string
	String WallColor, Floor; 
	// Windows set as an integer.
	 int Windows;      
	

	 public Room(String WallColor, String Floor, int Windows )
	 
	 {
	     this.WallColor = WallColor;
		  this.Floor = Floor;
		  this.Windows = Windows;
		  
	  } //get method is used to compute the wallcolor.
	  public String getWallColor() 
	  
	  { // returns to room.
	     String WallColor= this.WallColor;  
		  return WallColor; 
		  
	  } //set method is used to compute the wallcolor.
	  public String setWallColor() 
	  
	  {  //then store it in room.
		  return this.WallColor;   
		  
	  }  //get method is used to compute the floor type.
	  public String getFloor()  
	  
	  {  //returns to room.
		  return this.Floor;    
		  
	  }  //set method is used to compute the floor type.
	  public void setFloor(String Floor) 
	  
	  {  //then store in room.
		  this.Floor=Floor;              
		  
	  }  //get method is used to compute number of windows.
	  public int getWindows()   
	  
	  {   //returns to room.
		  return this.Windows;  
		  
	  }  //set method is used to compute the number of windows.
	  public void setWindows(int Windows) 
	  
	  {   //then store it in room.
		  this.Windows=Windows;  
	  }   
	  public String toString()
	  {   
		  return" [WallColor: " + this.WallColor + ", Floor:" + this.Floor + ", Windows:" + this.Windows  + "]" ;	  		
	  }   
}
