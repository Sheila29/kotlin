import java.io.BufferedReader
import java.io.InputStreamReader
import javax.swing.JOptionPane

/**
 * Created by 7FPROG10 on 22/05/2017.
 */


fun main(args: Array<String>) {


    val br = BufferedReader(InputStreamReader(System.`in`))

    print("Escribe un número comprendido entre 1 y 7: ")
    val numero = br.readLine().toInt()

    when (numero){

        1 -> println("LUNES")
        2 -> println("MARTES")
        3 -> println("MIÉRCOLES")
        4 -> println("JUEVES")
        5 -> println("VIERNES")
        6 -> println("SÁBADO")
        7 -> println("DOMINGO")

    }



}
