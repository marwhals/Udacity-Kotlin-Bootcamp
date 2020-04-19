//fun canAddFish(): Boolean {
//    return true
//}
//
//fun fitMoreFish(tankSize: Int, currentFish: Array<Int>, fishSize : Int = 2, hasDecorations: Boolean = true) {
//
//}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}