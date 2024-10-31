package br.com.fiap.mad.food

object Database {
    fun getAll() = data

    fun getById(id: Int) = data.find { it.id == id }

    private val data = listOf(
        Food(
            title = R.string.bacon_cheese_heaven,
            price = 12.99,
            timeToDelivery = 30,
            rating = 4.8,
            description = R.string.bacon_cheese_heaven_desc,
            image = R.drawable.bacon_and_cheese_heaven,
            id = 1
        ),
        Food(
            title = R.string.bacon_wrapped_filet_mignon,
            price = 24.99,
            timeToDelivery = 40,
            rating = 4.9,
            description = R.string.bacon_wrapped_filet_mignon_desc,
            image = R.drawable.bacon_wrapped_filet_mignon,
            id = 2
        ),
        Food(
            title = R.string.bbq_chicken_delight,
            price = 15.99,
            timeToDelivery = 25,
            rating = 4.7,
            description = R.string.bbq_chicken_delight_desc,
            image = R.drawable.bbq_chicken_delight,
            id = 3
        ),
        Food(
            title = R.string.bbq_ranch_delight,
            price = 13.49,
            timeToDelivery = 20,
            rating = 4.6,
            description = R.string.bbq_ranch_delight_desc,
            image = R.drawable.bbq_ranch_delight,
            id = 4
        ),
        Food(
            title = R.string.beef_broccoli,
            price = 11.99,
            timeToDelivery = 30,
            rating = 4.5,
            description = R.string.beef_broccoli_desc,
            image = R.drawable.beef_stir_fry_with_broccoli,
            id = 5
        ),
        Food(
            title = R.string.berry_smoothie,
            price = 5.99,
            timeToDelivery = 10,
            rating = 4.8,
            description = R.string.berry_smoothie_desc,
            image = R.drawable.berry_blast_smoothie,
            id = 6
        ),
        Food(
            title = R.string.california_roll,
            price = 8.99,
            timeToDelivery = 20,
            rating = 4.5,
            description = R.string.california_roll_desc,
            image = R.drawable.california_roll,
            id = 7
        ),
        Food(
            title = R.string.chicago_hotdog,
            price = 6.99,
            timeToDelivery = 15,
            rating = 4.7,
            description = R.string.chicago_hotdog_desc,
            image = R.drawable.chicago_style_hot_dog,
            id = 8
        ),
        Food(
            title = R.string.chicken_avocado,
            price = 14.99,
            timeToDelivery = 30,
            rating = 4.6,
            description = R.string.chicken_avocado_desc,
            image = R.drawable.chicken_avocado_bliss,
            id = 9
        ),
        Food(
            title = R.string.chili_cheese_hotdog,
            price = 7.49,
            timeToDelivery = 15,
            rating = 4.4,
            description = R.string.chili_cheese_hotdog_desc,
            image = R.drawable.chili_cheese_dog,
            id = 10
        ),
        Food(
            title = R.string.classic_beef_burger,
            price = 10.99,
            timeToDelivery = 25,
            rating = 4.8,
            description = R.string.classic_beef_burger_desc,
            image = R.drawable.classic_beef_burger,
            id = 11
        ),
        Food(
            title = R.string.classic_beef_hotdog,
            price = 6.49,
            timeToDelivery = 15,
            rating = 4.5,
            description = R.string.classic_beef_hotdog_desc,
            image = R.drawable.classic_beef_hot_dog,
            id = 12
        ),
        Food(
            title = R.string.coconut_water,
            price = 3.99,
            timeToDelivery = 10,
            rating = 4.6,
            description = R.string.coconut_water_desc,
            image = R.drawable.coconut_water,
            id = 13
        ),
        Food(
            title = R.string.dragon_roll,
            price = 11.49,
            timeToDelivery = 20,
            rating = 4.7,
            description = R.string.dragon_roll_desc,
            image = R.drawable.dragon_roll,
            id = 14
        ),
        Food(
            title = R.string.espresso_martini,
            price = 8.99,
            timeToDelivery = 15,
            rating = 4.5,
            description = R.string.espresso_martini_desc,
            image = R.drawable.espresso_martini,
            id = 15
        ),
        Food(
            title = R.string.four_cheese_pizza,
            price = 13.99,
            timeToDelivery = 30,
            rating = 4.6,
            description = R.string.four_cheese_pizza_desc,
            image = R.drawable.four_cheese_delight,
            id = 16
        ),
        Food(
            title = R.string.garlic_parmesan_chicken,
            price = 14.99,
            timeToDelivery = 25,
            rating = 4.7,
            description = R.string.garlic_parmesan_chicken_desc,
            image = R.drawable.garlic_parmesan_chicken,
            id = 17
        ),
        Food(
            title = R.string.green_tea_latte,
            price = 4.99,
            timeToDelivery = 10,
            rating = 4.5,
            description = R.string.green_tea_latte_desc,
            image = R.drawable.green_tea_latte,
            id = 18
        ),
        Food(
            title = R.string.grilled_ribeye_steak,
            price = 22.99,
            timeToDelivery = 35,
            rating = 4.9,
            description = R.string.grilled_ribeye_steak_desc,
            image = R.drawable.grilled_ribeye_steak,
            id = 19
        ),
        Food(
            title = R.string.hawaiian_bbq_hotdog,
            price = 7.99,
            timeToDelivery = 15,
            rating = 4.4,
            description = R.string.hawaiian_bbq_hotdog_desc,
            image = R.drawable.hawaiian_bbq_dog,
            id = 20
        ),
        Food(
            title = R.string.hawaiian_paradise,
            price = 9.99,
            timeToDelivery = 20,
            rating = 4.6,
            description = R.string.hawaiian_paradise_desc,
            image = R.drawable.hawaiian_paradise,
            id = 21
        ),
        Food(
            title = R.string.honey_mustard_tenders,
            price = 8.49,
            timeToDelivery = 20,
            rating = 4.5,
            description = R.string.honey_mustard_tenders_desc,
            image = R.drawable.honey_mustard_glazed_tenders,
            id = 22
        ),
        Food(
            title = R.string.iced_caramel_macchiato,
            price = 4.99,
            timeToDelivery = 10,
            rating = 4.5,
            description = R.string.iced_caramel_macchiato_desc,
            image = R.drawable.iced_caramel_macchiato,
            id = 23
        ),
        Food(
            title = R.string.italian_burger,
            price = 11.49,
            timeToDelivery = 30,
            rating = 4.6,
            description = R.string.italian_burger_desc,
            image = R.drawable.spicy_jalapeno_burger,
            id = 24
        ),
        Food(
            title = R.string.orange_juice,
            price = 2.99,
            timeToDelivery = 10,
            rating = 4.7,
            description = R.string.orange_juice_desc,
            image = R.drawable.fresh_orange_juice,
            id = 25
        ),
        Food(
            title = R.string.pink_lemonade,
            price = 3.49,
            timeToDelivery = 10,
            rating = 4.5,
            description = R.string.pink_lemonade_desc,
            image = R.drawable.lemon_pepper_chicken,
            id = 26
        ),
        Food(
            title = R.string.salted_caramel_brownie,
            price = 5.49,
            timeToDelivery = 15,
            rating = 4.6,
            description = R.string.salted_caramel_brownie_desc,
            image = R.drawable.iced_caramel_macchiato,
            id = 27
        ),
        Food(
            title = R.string.spicy_tuna_roll,
            price = 9.49,
            timeToDelivery = 20,
            rating = 4.4,
            description = R.string.spicy_tuna_roll_desc,
            image = R.drawable.spicy_tuna_roll,
            id = 28
        ),
        Food(
            title = R.string.strawberry_cheesecake,
            price = 6.99,
            timeToDelivery = 15,
            rating = 4.8,
            description = R.string.strawberry_cheesecake_desc,
            image = R.drawable.tempura_shrimp_roll,
            id = 29
        ),
    )
}