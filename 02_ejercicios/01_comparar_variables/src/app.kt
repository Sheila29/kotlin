import java.util.*

/**
 * Created by 7FPROG10 on 22/05/2017.
 */



/*Escribe un programa que cree al azar tres variables enteras y las compare entre sí,
sacando en pantalla cual de ellas es la mayor, la siguiente más grande y la menor.
Hay que tener en cuenta si son iguales, nunca se sabe.*/

fun main(args: Array<String>) {

    val r = Random()


    val a: Int = r.nextInt(10)
    val b: Int = r.nextInt(10)
    val c: Int = r.nextInt(10)

    val max = if (a > b && a > c)  b else c

    if (a > b && a > c) {
        print("La mayor es: " + a)

    }else{



    }

    if (b > a && b > c){
        print("La mayor es: "+b)

    }

    if (c > a && c > b){
        print("La mayor es: "+c)
    }












}