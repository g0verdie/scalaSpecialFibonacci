object specialMath {
    def main(args: Array[String]) = {
        var inputNum = args(0).toInt
        var storage:Array[BigInt] = new Array[BigInt](inputNum+1)
        storage(0)=0
        storage(1)=1
        for( x <- 2 to inputNum){
            storage(x) = x + storage(x-1) + storage(x-2)  
        }
        println(storage(inputNum))
    }
}