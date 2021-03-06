/* Item.java
 * Julia Zhao and Tasha Xiao
 * Item class for the 12U final project
 * May 31 2018
 */

public class Item {
  private String name="", description="";
  private boolean isFound=false;
  private int locationX=0, locationY=0, number=-1;
  
  public Item(){ //default constructor
  }
  
  public Item(String name, String description, int locationX, int locationY){
    this.name=name;
    this.description=description;
    this.locationX=locationX;
    this.locationY=locationY;
  }
  
  //set methods for the program, sets the values of the specified variable
  public void setFound(){
    this.isFound=true;
  }
  
  public void setX(int x){
    this.locationX=x;
  }
  
  public void setY(int y){
    this.locationY=y;
  }
  
  //get methods for the program, gets the values of the specified variable
  public String getName(){
    return this.name;
  }
  
  public String getDesc(){
    return this.description;
  }
  
  public int getNum(){
    return this.number;
  }
  
  public boolean getFound(){
    return this.isFound;
  }
  
  public int getX(){
    return this.locationX;
  }
  
  public int getY(){
    return this.locationY;
  }
}
