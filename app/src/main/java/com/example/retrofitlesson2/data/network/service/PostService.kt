package com.example.retrofitlesson2.data.network.service

import com.example.retrofitlesson2.data.network.model.Post
import retrofit2.http.GET

interface PostService {

    @GET("posts")
    suspend fun getPosts():List<Post>

}