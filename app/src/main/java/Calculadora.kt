import androidx.compose.runtime.internal.illegalDecoyCallException

class Calculadora {

    fun sum(a: Double, b: Double): Double= a+b

    fun subtract(a: Double, b: Double): Double = a - b

    fun multiply(a: Double, b: Double): Double = a * b

    fun divide (a:Double, b:Double): Double {
        if (b== 0.0) throw illegalDecoyCallException("Divisao por zero nao pode")
        return a/b
    }
}