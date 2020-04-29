package alter.nasa.neo;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

//need a class that encapsulates everything - NeoFeed is the response
//links , element count, near earth objects
//create s/t that holds near earth objects
public class NeoFeed {

    //allows you to rename JSON variable names - mimic structure of JSON but change names
    @SerializedName("near_earth_objects")
    HashMap<String, List<NearEarthObject>> nearEarthObjects;

    //holds each of the individual objects
   class NearEarthObject{
       //each obj in array we want these 3 things from it
       String id;
       String name;
       @SerializedName("nasa_jpl_url")
       String nasaJplUrl;
       @SerializedName("is_potentially_hazardous_asteroid")
       boolean hazardous;
    }

}
