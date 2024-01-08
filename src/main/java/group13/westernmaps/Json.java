/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter; 
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.*;




/**
 *
 * @author Abdisalam
 */
public class Json {

    
    public String file;
    private JSONArray array; 
    /**
     * initalizes a new Json object with the name of the Json File, and the content of the JSon file stored onto the array
     * @param file 
     */
    public Json(String fileName){
       
        this.file = fileName;
        JSONArray array = null;
        try(FileReader file = new FileReader(this.file))
        { 
            JSONParser parser = new JSONParser();
            Object temp = parser.parse(file);
            array = (JSONArray) temp;
        }
        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
        
       this.array = array;
    }
    
   
    /**
     * Updates JSON File
     */
    
    private void UpdateJSON(){
        
        
        try(FileWriter file = new FileWriter(this.file))
        { 
            file.write(this.array.toString());
        }
        catch(IOException e){e.printStackTrace();}
    }
    
    public void addtoJSONArray(Object obj){
        
        try
        {
            if(obj instanceof BuiltInPOI){
            this.write_BuiltInPOI((BuiltInPOI) obj);
            }
            
        }
        catch(Exception e){e.printStackTrace();}
        
        
                    
    }
    
    
    

    /**
     * adds BuiltINPOI to JSON List
     * @param mainArr
     * @param poi 
     */
    private void write_BuiltInPOI(BuiltInPOI poi)
    {
      JSONObject json_POI= new JSONObject();
      json_POI.put("name", poi.getName());
      json_POI.put("description", poi.getDescription());
      json_POI.put("type", poi.getType());
      json_POI.put("roomNumber",poi.getRoomNumber());
      json_POI.put("buildingName",poi.getBuildingName());
      json_POI.put("isFavourite",poi.getFavourite());
      json_POI.put("floorNumber", poi.getFloorNumber());
      json_POI.put("visibile", poi.getVisibility());
      json_POI.put("x", poi.getXYLocation()[0]);
      json_POI.put("y", poi.getXYLocation()[1]);
      JSONObject toADD = new JSONObject();
      
      
      toADD.put("value", json_POI);
      toADD.put("type", "BuiltInPOI");
      this.array.add(toADD);
      this.UpdateJSON();
    }
    
    
        /**
     * adds usercreatedPOI to list
     * @param mainArr
     * @param poi
     * @return 
     */
    private void write_UserCreatedPOI(BuiltInPOI poi)
    {
      JSONObject json_POI= new JSONObject();
      json_POI.put("name", poi.getName());
      json_POI.put("description", poi.getDescription());
      json_POI.put("type", poi.getType());
      json_POI.put("roomNumber",poi.getRoomNumber());
      json_POI.put("buildingName",poi.getBuildingName());
      json_POI.put("isFavourite",poi.getFavourite());
      json_POI.put("floorNumber", poi.getFloorNumber());
      json_POI.put("visibile", poi.getVisibility());
      json_POI.put("x", poi.getXYLocation()[0]);
      json_POI.put("y", poi.getXYLocation()[1]);
      JSONObject toADD = new JSONObject();
      toADD.put("value", json_POI);
      toADD.put("type", "UserCreatedPOI");
      this.array.add(toADD);
    }
    
    
    public JSONObject writeBuilding(Building build){
        
        JSONObject obj = new JSONObject();
        obj.put("buildingName", build.getBuildingName());        
        JSONObject floorNum = new JSONObject();
        int tempFloorSize = build.getFloorList().getSize();
        obj.put("size", build.getFloorList().getSize());
        if(tempFloorSize != 0){
            
        
            JSONObject floorList = new JSONObject();
            for(int i = 1; i<tempFloorSize+1; i++){
                floorList.put(i, this.write_Floor((floor)(build.getFloorList().find(i)[1])));
            }
            obj.put("list",floorList);
            }
        JSONObject toADD = new JSONObject();
        toADD.put("type", "building");
        toADD.put("value", obj);
            
        return toADD;
    }
    
    
    public void writeMap(map map){
        JSONArray arr = new JSONArray();
        this.array = arr;
        JSONObject mapToADD = new JSONObject();
        mapToADD.put("filename", map.getFileName());

        if(map.user != null){
            JSONObject userObj = new JSONObject();
            userObj.put("username", map.getUser().getName());
            userObj.put("password",map.getUser().getPassword());
            mapToADD.put("user", userObj);
        }
        if(map.admin != null){
            JSONObject adminObj = new JSONObject();
            adminObj.put("username", map.getAdmin().getName());
            adminObj.put("password",map.getAdmin().getPassword());
            mapToADD.put("admin", adminObj);
        }
        
        
        if(map.favourites != null){
            mapToADD.put("favourites", this.write_favourites(map.favourites));
        }
        
        if(map.buildingList != null){
            JSONObject buildingList = new JSONObject();
            JSONObject buildingImages = new JSONObject();
            
            int size = map.buildingList.getSize();
            mapToADD.put("buildingsize", size);
            if(size > 0){
                for(int i = 1; i<size+1; i++){
                buildingList.put(i, this.writeBuilding((Building)((map.buildingList.find(i))[1])));
                buildingImages.put(i, (long)(map.buildingImages.find(i))[1]);
                }
             mapToADD.put("buildingimages", buildingImages);
             mapToADD.put("buildinglist",buildingList);
            }
        }
        
        if(map.floorList != null){
            JSONObject floorList = new JSONObject();
            JSONObject floorImages = new JSONObject();
            
            int size = map.floorList.getSize();
            mapToADD.put("floorsize", size);
            if(size > 0){
                for(int i = 1; i<size+1; i++){
                floorList.put(i, this.write_Floor((floor)((map.floorList.find(i))[1])));
                floorImages.put(i, (int)(map.floorImages.find(i))[1]);
                }
             mapToADD.put("floorimages", floorImages);
             mapToADD.put("floorlist",floorList);
            }
        }
        
        if(map.poiList != null){
            int size = map.poiList.getSize();
            
            if(size != 0){
                JSONObject list = new JSONObject();
                for(int i = 1;i<size+1;i++){
                    JSONObject json_POI= new JSONObject();
                    BuiltInPOI poi = (BuiltInPOI)(map.poiList.find(i)[1]);
                
                    json_POI.put("name", poi.getName());
                    json_POI.put("description", poi.getDescription());
                    json_POI.put("type", poi.getType());
                    json_POI.put("roomNumber",poi.getRoomNumber());
                    json_POI.put("buildingName",poi.getBuildingName());
                    System.out.println(poi.getFavourite());
                    json_POI.put("isFavourite",poi.getFavourite());
                    json_POI.put("floorNumber", poi.getFloorNumber());
                    json_POI.put("visibile", poi.getVisibility());
                    json_POI.put("x", poi.getXYLocation()[0]);
                    json_POI.put("y", poi.getXYLocation()[1]);
            
                    if(poi.getBuiltIn()){
                        json_POI.put("poitype", 0);
                    }
                    else{
                        json_POI.put("poitype", 1);
                    }
                    list.put(Integer.toString(i), json_POI);
                }
            mapToADD.put("poisize", size);
            mapToADD.put("poilist", list);
            }
        }
        
        if(map.currentBuilding != null){
            Building building = map.currentBuilding;
            JSONObject temp = this.writeBuilding(building);
            mapToADD.put("currentbuilding", temp);
        }
        if(map.currentFloor != null){
            floor floor = map.currentFloor;
            JSONObject temp = this.write_Floor(floor);
            mapToADD.put("currentfloor", temp);
        }
        this.array.add(mapToADD);
        this.UpdateJSON();
    }
    
    
    public map MakeMap(){
        Iterator i = this.array.iterator();
        JSONObject tempMap = (JSONObject) i.next();;
        
        
        String fileName = (String)tempMap.get("filename");
        
        map toReturn = new map(fileName);
        
        
        if(tempMap.get("favourites") !=null){
            JSONObject temp = (JSONObject)tempMap.get("favourites");
            toReturn.favourites = this.parseFavourites(temp);
        }
        
        if(tempMap.get("poilist")!=null){
            long size = (long)tempMap.get("poisize");
            if(size != 0){
                JSONObject poiList = (JSONObject)tempMap.get("poilist");
                JSONObject poi = (JSONObject)poiList.get(Integer.toString(1));
                if((long)poi.get("poitype")==0){
                    List pList = new List(this.parseBPOI(poi));
                    for(int j = 2; j < size+1; j++){
                        poi = (JSONObject)poiList.get(Integer.toString(j));
                        if((long)poi.get("poitype")==0){
                            pList.add(this.parseBPOI(poi));
                        }
                        else{
                            pList.add(this.parseUPOI(poi));
                        }
                    }
                    toReturn.poiList = pList;
                }
                else{
                    List pList = new List(this.parseUPOI(poi));
                    for(int j = 2; j < size+1; j++){
                        poi = (JSONObject)poiList.get(Integer.toString(j));
                        if((long)poi.get("poitype")==0){
                            pList.add(this.parseBPOI(poi));
                        }
                        else{
                            pList.add(this.parseUPOI(poi));
                        }
                    }
                    toReturn.poiList = pList;
                    
                }
            }
        }
        if(tempMap.get("currentbuilding")!=null){
            toReturn.currentBuilding = this.parseBuilding(toReturn.poiList, (JSONObject)tempMap.get("currentbuilding"));
        }
        if(tempMap.get("currentfloor")!=null){
            toReturn.currentFloor = this.parseFloor(toReturn.poiList, (JSONObject)((JSONObject)tempMap.get("currentfloor")).get("value"));
        }
        if(tempMap.get("user")!= null)
        {
            JSONObject temp = (JSONObject)tempMap.get("user");
            User user = new User((String)temp.get("username"),(String)temp.get("password"));
            toReturn.user = user;
        }
        
        if(tempMap.get("admin") != null){
            JSONObject temp = (JSONObject)tempMap.get("user");
            Admin admin = new Admin((String)temp.get("username"),(String)temp.get("password"));
           toReturn.admin = admin;
        }
        toReturn.changeBuilding(toReturn.currentBuilding);
        toReturn.changeFloor(toReturn.currentFloor);
        if(tempMap.get("buildinglist")!= null){
            long size = (long)tempMap.get("buildingsize");
            if(size != 0){
                JSONObject buildinglist = (JSONObject)tempMap.get("buildinglist");
                JSONObject buildingimages = (JSONObject)tempMap.get("buildingimages");
            
                JSONObject obj__ = (JSONObject)buildinglist.get(Integer.toString(1));
                List bList = new List(this.parseBuilding(toReturn.poiList, (JSONObject)buildinglist.get(Integer.toString(1))));
                for(int j = 2; j<size+1;j++){
                    bList.add(this.parseBuilding(toReturn.poiList, (JSONObject)buildinglist.get(Integer.toString(j))));
                }
                toReturn.buildingList = bList;
            
                List bImages = new List((long)buildingimages.get(Integer.toString(1)));
                for(int j = 2;j<size+1;j++){
                     bImages.add((long)buildingimages.get(Integer.toString(j)));
                }
                toReturn.buildingImages = bImages;
            
            }
        }    
        if(tempMap.get("floorlist") != null){
            long size = (long)tempMap.get("floorsize");
            if(size != 0){
                JSONObject floorList = (JSONObject)tempMap.get("floorlist");
                JSONObject floorImages = (JSONObject)tempMap.get("floorimages");
            
                List fList = new List(this.parseFloor(toReturn.poiList, (JSONObject)((JSONObject)floorList.get(1)).get("value")));
                for(int j = 2; j<size+1;j++){
                    fList.add(this.parseFloor(toReturn.poiList, (JSONObject)((JSONObject)floorList.get(j)).get("value")));
                }
                toReturn.floorList = fList;
            
                List fImages = new List((int)floorImages.get(1));
                for(int j = 2;j<size+1;j++){
                     fImages.add((int)floorImages.get(j));
                }
                toReturn.floorImages = fImages;
            }
        }
        
        return toReturn;
    }
    
    
    
    /**
     * adds a floor object to JSON List
     * @param floor 
     */
    private JSONObject write_Floor(floor floor){
        
        List layers = floor.getLayerList();
        List builtIn = floor.getBuiltInPOIList();
        List UserCreated = floor.getUserCreatedPOIList();
        int floorNumber = floor.getName();
        
        int builtInSize = 0;
        int userCreatedSize = 0;
        int layersSize = 0;
        if(builtIn!=null){
            builtInSize = floor.getBuiltInPOIList().getSize();
        }
        if(UserCreated != null){
            userCreatedSize = floor.getUserCreatedPOIList().getSize();
        }
        if(layers != null){
            layersSize = floor.getLayerList().getSize();
        }
        JSONObject floorToAdd = new JSONObject();
        floorToAdd.put("floorNumber", floorNumber);
        
        floorToAdd.put("builtInSize", builtInSize);
        floorToAdd.put("userCreatedSize", userCreatedSize);
        floorToAdd.put("layersSize", layersSize);
        
        if(builtInSize != 0){
            JSONObject list = new JSONObject();
            
            
            for(int i = 1;i<builtInSize+1;i++){
                JSONObject json_POI= new JSONObject();
                BuiltInPOI poi = (BuiltInPOI)(builtIn.find(i)[1]);
            
                json_POI.put("name", poi.getName());
                json_POI.put("description", poi.getDescription());
                json_POI.put("type", poi.getType());
                json_POI.put("roomNumber",poi.getRoomNumber());
                json_POI.put("buildingName",poi.getBuildingName());
                json_POI.put("isFavourite",poi.getFavourite());
                json_POI.put("floorNumber", poi.getFloorNumber());
                json_POI.put("visibile", poi.getVisibility());
                json_POI.put("x", poi.getXYLocation()[0]);
                json_POI.put("y", poi.getXYLocation()[1]);
            
                if(poi.getBuiltIn()){
                    json_POI.put("poitype", 0);
                }
                else{
                    json_POI.put("poitype", 1);
                }
                list.put(Integer.toString(i), json_POI);
            }
            floorToAdd.put("builtInList", list);
               
        }
        if(userCreatedSize != 0){
            JSONObject list = new JSONObject();
            
            for(int i = 1;i<userCreatedSize+1;i++){
                JSONObject json_POI= new JSONObject();
                BuiltInPOI poi = (BuiltInPOI)(UserCreated.find(i)[1]);
                
                json_POI.put("name", poi.getName());
                json_POI.put("description", poi.getDescription());
                json_POI.put("type", poi.getType());
                json_POI.put("roomNumber",poi.getRoomNumber());
                json_POI.put("buildingName",poi.getBuildingName());
                json_POI.put("isFavourite",poi.getFavourite());
                json_POI.put("floorNumber", poi.getFloorNumber());
                json_POI.put("visibile", poi.getVisibility());
                json_POI.put("x", poi.getXYLocation()[0]);
                json_POI.put("y", poi.getXYLocation()[1]);
            
                if(poi.getBuiltIn()){
                    json_POI.put("poitype", 0);
                }
                else{
                    json_POI.put("poitype", 1);
                }
                list.put(Integer.toString(i), json_POI);
            }
            floorToAdd.put("userCreatedList", list);
            
        }
        if(layersSize != 0){
            JSONObject list = new JSONObject();

            for(int i = 1;i<layersSize+1;i++){
                list.put(Integer.toString(i),write_Layer_Floor((Layers)layers.find(i)[1]));
            }
            floorToAdd.put("layersList", list);

        }
        
        JSONObject toADD = new JSONObject();
        toADD.put("type", "floor");
        toADD.put("value", floorToAdd);
        return toADD;
    }
    
    /**
     * adds new layer (to be used with FLOOR METHOD)
     * @param layer
     * @return 
     */
    private JSONObject write_Layer_Floor(Layers layer)
    {
      JSONObject json_Layer= new JSONObject();
      json_Layer.put("name", layer.getLayerName());
      List tempList = layer.getPOIList();
      
      int size = tempList.getSize();
      
      json_Layer.put("size", size);
      
      if(size == 0)
      {
          return null;
      }
      
      for(int i = 1;i<size+1;i++){
            JSONObject json_POI= new JSONObject();
            BuiltInPOI poi = (BuiltInPOI)(tempList.find(i)[1]);
            
            json_POI.put("name", poi.getName());
            json_POI.put("description", poi.getDescription());
            json_POI.put("type", poi.getType());
            json_POI.put("roomNumber",poi.getRoomNumber());
            json_POI.put("buildingName",poi.getBuildingName());
            json_POI.put("isFavourite",poi.getFavourite());
            json_POI.put("floorNumber", poi.getFloorNumber());
            json_POI.put("visibile", poi.getVisibility());
            json_POI.put("x", poi.getXYLocation()[0]);
            json_POI.put("y", poi.getXYLocation()[1]);
            
            if(poi.getBuiltIn()){
                json_POI.put("poitype", 0);
            }
            else{
                json_POI.put("poitype", 1);
            }
            json_Layer.put(Integer.toString(i), json_POI);
      }
      
      JSONObject toADD = new JSONObject();
      toADD.put("value", json_Layer);
      //
      return toADD;
    }
    
    /**
     * Adds new layer to JsonList
     * @param poi 
     */
    /*
    private void write_Layer(Layers layer)
    {
      JSONObject json_Layer= new JSONObject();
      json_Layer.put("name", layer.getLayerName());
      List tempList = layer.getPOIList();
      
      int size = tempList.getSize();
      
      json_Layer.put("size", size);
      
      if(size == 0)
      {
          return;
      }
      
      for(int i = 1;i<size+1;i++){
            JSONObject json_POI= new JSONObject();
            BuiltInPOI poi = (BuiltInPOI)(tempList.find(i)[1]);
            
            json_POI.put("name", poi.getName());
            json_POI.put("description", poi.getDescription());
            json_POI.put("type", poi.getType());
            json_POI.put("roomNumber",poi.getRoomNumber());
            json_POI.put("buildingName",poi.getBuildingName());
            json_POI.put("isFavourite",poi.getFavourite());
            json_POI.put("floorNumber", poi.getFloorNumber());
            json_POI.put("visibile", poi.getVisibility());
            json_POI.put("x", poi.getXYLocation()[0]);
            json_POI.put("y", poi.getXYLocation()[1]);
            
            if(poi.getBuiltIn()){
                json_POI.put("poitype", 0);
            }
            else{
                json_POI.put("poitype", 1);
            }
            json_Layer.put(Integer.toString(i), json_POI);
      }
      
      JSONObject toADD = new JSONObject();
      toADD.put("value", json_Layer);
      //
      this.array.add(toADD);
    }
    */
    
    
    
    /**
     * Adds new layer object to the JSON List
     * @param poi 
     */
    private JSONObject write_favourites(favourite favourites)
    {
      JSONObject json_Layer= new JSONObject();
      List tempList = favourites.getFavourites();
      
      int size = tempList.getSize();
      
      json_Layer.put("size", size);
      
      
      for(int i = 1;i<size+1;i++){
            JSONObject json_POI= new JSONObject();
            BuiltInPOI poi = (BuiltInPOI)(tempList.find(i)[1]);
            poi.setFavourite(false);
            
            json_POI.put("name", poi.getName());
            json_POI.put("description", poi.getDescription());
            json_POI.put("type", poi.getType());
            json_POI.put("roomNumber",poi.getRoomNumber());
            json_POI.put("buildingName",poi.getBuildingName());
            json_POI.put("isFavourite",poi.getFavourite());
            json_POI.put("floorNumber", poi.getFloorNumber());
            json_POI.put("visibile", poi.getVisibility());
            json_POI.put("x", poi.getXYLocation()[0]);
            json_POI.put("y", poi.getXYLocation()[1]);
            
            if(poi.getBuiltIn()){
                json_POI.put("poitype", 0);
            }
            else{
                json_POI.put("poitype", 1);
            }
            json_Layer.put(Integer.toString(i), json_POI);
      }
      
      return json_Layer;
      //
    }

    
   
    
    /**
     * Parse layer
     * @param obj
     * @return 
     */
    
    private Layers parseLayer(JSONObject obj){
        
        
        String name = (String) obj.get("name");
        JSONObject poiObj = (JSONObject)obj.get(Integer.toString(1));
        Layers toReturn = null;
        
        if((long)(poiObj.get("poitype"))==0){
            BuiltInPOI poi = parseBPOI(poiObj);
            toReturn = new Layers(name,poi);

        }
        else{
            UserCreatedPOI poi = parseUPOI(poiObj);
            toReturn = new Layers(name,poi);

        }
        
        List tempLayer = toReturn.getPOIList();
        
        long size =  (long)(obj.get("size"));
        
        for(int i = 2;i<size+1;i++){
            poiObj = (JSONObject)obj.get(Integer.toString(i));
            
            if((long)(poiObj.get("poitype"))==0){
                BuiltInPOI poi = parseBPOI(poiObj);
                toReturn.addNewPOI(poi);
            }
            else{
                UserCreatedPOI poi = parseUPOI(poiObj);
                toReturn.addNewPOI(poi);
            }
            
        }
        return toReturn;
    }
    /**
     * makes a new a floor
     * @param poiList
     * @param obj
     * @return 
     */
    public Building parseBuilding(List poiList,JSONObject obj2){
        JSONObject obj = (JSONObject)obj2.get("value");
        Building building = new Building((String)obj.get("buildingName"));
        long size = (long)obj.get("size");
        JSONObject list = (JSONObject)obj.get("list");
        for(int i = 1; i<size+1; i++){

            floor tempFloor = this.parseFloor(poiList,(JSONObject)((JSONObject)list.get(Integer.toString(i))).get("value"));
            building.addFloorDirect(tempFloor);
        }
        return building;
    }
    
    /**
     * creates new floor from a JSON object
     * @param poiList
     * @param obj
     * @return 
     */
    public floor parseFloor(List poiList,JSONObject obj){
        
        
        
        floor toReturn = new floor(Math.toIntExact((long)(obj.get("floorNumber"))));
        
        long builtInSize = (long)(obj.get("builtInSize"));
        long userCreatedSize = (long)(obj.get("userCreatedSize"));
        long layersSize = (long)(obj.get("layersSize"));
        
        JSONObject BList = null;
        JSONObject UList = null;
        JSONObject LList = null;
        
        
        if(builtInSize !=0){
            BList = (JSONObject) obj.get("builtInList");
            JSONObject poiObj = (JSONObject)BList.get(Integer.toString(1));
            BuiltInPOI poi = parseBPOI(poiObj);
            toReturn.addBuiltInPOI(poiList, poi);
        }
        if(userCreatedSize !=0){
            UList = (JSONObject) obj.get("userCreatedList");
            JSONObject poiObj = (JSONObject)UList.get(Integer.toString(1));
            UserCreatedPOI poi = parseUPOI(poiObj);
            toReturn.addUserCreatedPOI(poiList, poi);
        }
        if(layersSize != 0){
            LList = (JSONObject) obj.get("layersList");
            JSONObject tempObj = (JSONObject)LList.get(Integer.toString(1));
            JSONObject tempLayer = (JSONObject) tempObj.get("value");
            toReturn.addLayer(parseLayer(tempLayer));
        }
        
        if(builtInSize !=0){
            for(int i = 2; i<builtInSize+1; i++){
                JSONObject poiObj = (JSONObject)BList.get(Integer.toString(i));
                BuiltInPOI poi = parseBPOI(poiObj);
                toReturn.addBuiltInPOI(poiList, poi);
            }
        }
        
        if(userCreatedSize !=0){
            for(int i = 2; i<userCreatedSize+1; i++){
                JSONObject poiObj = (JSONObject)UList.get(Integer.toString(i));
                UserCreatedPOI poi = parseUPOI(poiObj);
                toReturn.addUserCreatedPOI(poiList, poi);             
            }   
        }
        
        if(layersSize != 0){
            for(int i = 2; i<layersSize+1; i++){
                
                LList = (JSONObject) obj.get("layersList");
                JSONObject tempObj = (JSONObject)LList.get(Integer.toString(i));
                JSONObject tempLayer = (JSONObject) tempObj.get("value");
                toReturn.addLayer(parseLayer(tempLayer));
                }
        }
        
        return toReturn;
        
    }
    
    
    /**
     * Parse  favourite
     * @param obj
     * @return 
     */
    private favourite parseFavourites(JSONObject obj){
        
        
        JSONObject poiObj = (JSONObject)obj.get(Integer.toString(1));
        favourite toReturn = null;
        if(poiObj== null){
            return null;
        }
        if((long)(poiObj.get("poitype"))==0){
            BuiltInPOI poi = parseBPOI(poiObj);
            toReturn = new favourite(poi);

        }
        else{
            UserCreatedPOI poi = parseUPOI(poiObj);
            toReturn = new favourite(poi);

        }
        
        List tempLayer = toReturn.getFavourites();
        
        long size =  (long)(obj.get("size"));
        
        for(int i = 2;i<size+1;i++){
            poiObj = (JSONObject)obj.get(Integer.toString(i));
            
            if((long)(poiObj.get("poitype"))==0){
                BuiltInPOI poi = parseBPOI(poiObj);
                toReturn.addFav(poi);
            }
            else{
                UserCreatedPOI poi = parseUPOI(poiObj);
                toReturn.addFav(poi);
            }
            
        }
        return toReturn;
    }
    
    
    /**
     * to be used in LAYERParse
     * Created a new BuiltInPOI from JSON Object
     * @param tempPOI
     * @return 
     */
    private BuiltInPOI parseBPOI(JSONObject tempPOI){
        int x = Math.toIntExact((long)tempPOI.get("x"));
        int y = Math.toIntExact((long)(tempPOI.get("y")));
        int[] xy = {x,y};
        String name = (String) tempPOI.get("name");
        String description = (String) tempPOI.get("description");
        int roomNumber = Math.toIntExact((long)tempPOI.get("roomNumber"));
        String type = (String) tempPOI.get("type");
        String buildingName = (String) tempPOI.get("buildingName");
        int floorNumber = Math.toIntExact((long)tempPOI.get("floorNumber"));
            
        BuiltInPOI toReturn = new BuiltInPOI(name,description, type,roomNumber,buildingName,floorNumber,xy);
        
        toReturn.setFavourite((boolean)tempPOI.get("isFavourite"));
        return toReturn;
        
    }
    
    
    /**
     * to be used in LAYERParse
     * creates a new UserCreated POI from Json OBJECT
     * @param tempPOI
     * @return 
     */
    private UserCreatedPOI parseUPOI(JSONObject tempPOI){
        int x = Math.toIntExact((long)(tempPOI.get("x")));
        int y = Math.toIntExact((long)(tempPOI.get("y")));
        int[] xy = {x,y};
        String name = (String) tempPOI.get("name");
        String description = (String) tempPOI.get("description");
        int roomNumber = Math.toIntExact((long)tempPOI.get("roomNumber"));
        String type = (String) tempPOI.get("type");
        String buildingName = (String) tempPOI.get("buildingName");
        int floorNumber = Math.toIntExact((long)( tempPOI.get("floorNumber")));
            
        UserCreatedPOI toReturn = new UserCreatedPOI(name,description, type,roomNumber,buildingName,floorNumber,xy);
        
        toReturn.setFavourite((boolean)tempPOI.get("isFavourite"));
        return toReturn;
    }
    
    
    
    
    
    
    
    /**
     * Parse BuiltInPOI
     * @param obj
     * @return 
     */
    /*
    private BuiltInPOI parseBuiltInPOI(JSONObject obj){
        
        JSONObject tempPOI = (JSONObject) obj.get("BuiltInPOI");
                       
        int x = (int)((long)tempPOI.get("x"));
        int y = (int)((long)tempPOI.get("y"));
        int[] xy = {x,y};
        String name = (String) tempPOI.get("name");
        String description = (String) tempPOI.get("description");
        int roomNumber = (int)((long)tempPOI.get("roomNumber"));
        String type = (String) tempPOI.get("type");
        String buildingName = (String) tempPOI.get("buildingName");
        int floorNumber = (int)((long) tempPOI.get("floorNumber"));
            
        BuiltInPOI toReturn = new BuiltInPOI(name,description, type,roomNumber,buildingName,floorNumber,xy);
        
        toReturn.setFavourite((boolean)tempPOI.get("isFavourite"));
        return toReturn;
        
    }
    */
    /**
     * Parse UserCreatedPOI
     * @param obj
     * @return 
     */
 /*   
    private UserCreatedPOI parseUserCreatedInPOI(JSONObject obj){
        
        JSONObject tempPOI = (JSONObject) obj.get("UserCreatedPOI");
                       
        int x = (int)((long)tempPOI.get("x"));
        int y = (int)((long)tempPOI.get("y"));
        int[] xy = {x,y};
        String name = (String) tempPOI.get("name");
        String description = (String) tempPOI.get("description");
        int roomNumber = (int)((long)tempPOI.get("roomNumber"));
        String type = (String) tempPOI.get("type");
        String buildingName = (String) tempPOI.get("buildingName");
        int floorNumber = (int)((long) tempPOI.get("floorNumber"));
            
        UserCreatedPOI toReturn = new UserCreatedPOI(name,description, type,roomNumber,buildingName,floorNumber,xy);
        
        toReturn.setFavourite((boolean)tempPOI.get("isFavourite"));
        return toReturn;
        
    }    
*/
    
    
    
    
    public static void main(String args[]) {
        

        
        
        floor Middlesex1 = new floor(1);
        floor Middlesex2 = new floor(2);
        floor Middlesex3 = new floor(3);
        floor Middlesex4 = new floor(4);
        floor Middlesex5 = new floor(5);
        
        
        floor Alumni1 = new floor(1);
        floor Alumni2 = new floor(2);
        floor Alumni3 = new floor(3);
        
        
        floor Weldon1 = new floor(1);
        floor Weldon2 = new floor(2);
        floor Weldon3 = new floor(3);
        floor Weldon4 = new floor(4);
        floor Weldon5 = new floor(5);
        floor Weldon6 = new floor(6);
        floor Weldon7 = new floor(7);
        
        
        
        
        
        Building building1 = new Building("Middlesex");
        
        building1.addFloorDirect(Middlesex1);
        building1.addFloorDirect(Middlesex2);
        building1.addFloorDirect(Middlesex3);
        building1.addFloorDirect(Middlesex4);
        building1.addFloorDirect(Middlesex5);
        Building building2 = new Building("Alumni");
        building2.addFloorDirect(Alumni1);
        building2.addFloorDirect(Alumni2);
        building2.addFloorDirect(Alumni3);
        Building building3 = new Building("Weldon");
        building3.addFloorDirect(Weldon1);
        building3.addFloorDirect(Weldon2);
        building3.addFloorDirect(Weldon3);
        building3.addFloorDirect(Weldon4);
        building3.addFloorDirect(Weldon5);
        building3.addFloorDirect(Weldon6);
        building3.addFloorDirect(Weldon7);
        
        
        
        User user =new User("User","123");
        Admin admin =new Admin("Admin","123");
        map map = new map("temp.json");
        
        map.user = user;
        map.admin = admin;
        
        map.addBuilding(building1);
        map.addBuilding(building2);
        map.addBuilding(building3);
        
        Json json = new Json("temp.json");
        
        json.writeMap(map);
        
        
        //map map2 = json.MakeMap();
        
        
        
    }
    
   
}











