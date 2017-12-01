package br.com.ismart.demoismart

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import br.com.ismart.demoismart.components.PrizeCell
import br.com.ismart.demoismart.data.Prize
import br.com.ismart.demoismart.data.PrizeCreator
import kotlinx.android.synthetic.main.activity_products_list.*

class PrizesActivity : AppCompatActivity() {

    private val prizesList: List<Prize> = PrizeCreator().createPrizes()
    private lateinit var container: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_list)

        container = activity_products_list_container
        createCells()
    }

    private fun createCells() {
        prizesList.forEach {
            val prizeCell = PrizeCell(this)
            prizeCell.setPrize(it)
            container.addView(prizeCell)
        }
    }

}
