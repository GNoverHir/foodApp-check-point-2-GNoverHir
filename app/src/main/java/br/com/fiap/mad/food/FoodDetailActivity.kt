package br.com.fiap.mad.food

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.fiap.mad.food.databinding.ActivityFoodDetailBinding
import br.com.fiap.mad.food.databinding.ActivityMenuBinding

class FoodDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityFoodDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFoodDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val foodItem = intent.extras!!.getInt("FOOD_ID")
        val food = Database.getById(foodItem)

        binding.textViewTitle.text = getString(food!!.title)
        binding.imageViewFood.setImageResource(food!!.image)
        binding.textViewPrice.text = "R$ ${food.price}"
        binding.textViewTime.text = "${food.timeToDelivery}m"
        binding.ratingBar.rating = food.rating.toFloat()
        binding.textViewFoodContent.text = getString(food.description)


        val buttonBack = binding.imageButtonBack
        buttonBack.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}