/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;

import java.util.ArrayList;

/**
 * 
 * @author Koroush
 */

public class favourite {



     private List favorites ;
     
     
     
     public favourite(BuiltInPOI poi){
         poi.setFavourite(true);
         favorites = new List(poi);
         
     }
     public List getFavourites(){
         return this.favorites;
     }
     
     
    /**
     * Adds Poi the favourite class
     * takes a poi object as an argument 
     * @param POI 
     */
     public void addFav(BuiltInPOI POI){
         
        //String toAdd = Integer.toString(POI.getXYLocation()[0]) +","+Integer.toString(POI.getXYLocation()[1]);
        boolean temp = POI.getFavourite();
        if(temp){
            System.out.println("Already Favourite");
        }
        if(!temp){
            
            POI.setFavourite(true);
            favorites.add(POI);
            System.out.println("Poi is now added!");
        }
      }
     
     /**
      * removes a poi from the favourite list
      * @param POI 
      */
     public void removeFav(BuiltInPOI POI){
         
         boolean temp = POI.getFavourite();
         if(temp){
             boolean condition = (boolean)favorites.found_fav(POI.getXYLocation())[0];
             int remove = (int)favorites.found_fav(POI.getXYLocation())[1];
             System.out.println(remove);
             if (condition) {
                 favorites.remove(remove);
                 System.out.println("Poi is removed!");
             }

           
         }
         if(!temp){
             System.out.println("Poi is not in list!");

         }
       }

}