/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;

/**
 * User entity interacting with the maps application.
 * @author Mohammed Khan
 */
public class User {
    
    /** The user's username. */
    private String userName;
    /** The user's password. */
    private String password;
    /**
     * building is public for Admin
     */
    public Building currentBuilding;
    /**
     * floor is public for Admin
     */
    public floor currentFloor;
    
    
    /** Checks if the current user is an admin. */
    public boolean isAdmin;
    
    public User(String userName, String Password){
        this.password = Password;
        this.userName = userName;
        this.isAdmin = false;
    }
    /**
     * displays name
     * @return 
     */
    
    public String getName(){
        return this.userName;
    }
    
    
    /**
     * changes user name
     * @param newName 
     */
    public void changeUserName(String newName){
        this.userName = newName;
    }
   /**
    * changes current floor
    * @param floor 
    */
    public void changeFloor(floor floor){
        this.currentFloor = floor;
    }
    public void changeBuilding(Building building){
        this.currentBuilding = building;
    }
    
    /**
     * adds a new userCreated Point of Interest
     * @param name
     * @param description
     * @param type
     * @param roomNumber
     * @param xyLocation
     * @param poiList 
     */
    public Building addPOI(String name,String description,String type,int roomNumber, int[] xyLocation,List poiList){
        if(!((boolean)(poiList.found_intArray(xyLocation)[0]))){
            
            String buildingName = this.currentBuilding.getBuildingName();
            int floorNumber = this.currentFloor.getName();
            UserCreatedPOI tempPOI = new UserCreatedPOI(name,description,type,roomNumber,buildingName,floorNumber,xyLocation);
            this.currentFloor.addUserCreatedPOI(poiList, tempPOI);
            this.currentBuilding.updateFloor(this.currentFloor.getName(), currentFloor);
        }
        Building toReturn = this.currentBuilding;
        return toReturn;
    }
    
    /**
     * removes a selected userCreated POI
     * @param poi
     * @param poiList
     * @return 
     */
    public Building removePOI(UserCreatedPOI poi, List poiList){
            if(((boolean)(poiList.found_intArray(poi.getXYLocation())[0]))){
                this.currentFloor.removeUserCreatedPOI(poiList, poi);
                this.currentBuilding.updateFloor(this.currentFloor.getName(), currentFloor);
            }       
            Building toReturn = this.currentBuilding;
            return toReturn;
        }
    
    /**
     * edit userCreated POI
     * @param poiList
     * @param poi
     * @param name
     * @param description
     * @param type
     * @param roomNumber 
     */
    public Building editPOI(List poiList, UserCreatedPOI poi,String name,String description,String type,int roomNumber){
        
        this.currentFloor.removeUserCreatedPOI(poiList, poi);
        String buildingName = this.currentBuilding.getBuildingName();
        int floorNumber = this.currentFloor.getName();
        UserCreatedPOI tempPOI = new UserCreatedPOI(name,description,type,roomNumber,buildingName,floorNumber,poi.getXYLocation());
        this.currentFloor.addUserCreatedPOI(poiList, tempPOI);
        this.currentBuilding.updateFloor(floorNumber, currentFloor);
        Building toReturn = this.currentBuilding;
        return toReturn;
    }
    /**
     * returns password of user
     * @return 
     */
    public String getPassword(){
        return this.password;
    }
    
    /**
     * creates new Layer
     * @param Name
     * @param POI 
     */
    public Building createNewLayer(String Name,BuiltInPOI POI){
        this.currentFloor.createNewLayer(Name, POI);
        this.currentBuilding.updateFloor(currentFloor.getName(), currentFloor);
        Building toReturn = this.currentBuilding;
        return toReturn;
        }
    /**
     * adds a POI to a layer
     * @param Name
     * @param POI 
     */
    public Building addPOItoLayer(Layers layer, BuiltInPOI POI){
        String Name = layer.getLayerName();
        this.currentFloor.addToLayer(Name, POI);
        this.currentBuilding.updateFloor(currentFloor.getName(), currentFloor);
        Building toReturn = this.currentBuilding;
        return toReturn;
    }
    
    /**
     * removes a poi from a layer
     * @param layer
     * @param POI
     * @return 
     */
    public Building removeFromLayer(Layers layer, BuiltInPOI POI){
        String Name = layer.getLayerName();
        this.currentFloor.removeFromLayer(Name, POI);
        this.currentBuilding.updateFloor(currentFloor.getName(), currentFloor);
        Building toReturn = this.currentBuilding;
        return toReturn;
    }
    
    
    /**
     * displays a layer
     * @param layer 
     */
    public Building displayLayer(Layers layer){
        String Name = layer.getLayerName();
        this.currentFloor.displayLayer(Name);
        this.currentBuilding.updateFloor(currentFloor.getName(), currentFloor);
        Building toReturn = this.currentBuilding;
        return toReturn;
    }
    
    /**
     * hides a layer
     * @param layer 
     */
    public Building hideLayer(Layers layer){
        String Name = layer.getLayerName();
        this.currentFloor.hideLayer(Name);
        this.currentBuilding.updateFloor(currentFloor.getName(), currentFloor);
        Building toReturn = this.currentBuilding;
        return toReturn;
    }
    
    /**
     * adds a favourite
     * @param POI
     * @param favourite 
     */
    public void addtoFavourite(BuiltInPOI POI, favourite favourite){
        favourite.addFav(POI);
    }
    
    /**
     * removes a favourite
     * @param POI
     * @param favourite 
     */
    public void removeFavourite(BuiltInPOI POI, favourite favourite){
        favourite.removeFav(POI);
    }
}
