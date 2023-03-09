import javax.swing.SortOrder

fun main() {

    names()
    var jays = ret("Jane","Alice")
    println(jays)



}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
fun ret(name1: String,name2:String): String{
    var  next = arrayOf(name1,name2)
    return next.contentToString()

}

fun equals(string1:String,string2:String):String{
    var string1 = "Anna adhiambo"
    return string1

}
fun length(){
    val string3 = "Anna adhiambo"
    val string4 = "anna Adhiambo"
    println(string3.length < (string4.length))
}


//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun names(){
    var cities = arrayOf(11,158,62)
    println(cities[1] + cities[5])
    println(cities.indexOf(158))
    println(cities.sortedArray().contentToString())

//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun comsi(){
    val places = "James Judah Emmy June"
    println(places.split(""))
    println(places.split(" "))
    println(places.split(", "))
}


    //Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.



