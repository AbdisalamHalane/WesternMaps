/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;

/**
 *
 * @author Abdisalam
 */

public class BuiltInPOI {
   
    private String name;
    private String description;
    private int roomNumber;
    private String type;
    private String buildingName;
    public boolean isFavourite;
    private int floorNumber;
    public boolean builtIn;
    public boolean visible;
    private int[] xyLocation;
    /**
     * The constructor for a new built in poi, takes in the initializes instances
     * of the built in POI, and sets the builtIn variable as true
     * 
     * @param name_
     * @param description_
     * @param roomNumber_
     * @param buildingName_
     * @param floorName_
     * @param xyLocation
     */
    public BuiltInPOI(String name_,String description_,String type,int roomNumber_,String buildingName_,
            int floorNumber, int[] xyLocation){
        
        
        builtIn = true;
        
        name = name_;
        description = description_;
        this.type = type;
        roomNumber = roomNumber_;
        visible = false;  
        isFavourite = false;
        buildingName = buildingName_;
        this.floorNumber = floorNumber;
        this.xyLocation = xyLocation;
    }
    
    /**
     * an alternate constructor allowing someone to set the built in variable to a desired value
     * @param name_
     * @param description_
     * @param roomNumber_
     * @param buildingName_
     * @param floorNumber
     * @param xyLocation
     * @param builtIn 
     */
    public BuiltInPOI(String name_,String description_,String type,int roomNumber_,String buildingName_,
            int floorNumber, int[] xyLocation, boolean builtIn){
        
        
        this.builtIn = builtIn;
        
        name = name_;
        description = description_;
        this.type = type;
        roomNumber = roomNumber_;
        visible = true;  
        isFavourite = false;
        buildingName = buildingName_;
        this.floorNumber = floorNumber;
        this.xyLocation = xyLocation;
    }
    
    
    /**
     * adds new poi to some poi list
     * @param xyArray 
     */
    public void addPOI(List xyArray){
        
        
        String toAdd = Integer.toString(this.xyLocation[0]) +","+Integer.toString(this.xyLocation[1]);
        boolean temp = (Boolean)(xyArray.found_intArray(this.xyLocation)[0]);
        if(temp){
            System.out.println("THIS LOCATION IS TAKEN.");
        }
        if(!temp){
            xyArray.add(toAdd);
            System.out.println("Poi is now added!");

        }
        
        
    }
    /**
     * creates new POI List
     * @return 
     */
    public List creatPOIArray(){
        String head = Integer.toString(this.xyLocation[0]) +","+Integer.toString(this.xyLocation[1]);

        List xyArray = new List(head);
        return xyArray;
    }
    /**
     * returns location of poi in int array format
     * @return 
     */
    public int[] returnLocation()
    {
        return this.xyLocation;
    }
    /**
     * sets new name
     * @param name 
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
   /**
    * sets new description
    * @param description 
    */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * returns description
     * @return 
     */
    public String getDescription()
    {
        return this.description;
    }
    
    /**
     * changed roomNumber
     * @param roomNumber 
     */
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }
    
    /**
     * changes building name
     * @param buildingName 
     */
    public void setBuildingName(String buildingName)
    {
        this.buildingName = buildingName;
    }
    
    /**
     * changes floor number
     * @param floorNumber 
     */
    public void setFloorNumber(int floorNumber)
    {
        this.floorNumber = floorNumber;
    }
   	 
    public void setFavourite(boolean isFav){
      this.isFavourite = isFav;
    }
    
    /**
     * gets favourite value (true or false
     * @return 
     */
    public boolean getFavourite(){
      return this.isFavourite;
    }
    
    /**
     * changes visibility to a desired visibility
     * @param visible 
     */
    public void setVisibility(boolean visible)
    {
        this.visible = visible;
    }
    
    /**
     * changes visibility to visible if not visible and vice versa
     */
    public void changeVisibility()
    {
        this.visible = !(this.visible);
    }
    
    
    /**
     * return name of POI as a string
     * @return 
     */
    public String getName(){
        return this.name;
    }
    /**
     * returns roomnumber as an int
     * @return 
     */
    public int getRoomNumber(){
        return this.roomNumber;
    }
    
    /**
     * returns floor number
     * @return 
     */
    public int getFloorNumber(){
        return this.floorNumber;
    }
    
    /**
     * returns the type of this poi
     * @return 
     */
    public String getType(){
        return this.type;
    }
    
    /**
     * returns building name
     * @return 
     */
    public String getBuildingName(){
        return this.buildingName;
    }  
    
    /**
     * returns a boolean that tracks visibility (true for visible false for not visible)
     * @return 
     */
    public boolean getVisibility(){
        return this.visible;
    }
    
    /**
     * returns a boolean that shows true for built in POI or false if it is not built in
     * @return 
     */
    public boolean getBuiltIn(){
        return this.builtIn;
    }
    
    /**
     * returns xy location 
     * @return 
     */
    public int[] getXYLocation(){
        return this.xyLocation;
    }
    
    public void removeFrom(List xyArray)
    {
        
        int index = (Integer)xyArray.found_intArray(this.xyLocation)[1];
        if (index == 0){
            System.out.println("Location is not in list!");
        }
        else{
            xyArray.remove(index);
            System.out.println("Location is removed!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] xy = {1,2};
        int[] xy2 = {1,3};
        int[] xy3 = {2,3};

        BuiltInPOI poi1 = new BuiltInPOI("one","temp","",2,"middleSex",3,xy);
        BuiltInPOI poi2 = new BuiltInPOI("two","temp","",2,"middleSex",3,xy2);
        BuiltInPOI poi3 = new BuiltInPOI("three","temp","",2,"middleSex",3,xy3);

        List xyArray = poi1.creatPOIArray();
        poi1.addPOI(xyArray);
        poi2.addPOI(xyArray);
        poi3.addPOI(xyArray);
        poi2.removeFrom(xyArray);
    }
}
