package com.example.retrofitlesson2.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.example.retrofitlesson2.data.network.RetrofitHelper
import com.example.retrofitlesson2.data.network.service.PostService
import com.example.retrofitlesson2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private lateinit var binding:ActivityMainBinding
   private val viewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


            viewModel.getPosts()


    }



}