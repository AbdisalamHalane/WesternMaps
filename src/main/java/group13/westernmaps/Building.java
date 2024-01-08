/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * 
 * @author Koroush
 * 
 */

public class Building {
    private String name ;
    private List floors ;
    
    public Building(String name){
        this.name = name;
    }
    
    
    public void setFloorList(List floors){
        this.floors = floors;
    }
    
    /**
     * sets new name
     * @param newName 
     */
    
    public void setBuildingName(String newName){
        this.name = newName;
    }
    /**
     * returns building name
     * @return 
     */
    public String getBuildingName(){
        return this.name;
    }
    /**
     * returns floor list
     * @return 
     */
    public List getFloorList(){
        return this.floors;
    }
    /**
     * returns the number of FLoors
     * @return 
     */
    public int getNumberOfFloors(){
        int toReturn = 0;
        if(this.floors == null)
        {
            return 0;
        }
        else{
            toReturn = this.floors.getSize();
        }
        return toReturn;
    }
    
    /**
     * returns selected floor
     * @param floorname
     * @return 
     */
    public floor getFloor(int floorname) {
        floor currfloor  = null;
        Object[] info = this.floors.found_floor(floorname);
        if (info[1] == null) {
           return  null;
        }else {
            currfloor = (floor)info[1];
        }
        return currfloor ;

    }
    /**
     * removes a floor
     * @param floorname 
     */
    public void removefloor(int floorname,List floorList) {
        floor currfloor  = null;
        int index ;
        Object[] info = this.floors.found_floor(floorname);
        if (info[1] != null) {
            index = (int) info[2];
            this.floors.remove(index);
            floorList.remove(index);
        }
    }
    /**
     * adds an enitrely new floor
     * @param floorname 
     */
    public void addFloorManual(int floorname, List floorList, int image) {
        if(this.floors == null){
            floor floortoadd = new floor(floorname);
            this.floors = new List(floortoadd);
            floorList = new List(image);
        }
        else{
            floor floortoadd = new floor(floorname);
            this.floors.add(floortoadd);
            floorList.add(image);
        }
    }
    /**
     * updates a floor
     */
    
    /**
     * adds a builtinpoi to a floor
     * @param floorNumber
     * @param poiList
     * @param POI 
     */
    public void addBPOItoFloor(int floorNumber,List poiList, BuiltInPOI POI){
        floor floor=  this.getFloor(floorNumber);
        floor.addBuiltInPOI(poiList, POI);
        this.floors.updateFloor(floorNumber, floor);
        
    }
    
    /**
     * removes builtinPOI from a selected floor
     * @param floorNumber
     * @param poiList
     * @param POI 
     */
    public void removeBPOIfromFloor(int floorNumber,List poiList, BuiltInPOI POI){
        floor floor=  this.getFloor(floorNumber);
        floor.removeBuiltInPOI(poiList, POI);
        this.floors.updateFloor(floorNumber, floor);
    }
    
    
    /**
     * adds a builtinpoi to a floor
     * @param floorNumber
     * @param poiList
     * @param POI 
     */
    public void addUPOItoFloor(int floorNumber,List poiList, UserCreatedPOI POI){
        floor floor=  this.getFloor(floorNumber);
        floor.addUserCreatedPOI(poiList, POI);
        this.floors.updateFloor(floorNumber, floor);
    }
    
    /**
     * removes a usercreated poi from a floor
     * @param floorNumber
     * @param poiList
     * @param POI 
     */
    public void removeUPOIfromFloor(int floorNumber,List poiList, UserCreatedPOI POI){
        floor floor=  this.getFloor(floorNumber);
        floor.removeUserCreatedPOI(poiList, POI);
        this.floors.updateFloor(floorNumber, floor);
    }
    
    /**
     * directly adds a new floor
     * @param tempFloor 
     */
    public void addFloorDirect(floor tempFloor){
        if(this.floors == null){
            this.floors = new List(tempFloor);
        }   
        else{
            this.floors.add(tempFloor);
        }
    }
    /**
     * adds a layer
     * @param floorNumber
     * @param layer 
     */
    public void addLayer(int floorNumber,Layers layer){
        floor floor=  this.getFloor(floorNumber);
        floor.addLayer(layer);
        this.floors.updateFloor(floorNumber, floor);
    }
    
    public void updateFloor(int floorNumber, floor toUpdate){
        this.floors.updateFloor(floorNumber, toUpdate);
    }
    
}
