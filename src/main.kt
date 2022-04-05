 fun main(){
     var car=Car("KBW125","Toyota","blue",60)
       car.carry(58)
     car.carry(72)
     car.identity("white","subaru","legacy")
     var d=car.calculateParkingFees(2)
     println(d)
    var bus=Bus("Manyanga","x","pink",50)
     println(bus.maxTripFare(200.00) )

        var s= bus.calculateParkingFees(7)
     println(s)


 }
 open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people: Int){
        var x=people-capacity
        if(people<=capacity){
            println("carrying $people passengers")
        }else{
            println("over capacity by $x people")
        }
    }
     fun identity(color:String,make:String,model:String){
         println("I am a $color $make $model")

     }
     open fun calculateParkingFees(hours: Int ):Int{
         var parkingFees=hours*20
         return parkingFees

     }
 }
 class Bus( make:String, model:String, color:String, capacity:Int):Car(make,model,color,capacity) {
   fun maxTripFare(fare:Double):Double {
       var maxFare= fare*capacity
       return(maxFare)
   }

     override fun calculateParkingFees(hours: Int): Int {
         //return super.calculateParkingFees(hours)
         var d = hours * capacity
         return(d)
     }
 }




