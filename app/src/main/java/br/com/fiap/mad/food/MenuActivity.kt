package br.com.fiap.mad.food

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.fiap.mad.food.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageLogo = binding.imageViewLogo
        imageLogo.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        val foods = Database.getAll()

        binding.recyclerViewMenuItems.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewMenuItems.adapter = MenuAdapter(foods) { foodId ->
            val intent = Intent(this, FoodDetailActivity::class.java)
            intent.putExtra("FOOD_ID", foodId)
            startActivity(intent)
        }
    }
}