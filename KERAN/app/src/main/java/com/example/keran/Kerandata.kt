package com.example.keran

object Kerandata : Collection<Keran> {
    private val keranNames = arrayOf("Angle Valve","Ball Valve","Butterfly Valve",
        "Diaphragm Valve","Gate Valve","Globe Valve","Needle Valve","Pinch Valve","Plug Valve",
        "Slide Valve")

    private val keranDetails = arrayOf(
        "It is similar to globe valve. In angle valve the inlet " +
                "and outlet ends are at 900 to each other.The axis of the stem is in line with one " +
                "of the ends. Angle valve gives lower pressure drop and less pipe fittings in the " +
                "piping system. Angle valves can be used for corrosive fluids. It can have a single " +
                "body or split body.")
    private val keranImages = intArrayOf(R.drawable.angle_valve,R.drawable.ball_valve,R.drawable.butterfly_valve,
    R.drawable.diaphragm_valve,R.drawable.gate_valve,R.drawable.globe_valve,R.drawable.needle_valve,
    R.drawable.pinch_valve,R.drawable.plug_valve,R.drawable.slide_valve)


    val listData: ArrayList<Keran>
    get() {
         val list = arrayListOf<Keran>()
        for (position in keranNames.indices){
            val keran = Keran()
            keran.name = keranNames[position]
            keran.detail = keranDetails[position]
            keran.photo = keranImages[position]
            list.add(keran)
        }
        return list
         }
    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: Keran): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<Keran>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<Keran> {
        TODO("Not yet implemented")
    }
}