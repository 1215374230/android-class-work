package com.example.middleexam

data class Commodity(
    val id: Int,
    val name:String,
    val price:Double,
    val quantity:Int,
    val description:String
)
data class Equipment(
    val id: Int,
    val name:String,
    val type: String,
    val status:String,
    val manufacturer:String
)

object UserData{
    val commodityList = listOf(
        Commodity(1,"物品1",100.1,5,"这是一个物品1"),
        Commodity(2,"物品2",200.2,10,"这是一个物品2"),
        Commodity(3,"物品3",300.3,15,"这是一个商品3"),
    )
    val equipmentList = listOf(
        Equipment(1,"卓1","笑A","林","q1"),
        Equipment(2,"卓2","笑B","林","q2"),
        Equipment(3,"卓3","笑C","林","q3"),
    )
}
