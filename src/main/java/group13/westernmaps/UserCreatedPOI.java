/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;

/**
 *
 * @author Abdisalam 
 */
public class UserCreatedPOI extends BuiltInPOI{

    
    private boolean userCreatedPoi;
    /**
     * a constructor for usercreatedPOI that sets the built in variable of BuiltInPOI class to false
     * @param name
     * @param description
     * @param roomNumber
     * @param buildingName
     * @param floorNumber
     * @param xyLocation 
     *
     */
    public UserCreatedPOI(String name,String description,String type,int roomNumber,String buildingName,
            int floorNumber, int[] xyLocation){
        super(name,description,type,roomNumber,buildingName,floorNumber,xyLocation,false);
        this.userCreatedPoi = true;

    }
   
}
