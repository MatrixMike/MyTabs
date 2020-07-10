fun gearsOut (): String {
//	val gearsRatio = listOf(0.0)
    val gearsRatio: MutableList<Double> = mutableListOf()
    var formatted =""
    val frontGears = listOf(42.0, 32.0, 22.0)   // deliberately not sorted
    val rearGears  = listOf(26.0, 23.0, 21.0, 19.0, 17.0, 15.0, 13.0, 12.0)  // number of teeth on gear is an integer
    for (f in frontGears){
        for (r in rearGears){
            formatted = formatted + String.format("*%.2f   %.2f   %.2f   \n", f/r, f, r ) ;
            gearsRatio.add(f/r)
        }
        println("next f")
    }
    println(formatted)
    // now the sorted list
    gearsRatio
        .sortedBy{it}
        .forEach {formatted = formatted + String.format("# %.2f  \n",it )}
//	.forEach{ println("%6.2f  ".format(it))}
    return formatted
}