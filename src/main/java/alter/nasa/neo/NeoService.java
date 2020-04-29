package alter.nasa.neo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NeoService {
    @GET("/neo/rest/v1/feed?start_date=2020-04-28&end_date=2020-04-29&api_key=DEMO_KEY")
        //parameters to method
    Call<NeoFeed>getAsteroids(@Query("start_date") String startDate,
                              @Query("end_date") String endDate);
    //asteroid ID
    @GET("https:api.nasa.gov/neo/rest/v1/neo/3542519?api_key=DEMO_KEY")
    Call<NeoFeed.NearEarthObject> getAsteroid(@Path("id") String id);

}
