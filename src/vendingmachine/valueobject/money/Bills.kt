package vendingmachine.valueobject.money

class Bills(
    val billList: MutableMap<String, Int> = mutableMapOf(
        "10000" to 0,
        "5000" to 0,
        "1000" to 0
    )
) {
    var list = billList
}