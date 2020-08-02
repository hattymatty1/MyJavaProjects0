//Volumes by overloading methods.
import java.util.*

internal class shape {
    fun vol(r: Int) {
        val vol = (4 / 3).toFloat() * 3.14f * r.toFloat() * r.toFloat() * r.toFloat()
        println("Volume of sphere: $vol")
    }

    fun vol(r: Int, h: Int) {
        val vol = 3.14f * r.toFloat() * r.toFloat() * (h / 3).toFloat()
        println("Volume of cone: $vol")
    }

    fun vol(r: Int, l: Float) {
        val vol = 3.14f * r.toFloat() * r.toFloat() * l
        println("Volume of cylinder: $vol")
    }
}

object qwerty {
    @JvmStatic
    fun main(args: Array<String>) {
        val obj = shape()
        println("Enter your choice to find volume: ")
        println("1-> Sphere, 2->Cone, 3->Cylinder:")
        val sc = Scanner(System.`in`)
        val s = sc.nextInt()
        when (s) {
            1 -> {
                println("Enter radius:")
                val r = sc.nextInt()
                obj.vol(r)
            }
            2 -> {
                println("Enter radius and height")
                val a = sc.nextInt()
                val h = sc.nextInt()
                obj.vol(a, h)
            }
            3 -> {
                println("Enter radius and height:")
                val b = sc.nextInt()
                val l = sc.nextInt()
                obj.vol(b, l)
            }
        }
    }
}