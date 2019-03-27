/*

Fatene EaD 01 - Kotlin POO
Prof.: Luis Sergio
Aluno: José de Araújo Filho

IDE: VSCode
Compiler: kotlin-native-linux-1.1.2
Command line: kotlinc ead1-poo.kt -o ead1-poo

*/

interface Animal {
    fun fazerBarulho()
}

class Gato : Animal {
    override fun fazerBarulho() {
        println("Gato: Miaaauuuu Miaaauuuu")
    }
}

class Cachorro : Animal {
    override fun fazerBarulho() {
        println("Cahorro: Au Au Au")
    }
}

class Vaca : Animal {
    override fun fazerBarulho() {
        println("Vaca: Mooonnnnn Moooonnn")
    }
}

fun main(args: Array<String>) {
    println("Fatene EaD 01 - Kotlin POO")
    println("Prof.: Luis Sergio")
    println("Aluno: José de Araújo Filho")

    println("")
    // Declarando uma variavel do tipo Animal.
    var animal: Animal

    // Instanciando animais na variavel animal;
    animal = Gato()
    animal.fazerBarulho()

    animal = Cachorro()
    animal.fazerBarulho()

    animal = Vaca()
    animal.fazerBarulho()
}