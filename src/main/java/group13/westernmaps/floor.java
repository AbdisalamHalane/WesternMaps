/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;

/**
 *
 * @author Koroush
 */
public class floor {
    private List BuiltInPOIlist;
    private int name ;
    private List UserCreatedPOIlist;
    public List layersList;

    /**
     * constructor, takes name of floor (as String) as argument
     * @param name 
     */
    public floor(int name){
       this.name = name;

    }

    /**
     * returns Name of the floor
     * @return 
     */
    public int getName() {
        return this.name;
    }
    
    public List getBuiltInPOIList(){
        return this.BuiltInPOIlist;
    }
    
    public List getUserCreatedPOIList(){
        return this.UserCreatedPOIlist;
    }
    
    public List getLayerList(){
        return this.layersList;
    }
    
    
    
    /**
     * sets new name
     * @param newName 
     */
    public void setName(int newName){
        this.name = newName;
    }

    /**
     * adds a usercreatedPOI
     * @param poiList
     * @param POI 
     */
    public void addUserCreatedPOI(List poiList, UserCreatedPOI POI) {
        if(this.UserCreatedPOIlist == null)
            {
                this.UserCreatedPOIlist = new List(POI);
        }
        else{
            boolean check = (Boolean)this.UserCreatedPOIlist.found_intArray(POI.getXYLocation())[0];
            if(!check) {
                this.UserCreatedPOIlist.add(POI);
                poiList.add(POI);
            }
        }

    }
    
    
    /**
     * removes a usercreatedPoI from the floor
     * @param poiList
     * @param POI 
     */
     public void removeUserCreatedPOI(List poiList, UserCreatedPOI POI) {
        boolean check = (Boolean)this.UserCreatedPOIlist.found_Layer(POI)[0];
        if(check) {
            this.BuiltInPOIlist.remove((int)this.UserCreatedPOIlist.found_Layer(POI)[1]);
            poiList.remove((int)this.BuiltInPOIlist.found_Layer(POI)[1]);
        }
    }
    
    /**
     * adds new favourite to favourite list
     * @param favList
     * @param POI 
     */
    public favourite adddFavourite(favourite favourites, BuiltInPOI POI) {
        boolean check = POI.getFavourite();
        if (!check ) {
            if(favourites == null)
            {
                favourites= new favourite(POI);
            }
            else{
                favourites.addFav(POI);
            }
        }
        return favourites;

    }
    
    /**
     * 
     * @param favourites
     * @param POI
     * @return 
     */
    public favourite removeFavourite(favourite favourites, UserCreatedPOI POI){
        
        boolean check = POI.getFavourite();
        if(check)
        {
            favourites.removeFav(POI);
        }
        return favourites;
    }

    /**
     * displays a layer
     * needs fixing
     * @param name 
     */
    public void displayLayer(String name) {
        if(this.layersList == null)
        {
            return;
        }
        boolean check = (Boolean) this.layersList.findLayer(name)[0] ;
        Layers layerToDis = (Layers)this.layersList.findLayer(name)[1];
        if (check) {

            layerToDis.display();
        }

    }
    /**
     * hide layer
     * needs fixing
     * @param name 
     */
    public void hideLayer(String name) {
        if(this.layersList == null)
        {
            return;
        }
        boolean check = (Boolean) this.layersList.findLayer(name)[0] ;
        Layers layerTohide = (Layers)this.layersList.findLayer(name)[1];
        if (check) {

            layerTohide.hide();
        }

    }
    
    
    /**
     * adds a new builtInPOI
     * @param poiList
     * @param POI 
     */
    public void addBuiltInPOI(List poiList, BuiltInPOI POI) {
        if(this.BuiltInPOIlist == null)
            {
                this.BuiltInPOIlist = new List(POI);
                return;
            }
        else{
            boolean check = (Boolean)(this.BuiltInPOIlist.found_intArray(POI.getXYLocation())[0]);
            if(!check) {
                this.BuiltInPOIlist.add(POI);
                poiList.add(POI);
            }
        }
    }
    
    /**
     * removes a builtInPOI from the floor
     * @param poiList
     * @param POI 
     */
    public void removeBuiltInPOI(List poiList, BuiltInPOI POI) {
        boolean check = (Boolean)this.BuiltInPOIlist.found_Layer(POI)[0];
        if(check) {
            this.BuiltInPOIlist.remove((int)this.BuiltInPOIlist.found_Layer(POI)[1]);
            
            poiList.remove((int)this.BuiltInPOIlist.found_Layer(POI)[1]);
        }
    }
    
    /**
     * adds a layer using a new poi (creates a layer out of it
     * @param name
     * @param poi 
     */
    public void createNewLayer(String name, BuiltInPOI poi){
        Layers layer = new Layers(name,poi);
        this.layersList.add(layer);
    }
    
    /**
     * adds a layer
     * @param layer 
     */
    public void addLayer(Layers layer){
        if(this.layersList == null){
            this.layersList = new List(layer);
        }
        else{
            this.layersList.add(layer);
        }
    }
    
    /**
     * adds a poi to layer
     * @param name
     * @param POI 
     */
    public void addToLayer(String name, BuiltInPOI POI){
        if((boolean)(this.layersList.findLayer(name)[0])){
            this.layersList.add_to_Layer(name,POI);
        }
    }
    /**
     * removes poi from layer
     * @param name
     * @param POI 
     */
    public void removeFromLayer(String name, BuiltInPOI POI){
        if((boolean)(this.layersList.findLayer(name)[0])){
            this.layersList.removePOIFromLayer(name, POI);
        }
    }

}