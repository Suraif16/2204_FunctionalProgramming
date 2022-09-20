
object Q1 extends App{
val p1=Point(1,2)
val p2=Point(4,5)
println(p1+p2)
println(p1.move(1,2))

println("Point 1 = "+p1)
println("Point 2 = "+p2)
println("Distance = "+p1.distance(p2))
println("Inverted point 1 = "+p1.invert())

}
case class Point(a:Int,b:Int){
    def x:Int = a
    def y:Int = b
    def +(p:Point)=Point(p.x+this.x,p.y+this.y)
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
    def distance(p2:Point):Double= math.sqrt(math.pow(this.x-p2.x,2)+math.pow(this.y-p2.y,2))
    def invert()=Point(this.y,this.x)
}