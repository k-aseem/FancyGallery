package edu.vt.cs5254.fancygallery.api


import edu.vt.cs5254.fancygallery.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

//private const val API_KEY = "10051b4ffea187a1f5ef474c9c456acf"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=${BuildConfig.FLICKR_API_KEY}" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s,geo"
    )
    suspend fun fetchPhotos(@Query("per_page") pageLimit: Int): FlickrResponse
}