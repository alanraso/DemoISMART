package br.com.ismart.demoismart.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import br.com.ismart.demoismart.R
import br.com.ismart.demoismart.data.Prize
import com.koushikdutta.ion.Ion
import kotlinx.android.synthetic.main.cell_prize.view.*

/**
 * Created by taqtile on 12/1/17.
 */
class PrizeCell : RelativeLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    private val image: ImageView
    private val nameText: TextView
    private val descriptionText: TextView
    private val priceText: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.cell_prize, this)

        image = cell_prize_image
        nameText = cell_prize_name
        descriptionText = cell_prize_description
        priceText = cell_prize_price
    }

    fun setPrize(prize: Prize) {
        loadImage(prize.imageUrl)
        nameText.text = prize.name
        descriptionText.text = prize.description
        priceText.text = prize.ligabytes.toString()
    }

    private fun loadImage(imageUrl: String) {
        Ion.with(image)
                .placeholder(R.drawable.bkg_gray_light)
                .error(R.drawable.bkg_red)
                .load(imageUrl)
    }
}