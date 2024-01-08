/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;

/**
 *
 * @author Abdisalam
 */
public class Layers {

    private String name;
    private String type;
    private int floorNumber;
    private String buildingName_;
    private List list;
    
    public Layers(String name,BuiltInPOI poi)
    {
        this.name = name;
        this.type = poi.getType();
        this.floorNumber = poi.getFloorNumber();
        this.buildingName_ = poi.getBuildingName();
        list = new List(poi);
    }
    
    /**
     * returns Name
     * @return 
     */
    public String getName(){
        return this.name;
    }
    /**
     * sets new name
     * @param newName 
     */
    public void setName(String newName){
        this.name = newName;
    }
    
    /** adds new item to the layer
     * 
     * @param poi 
     */
    public void addNewPOI(BuiltInPOI poi){
        if((Boolean)(this.list.found_Layer(poi))[0]){
           System.out.println("POI already in Layer!");
           return;
        }
        else{
            this.list.add(poi);
        }
    }
    
    /**
     * removes poi from the list
     * @param poi 
     */
    public void removePOI(BuiltInPOI poi){
        
        if(!((Boolean)(this.list.found_Layer(poi))[0])){
           System.out.println("POI not in this Layer!");
           return;
        }
        int index = (Integer)(this.list.found_Layer(poi))[1];
        this.list.remove(index);
    }
    
    /**
     * displays all poi in this list
     */
    public void display(){
        this.list.changeVisibility_Layer(true);
    }
    
    /**
     * sets visibility of all pois in the layer to false
     */
    public void hide(){
        this.list.changeVisibility_Layer(false);
    }
    
    /**
     * sets name
     * @param newName 
     */
    public void setLayerName(String newName){
        this.name = newName;
    }
    
    /**
     * returns Name
     * @return 
     */
    public String getLayerName(){
        return this.name;
    }
    
    
    /**
     * Change type to a new type
     * @param newType 
     */
    public void setType(String newType){
        this.type = newType;
    }
    
    /**
     * returns the building name
     * @return 
     */
    public String getBuildingName(){
        return this.buildingName_;
    }
    
    /**
     * returns the floorNumber
     * @return 
     */
    public int getFloorNumber(){
        return this.floorNumber;
    }
    
    /**
     * returns type of the layer
     * @return 
     */
    public String getType(){
        return this.type;
    }
    
    public List getPOIList(){
        return this.list;
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

        Layers test = new Layers("Layer",poi1);
        test.addNewPOI(poi2);
        test.addNewPOI(poi2);
        test.addNewPOI(poi3);
        test.hide();
        
        System.out.println(test.getPOIList().getSize());
    }
}
