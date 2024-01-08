/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;

/**
 * Admin entity interacting with the application.
 * @author Mohammed Khan
 */
public class Admin extends User {
    
    /** The map of the buildings. */
    //Map map;
    
    
    public Admin(String userName, String Password){
        super(userName,Password);
        super.isAdmin = true;
    }
    /**
     * removes a building
     * @param building
     * @param buildings
     * @return 
     */
    public List[] removeBuilding(String building, List buildings, List buildingImages){
        if(this.isAdmin == true){
            if((boolean)(buildings.findBuilding(building)[0])){
                int index = (int)(buildings.findBuilding(building)[1]);
                buildings.remove(index);
                buildingImages.remove(index);
            }
        }
        
        List[] toReturn = {buildings,buildingImages};
        return toReturn;
    }
    
    /**
     * adds new Building
     * @param building
     * @param buildings
     * @return 
     */
    public List[] addBuilding (String building,List buildings,List buildingImages, int Image){
        
        if(this.isAdmin == true){
            if(building != null){
                if(!((boolean)(buildings.findBuilding(building)[0]))){
                    Building buildingToAdd = new Building(building);
                    buildings.add(buildingToAdd);
                    buildingImages.add(Image);
                }
            }
            else{
                Building buildingToAdd = new Building(building);
                buildings.add(buildingToAdd);
                buildings = new List(Image);
            }
        }
        List[] toReturn = {buildings,buildingImages};
        return toReturn;
    }
    
    /**
     * creates new floor
     * @param floorNumber 
     */
    public Building createNewFloor(floor floor){
       this.currentBuilding.addFloorDirect(floor);
       return this.currentBuilding;
    }
   
    /**
     * removes a floor
     * @param floorNumber 
     */
    public Building removeFloor(int floorNumber){
        this.currentBuilding.removefloor(floorNumber,this.currentBuilding.getFloorList());
        return this.currentBuilding;
    }
    
    
    public Building addBPOI(String name,String description,String type,int roomNumber, int[] xyLocation,List poiList){
        if(!((boolean)(poiList.found_intArray(xyLocation)[0]))){
            
            String buildingName = this.currentBuilding.getBuildingName();
            int floorNumber = this.currentFloor.getName();
            BuiltInPOI tempPOI = new BuiltInPOI(name,description,type,roomNumber,buildingName,floorNumber,xyLocation);
            this.currentFloor.addBuiltInPOI(poiList, tempPOI);
            this.currentBuilding.updateFloor(this.currentFloor.getName(), currentFloor);
        }
        return this.currentBuilding;
    }
    
    public Building removeBPOI(BuiltInPOI poi, List poiList){
            if(((boolean)(poiList.found_intArray(poi.getXYLocation())[0]))){
                this.currentFloor.removeBuiltInPOI(poiList, poi);
                this.currentBuilding.updateFloor(this.currentFloor.getName(), currentFloor);
            }       
            return this.currentBuilding;
        }
    
    
    /**
     * edits a Built In POI
     * @param poiList
     * @param poi
     * @param name
     * @param description
     * @param type
     * @param roomNumber
     * @return 
     */
    public Building editBPOI(List poiList, BuiltInPOI poi,String name,String description,String type,int roomNumber){
        
        this.currentFloor.removeBuiltInPOI(poiList, poi);
        String buildingName = this.currentBuilding.getBuildingName();
        int floorNumber = this.currentFloor.getName();
        BuiltInPOI tempPOI = new BuiltInPOI(name,description,type,roomNumber,buildingName,floorNumber,poi.getXYLocation());
        this.currentFloor.addBuiltInPOI(poiList, tempPOI);
        this.currentBuilding.updateFloor(floorNumber, currentFloor);
        
        return this.currentBuilding;
    }
    
    
    
    
}
