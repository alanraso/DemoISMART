package br.com.ismart.demoismart.data

/**
 * Created by taqtile on 12/1/17.
 */
class PrizeCreator {

    fun createPrizes(): List<Prize> {
        val prizes: MutableList<Prize> = ArrayList()

        prizes.add(createFirstPrize())
        prizes.add(createSecondPrize())
        prizes.add(createThirdPrize())
        prizes.add(createFourthPrize())
        prizes.add(createFifthPrize())

        return prizes
    }

    private fun createFirstPrize(): Prize {
        return Prize(
                "http://ligadofuturo.ismart.org.br/wpliga/wp-content/uploads/2016/05/premio3.png",
                "Camisa polo temática",
                "Camisa polo com a logomarca da Liga do Futuro bordada.",
                36000
        )
    }

    private fun createSecondPrize(): Prize {
        return Prize(
                "http://ligadofuturo.ismart.org.br/wpliga/wp-content/uploads/2016/05/Premio_Netflix.jpg",
                "VALE-NETFLIX (R\$ 30)",
                "Cartão pré-pago, no valor de R\$ 30,00, para acesso à Netflix.",
                30000
        )
    }

    private fun createThirdPrize(): Prize {
        return Prize(
                "http://ligadofuturo.ismart.org.br/wpliga/wp-content/uploads/2016/05/Premio_Starbucks.jpg",
                "VALE-STARBUCKS (R\$ 30)",
                "Vale-Starbucks no valor de R\$ 30,00.",
                44000
        )
    }

    private fun createFourthPrize(): Prize {
        return Prize(
                "http://ligadofuturo.ismart.org.br/wpliga/wp-content/uploads/2016/05/Vale_tablet.jpg",
                "TABLET",
                "Tablet Samsung modelo Galaxy Tab E, com conexão 3G e tela de 7 polegadas (ou modelo equivalente).",
                22000
        )
    }

    private fun createFifthPrize(): Prize {
        return Prize(
                "http://ligadofuturo.ismart.org.br/wpliga/wp-content/uploads/2016/05/Vale_Outback.jpg",
                "VALE-OUTBACK (R\$ 100)",
                "Vale-Outback no valor de R\$ 100,00.",
                80000
        )
    }
}