/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;


/**
 * 
 * @author Abdisalam
 */
public class List {
    
    /**
     * these are the instances of this Class (the head 
     */
    public class node{
        private Object data;
        private node next;
        private int index;
        
        
        public node(){
        }
        
        public node(Object data)
        {
            this.data = data;
        }
        
        /**
         * returns Data
         * @param data 
         */
         public Object getData(){
            return this.data;
        }
        
        /**
         * sets new data
         * @param data 
         */
        public void setData(Object data){
            this.data = data;
        }
        /**
         * sets index
         * @param index 
         */
        public void setIndex(int index)
        {
            this.index = index;
        }
        /**
         * returns index of this node
         * @return 
         */
        public int getIndex(){
            return this.index;
                    
        }
    }
    
    
    private node head;
    private int size;
    /**
     * this is the constructor for the Node(list) Class it initializes the head
     * @param data 
     */
    public List (Object data)
    {
        this.head = new node(data);
        this.head.setIndex(1);
        size = 1;
    }
    /**
     * returns head
     * @return 
     */
    public node getHead(){
        return this.head;
    }
    
    /**
     * returns the size of List
     * @return 
     */
    public int getSize(){
        return this.size;
    }
    
    /**
     * 
     * this the adder function, adds to the end of the list 
     * @param data 
     */
    public void add(Object data)
    {
         /**
          * if head is empty add new head
          */ 
        if(head == null){
            head = new node(data);
            head.setIndex(1);
            size = 1;
            return;
        }
        node curr= this.head;
        /**
        * if head is not empty, then find tail
        */
        int index_ = curr.getIndex();
        while (curr != null){
            index_ = curr.getIndex();
            if (curr.next == null)
            {
                curr.next = new node(data);
                curr = curr.next;
                index_ = index_+1;
                curr.setIndex(index_);
                size = size+1;
                break;
            }
            curr = curr.next;

        }
    }
    /**
     * removes an element with an index
     * @param index 
     */
    
    public void remove(int index){
        /**
         * if index = 1, then remove the head
         */
       node curr = head;

        if (index == 1){
            if(head.next == null){
                head = null;
                size =0;
                return;
            }
            head = head.next;
            curr = head;
            while (curr != null){
            curr.index = (curr.index - 1);
            curr = curr.next;
            
           } size = size -1;
            return;
        }        
        /**
         * else find index
         */
        while (curr != null){
           if(curr.next != null){
           if (curr.next.index == index)
           {
               node next = curr.next.next;
               curr.next= null;
               curr.next = next;
               curr = curr.next;
               size = size - 1;
               while (curr != null){
                    curr.index = (curr.index - 1);
                    curr = curr.next;
                }  
               break;
           }
           }
           curr = curr.next;
        }    
    }
    
    
    
    public Object[] found_fav (int[] elem){
        if(this.head == null)
        {
            Object[] toReturn = {false,0};
            return toReturn;
        }
        
        boolean found = false;
        node curr = this.head;
        String toCheck = Integer.toString(elem[0])+","+Integer.toString(elem[1]);
        BuiltInPOI currPOI = (BuiltInPOI)curr.getData();
        String curr_ = Integer.toString(currPOI.getXYLocation()[0])+","+Integer.toString(currPOI.getXYLocation()[1]);
        int index;
        if(toCheck.equals(curr_))
        {
            found = true;
            index = curr.index;
            Object[] toReturn = {found,index};
            return toReturn; 
        }
        
        while(curr.next != null)
        {
            curr= curr.next;
            currPOI = (BuiltInPOI)curr.getData();
            curr_ = Integer.toString(currPOI.getXYLocation()[0])+","+Integer.toString(currPOI.getXYLocation()[1]);
            if(toCheck.equals(curr_))
            {
                found = true;
                index = curr.index;
                Object[] toReturn = {found,index};
                return toReturn;   
            }
        }
        Object[] toReturn = {found,0};
        return toReturn;
    }
    
    
    
    /**
     * this checks to see if a location is added (only to be used for integer array input)
     * @param elem
     * @return 
     */    
    public Object[] found_intArray (int[] elem){
        if(this.head == null)
        {
            Object[] toReturn = {false,0};
            return toReturn;
        }
        
        boolean found = false;
        node curr = this.head;
        String toCheck = Integer.toString(elem[0])+","+Integer.toString(elem[1]);
        int index;
        if(toCheck.equals(curr.data.toString()))
        {
            found = true;
            index = curr.index;
            Object[] toReturn = {found,index};
            return toReturn; 
        }
        
        while(curr.next != null)
        {
            curr= curr.next;
            if(toCheck.equals(curr.data.toString()))
            {
                found = true;
                index = curr.index;
                Object[] toReturn = {found,index};
                return toReturn;   
            }
        }
        Object[] toReturn = {found,0};
        return toReturn;
    }
    
    public Object[] findPOI(BuiltInPOI poi){
        int[] elem = poi.getXYLocation();
        String toCheck = Integer.toString(elem[0])+","+Integer.toString(elem[1]);
        
        if(head == null){
            Object[] toReturn = {false,0};
            return toReturn;
        }
        
        boolean found = false;
        node curr = this.head;
        int[] elem2 = ((BuiltInPOI)curr.getData()).getXYLocation();
        String data_ = Integer.toString(elem2[0])+","+Integer.toString(elem2[1]);
        int index;
        if(toCheck.equals(data_))
        {
            found = true;
            index = curr.index;
            Object[] toReturn = {found,index};
            return toReturn; 
        }
        
        while(curr.next != null)
        {
            
            curr= curr.next;
            elem2 = ((BuiltInPOI)curr.getData()).getXYLocation();
            data_ = Integer.toString(elem2[0])+","+Integer.toString(elem2[1]);
            if(toCheck.equals(data_))
            {
                found = true;
                index = curr.index;
                Object[] toReturn = {found,index};
                return toReturn;   
            }
        }
        Object[] toReturn = {false,0};
        return toReturn;
        
    }
    
    /**
     * changes visibility of pois in a layer to a specified layer
     * @param visibility 
     */
    public void changeVisibility_Layer(Boolean visibility){
        
        node curr = this.head;
        if (this.head == null)
        {
            System.out.println("List is empty!");
            return;
        }
        
        ((BuiltInPOI)curr.data).setVisibility(visibility);
        curr = curr.next;
        while (curr != null){
            ((BuiltInPOI)curr.data).setVisibility(visibility);
            curr = curr.next;
        }
    }
    
    /**
     * returns data at a given index
     * @param index
     * @return 
     */
    public Object[] find(int index){
        Object[] toReturn = {false,null};
        boolean found = false;
        node curr = this.head;
        if (curr.index == index)
        {
            Object[] temp = {true,curr.data};
            toReturn = temp;
            return toReturn;
        }
        else{
            curr = curr.next;
            
            while (curr != null){
                if (curr.index == index)
                {
                    Object[] temp = {true,curr.data};
                    toReturn = temp;
                }
                curr = curr.next;
            }        
        }
        return toReturn;
    }
    
    
    /**
     * method used for finding pois in a poi list of this class type
     * @param poi
     * @return 
     */
     public Object[] found_Layer(BuiltInPOI poi){
        
        boolean found = false;
        node curr = this.head;
        String toCheck = Integer.toString(poi.getXYLocation()[0])+","+Integer.toString(((BuiltInPOI)poi).getXYLocation()[1]);
        int index;
        
        String toCompare = Integer.toString(((BuiltInPOI)curr.data).getXYLocation()[0])+","+Integer.toString(((BuiltInPOI)curr.data).getXYLocation()[1]);
        if(toCheck.equals(toCompare))
        {
            found = true;
            index = curr.index;
            Object[] toReturn = {found,index};
            return toReturn; 
        }
        
        while(curr.next != null)
        {
            curr= curr.next;
            toCompare = Integer.toString(((BuiltInPOI)curr.data).getXYLocation()[0])+","+Integer.toString(((BuiltInPOI)curr.data).getXYLocation()[1]);
            if(toCheck.equals(toCompare))
            {
                found = true;
                index = curr.index;
                Object[] toReturn = {found,index};
                return toReturn;   
            }
        }
        Object[] toReturn = {found,0};
        return toReturn;
    }
     
     
/**
 * returns an array with a boolean in the first index and Layer object in the next
 * if Layer is not found then it returns false in first index and null in the next
 * @param name
 * @return 
 */
     
     public Object[] findLayer(String name){
         
        node curr = this.head;
        
        if(this.head == null)
        {
            Object[] toReturn = {false,null,0};
            return toReturn;
        }
        
        if(((Layers)curr.getData()).getLayerName().equals(name))
        {
            Object[] toReturn = {true,(Layers)curr.getData(),curr.index};
            return toReturn;
        }
        
        while(curr.next !=null){
            
            curr = curr.next;
            if(((Layers)curr.getData()).getLayerName().equals(name))
        {
            Object[] toReturn = {true,(Layers)curr.getData(),curr.index};
            return toReturn;
        }
        }
        
        Object[] toReturn = {false,null,0};
        return toReturn;
         
     } 
     
     /**
      * Returns a floor
      * @param floorname
      * @return 
      */
     public Object[] found_floor(int floorname) {
        node curr = this.head;
        int index ;
        if(curr == null)
        {
            Object[] toReturn = {false,null,0};

            return toReturn;
        }
        if(((floor)curr.getData()).getName()== floorname)
        {

            Object[] toReturn = {true,(floor)curr.getData(),1};
            return toReturn;

        }

        while(curr.next != null) {
            curr = curr.next;

            if(((floor)curr.getData()).getName()==floorname)
            {
                index = curr.index ;

                Object[] toReturn = {true,(floor)curr.getData(), index};
                return toReturn;

            }
        }

        Object[] toReturn = {false,null,0};

        return toReturn;
    }
     
     /**
      * adds a poi to a layer
      * @param layerName
      * @param POI 
      */
     public void add_to_Layer(String layerName,BuiltInPOI POI) {
        node curr = this.head;
        if(curr == null)
        {
            this.head = new node(new Layers(layerName,POI));
            this.size = 1;
        }
        if(((Layers)this.head.getData()).getName()== layerName)
        {
            Layers tempLayer = (Layers)curr.getData();
            tempLayer.addNewPOI(POI);
            curr.setData(tempLayer);
            return;
        }
        curr = curr.next;
        while(curr != null) {
            
            
            if(((Layers)curr.getData()).getName()==layerName)
            {
                Layers tempLayer = (Layers)curr.getData();
                tempLayer.addNewPOI(POI);
                curr.setData(tempLayer);
            }
            curr = curr.next;
        }
    }
     
     
    /**
     * removes a poi from a layer
     * @param layerName
     * @param POI 
     */
    public void removePOIFromLayer(String layerName,BuiltInPOI POI) {
        node curr = this.head;
        if(curr == null)
        {
            return;
        }
        if(((Layers)this.head.getData()).getName()== layerName)
        {
            Layers tempLayer = (Layers)curr.getData();
            tempLayer.removePOI(POI);
            curr.setData(tempLayer);
            return;
        }
        curr = curr.next;
        while(curr != null) {
            
            
            if(((Layers)curr.getData()).getName()==layerName)
            {
                Layers tempLayer = (Layers)curr.getData();
                tempLayer.removePOI(POI);
                curr.setData(tempLayer);
            }
            curr = curr.next;
        }
    } 
     
    /**
     * updates a floor
     * @param floorName
     * @param updateFloor 
     */
    public void updateFloor(int floorName,floor updateFloor){
        if(this.getHead() == null){
            return;
        }
        node curr = this.getHead();
        if(((floor)(this.head.getData())).getName() == floorName){
            this.head.setData(updateFloor);
        }
        
        curr = curr.next;
        
        while(curr != null){
            if(((floor)(curr.getData())).getName() == floorName){
            curr.setData(updateFloor);
        }
        curr = curr.next;
        }
    }
    
    public Object[] findBuilding(String BuildingName){
        
        if(this.head == null){
            Object[] toReturn = {false,0};
            return toReturn;
        }
        
        node curr = this.head;
        
        if(((Building)(curr.getData())).getBuildingName().equals(BuildingName)){
            Object[] toReturn = {true,1};
            return toReturn;
        }
        curr = curr.next;
        while(curr!= null)
        {
           if(((Building)(curr.getData())).getBuildingName().equals(BuildingName)){
                Object[] toReturn = {true,curr.getIndex()};
                return toReturn;
            } 
           curr = curr.next;
        }
        Object[] toReturn = {false,0};
        return toReturn;
        
    }
    
}
    
