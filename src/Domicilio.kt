data class Domicilio(val calle: String, val numero: Int) {
    fun dirCompleta(): String = "$calle $numero"
}