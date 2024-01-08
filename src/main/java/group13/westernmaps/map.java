/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;

/**
 *
 * @author Abdisalam Halane
 */
public class map {
    /**
     * user and Admin objects
     */
    public User user;
    public Admin admin;
    
    private String fileName;
    
    /**
     * favourites object
     */
    public favourite favourites;
    /**
     * a building list and list of their images (satisfy an index to index relationship) 
     */
    public List buildingList;
    public List buildingImages;
    /**
     * list of floors  and list of their images (satisfy an index to index relationship)
     */
    public List floorList;
    public List floorImages;
    
    /**
     * list of all pois saved on map
     */
    public List poiList;
    
    public floor currentFloor;
    public Building currentBuilding;
    
    
    public map(String fileName){
        this.fileName = fileName;
    }
    
    public String getFileName(){
        return this.fileName;
    }
    
    public void setFileName(String newFileName){
        this.fileName = newFileName;
    }
    /**
     * returns User
     * @return 
     */
    
    public User getUser(){
        return this.user;
    }
    
    /**
     * creates new User
     * @param UserName
     * @param PassWord 
     */
    public void makenewUser(String UserName,String PassWord){
        this.user = new User(UserName,PassWord);
    }
    
    /**
     * creates new User
     * @param UserName
     * @param PassWord 
     */
    public void makenewAdmin(String UserName,String PassWord){
        this.user = new User(UserName,PassWord);
    }
    
    /**
     * returns User
     * @return 
     */
    public Admin getAdmin(){
        return this.admin;
    }
    
    public void changeAdminUserName(String Name){
        this.admin.changeUserName(Name);
    }
    
    public void changeUserName(String Name){
        this.user.changeUserName(Name);
    }
    
    
    /**
     * changes Floor
     * @param floor 
     */
    public void changeFloor(floor floor){
        this.currentFloor  = floor;
        this.admin.changeFloor(floor);
        this.user.changeFloor(floor);
    }
    
    /**
     * changes Building
     * @param building 
     */
    public void changeBuilding(Building building){
        this.currentBuilding  = building;
        this.admin.changeBuilding(building);
        this.user.changeBuilding(building);
    }
    
    /**
     * adds a poi
     * @param name
     * @param description
     * @param type
     * @param roomNumber
     * @param xyLocation 
     */
    public void addUPOI(String name,String description,String type,int roomNumber, int[] xyLocation,User user){
        if(poiList == null){
            String input = Integer.toString(xyLocation[0])+","+Integer.toString(xyLocation[1]);
            poiList = new List(input);
            int index = (int)(poiList.found_intArray(xyLocation)[1]);
            poiList.remove(index);
        }
        Building building = user.addPOI(name, description, type, roomNumber, xyLocation, poiList);
        this.UpdateBuilding(building);
    }
    /**
     * removes UserCreatedPOI
     * @param poi 
     */
    public void removeUPOI(UserCreatedPOI poi,User user){
            Building building = user.removePOI(poi, poiList);
            this.UpdateBuilding(building);
    }
    
    /**
     * edits a userCreatedPOI
     * @param user
     * @param poiList
     * @param poi
     * @param name
     * @param description
     * @param type
     * @param roomNumber 
     */
    public void editUPOI(User user, List poiList, UserCreatedPOI poi,String name,String description,String type,int roomNumber){
        Building building = user.editPOI(poiList, poi, name, description, type, roomNumber);
        this.UpdateBuilding(building);

    }
    
    
    /**
     * creates new Layer
     * @param Name
     * @param POI
     * @param user 
     */
    public void createNewLayer(String Name,BuiltInPOI POI, User user){
        Building building = user.createNewLayer(Name, POI);
        this.UpdateBuilding(building); 
    }
    
    /**
     * adds poi to a layer
     * @param layer
     * @param POI
     * @param user 
     */
    public void addPOIToLayer(Layers layer, BuiltInPOI POI, User user){
        Building building = user.addPOItoLayer(layer, POI);
        this.UpdateBuilding(building); 
    }
    
   
    /**
     * removes a POI
     * @param user
     * @param layer
     * @param POI 
     */
    public void removePOIFromLayer(User user,Layers layer, BuiltInPOI POI){
        Building building = user.removeFromLayer(layer, POI);
        this.UpdateBuilding(building); 
    }
    
    
    /**
     * Displays a chosen Layer
     * @param user
     * @param Layer 
     */
    public void displayLayer(User user, Layers Layer){
        Building building = user.displayLayer(Layer);
        this.UpdateBuilding(building); 
    }
    
    /**
     * hides a layer
     * @param user
     * @param Layer 
     */
    public void hideLayer(User user,Layers Layer){
        Building building = user.hideLayer(Layer);
        this.UpdateBuilding(building);
    }
    
    /**
     * adds a favourite
     * @param user
     * @param POI 
     */
    public void addToFavourite(User user, BuiltInPOI POI){
        user.addtoFavourite(POI, favourites);
    }
    
    /**
     * removes a favourite
     */
    public void removeFavourite(User user, BuiltInPOI POI){
        user.removeFavourite(POI, favourites);
    }
    

    
    /**
     * adds new building
     * @param building
     * @param Image 
     */
    public void addBuilding(String building, int Image){

        if (buildingList == null){
            Building b = new Building(building);
            this.buildingImages = new List(b);
            this.buildingList = new List(Image);
            }
        else{
            
            if(!(boolean)(this.buildingList.findBuilding(building))[0]){
                Building b = new Building(building);
                this.buildingList.add(b);
                this.buildingImages.add(Image);
            }
            else{
                return;
            }
        }
    }
    
    /**
     * removes a buildin
     * @param building 
     */
    public void removeBuilding(String building){
        List[] list = admin.removeBuilding(building, buildingList, buildingImages);
        this.buildingList = list[0];
        this.buildingImages = list[1];
    }
    
    /**
     * adds new floor
     * @param floorNumber
     * @param floorName
     * @param image 
     */
    public void createNewFloor(int floorNumber, int floorName, int image){
        floor floor = new floor(floorName);
        if (floorList != null){
            if(!((boolean)(floorList.found_floor(floorNumber)[0]))){
                Building building = admin.createNewFloor(floor);
                floorList.add(floor);
                floorImages.add(image);
                this.UpdateBuilding(building);
            }
        }
        else{
            Building building = admin.createNewFloor(floor);
            floorList = new List(floor);
            floorImages = new List(image);
        }
    }
    /**
     * edits a BuiltInPOI
     * @param poiList
     * @param poi
     * @param name
     * @param description
     * @param type
     * @param roomNumber 
     */
    public void editBuiltInPOI(List poiList, BuiltInPOI poi,String name,String description,String type,int roomNumber){
        Building building = admin.editBPOI(poiList, poi, name, description, type, roomNumber);
        this.UpdateBuilding(building);
    }
    
    /**
     * adds a new BuiltInPOI
     * @param name
     * @param description
     * @param type
     * @param roomNumber
     * @param xyLocation
     * @param poiList 
     */
    public void addBuiltInPOI(String name,String description,String type,int roomNumber, int[] xyLocation){
        if(poiList == null){
            String input = Integer.toString(xyLocation[0])+","+Integer.toString(xyLocation[1]);
            poiList = new List(input);
            int index = (int)(poiList.found_intArray(xyLocation)[1]);
            poiList.remove(index);
        }
        Building building = admin.addBPOI(name, description, type, roomNumber, xyLocation, poiList);
        this.UpdateBuilding(building);
    }
    
    /**
     * removes BuiltInPOI
     * @param poi 
     */
    public void removeBuiltInPOI(BuiltInPOI poi){
        Building building = admin.removeBPOI(poi, poiList);
        this.UpdateBuilding(building);
    }
    
    /**
     * removes a floor
     * @param floorNumber 
     */
    public void removeFloor(int floorNumber){
        floor floor = new floor(floorNumber);
        Building building = admin.removeFloor(floorNumber);
        this.UpdateBuilding(building);
    }
            
    
    /**
     * updates a building
     * @param building 
     */
    public void UpdateBuilding(Building building){
            int index = (int)(this.buildingList.findBuilding(building.getBuildingName()))[1];
            this.buildingList.remove(index);
            int image = (int)(this.buildingImages.find(index))[1];
            this.buildingImages.remove(index);
            this.buildingImages.add(image);
            this.buildingList.add(building);
    }
    
    
    public void addBuilding(Building building){
        if(this.buildingList == null){
            this.buildingList = new List(building);
            this.buildingImages = new List(1);
        }
        else{
            this.buildingList.add(building);
            this.buildingImages.add(1);
        }
    }
    
    /**
     * updates a floor
     * @param floor 
     */
    public void Updatefloor(floor floor){
        int index = (int)(this.floorList.found_floor(floor.getName()))[1];
        this.floorList.remove(index);
        int image = (int)(this.floorImages.find(index))[1];
        this.floorImages.remove(index);
        this.floorImages.add(image);
        this.floorList.add(floor);
    }
    
    
    /**
     * removes a Building from the building List
     * @param building 
     */
    public void removeFromBList(Building building){
        int index = (int)(this.buildingList.findBuilding(building.getBuildingName()))[1];
        this.buildingList.remove(index);
        this.buildingImages.remove(index);
        
    }
    
    /**
     * removes floor from floor list;
     * @param floor 
     */
    public void removeFromFList(floor floor){
        int index = (int)(this.floorList.found_floor(floor.getName()))[1];
        this.floorList.remove(index);
        this.floorImages.remove(index);
    }
    
    /**
     * sets favourite
     * @param fav 
     */
    public void setFavourite(favourite fav){
        this.favourites = fav;
    }
    
    /**
     * reads map from json
     * @return 
     */
    public map readMap(){
        Json json = new Json(this.fileName);
        return json.MakeMap();
    }
    
    /**
     * writes new map
     */
    public void updateMap(){
        Json json = new Json(this.fileName);
        json.writeMap(this);
    }
}
