package br.com.fiap.mad.food

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(val foods: List<Food>, val onClick: (Int) -> Unit) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {
    class ViewHolder(row: View) : RecyclerView.ViewHolder(row) {
        val textFoodPrice: TextView = row.findViewById(R.id.textViewPrice)
        val textRating: TextView = row.findViewById(R.id.textViewRating)
        val foodImage: ImageView = row.findViewById(R.id.imageViewFood)
        val textTimeToDelivery: TextView = row.findViewById(R.id.textViewTime)
        val textFoodTitle: TextView = row.findViewById(R.id.textViewTitle)
        val buttonDetail: AppCompatButton = row.findViewById(R.id.imageButtonDetail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return ViewHolder(layout)
    }

    override fun getItemCount() = foods.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = foods[position]

        holder.textFoodTitle.text = holder.itemView.context.getString(food.title)
        holder.textFoodPrice.text = "R$ ${food.price}"
        holder.textRating.text = "${food.rating}"
        holder.foodImage.setImageResource(food.image)
        holder.textTimeToDelivery.text = "${food.timeToDelivery}"
        holder.buttonDetail.setOnClickListener{
            onClick(food.id)
        }
    }
}