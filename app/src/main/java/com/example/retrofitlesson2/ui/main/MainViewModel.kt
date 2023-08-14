package com.example.retrofitlesson2.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitlesson2.data.network.RetrofitHelper
import com.example.retrofitlesson2.data.network.service.PostService
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {




    fun getPosts(){
        viewModelScope.launch {
            val retrofit = RetrofitHelper.getRetrofit()
            val service = retrofit.create(PostService::class.java)
            val posts = service.getPosts()
            posts.forEach {
                println(it)
            }
        }
    }


}