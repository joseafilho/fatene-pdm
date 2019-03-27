/*

Fatene EaD 01 - Kotlin POO
Prof.: Luis Sergio
Aluno: José de Araújo Filho

IDE: VSCode
Compiler: kotlin-native-linux-1.1.2
Command line: kotlinc ead1-pilha.kt -o ead1-pilha
Output: ead1-pilha.kexe

*/

class Stack {   
    
    val stackItems: MutableList<String>

    init {        
        stackItems = mutableListOf<String>()
    }    

    fun push(action: String) {
        stackItems.add(action)        
    }

    fun pop() {
        if (stackItems.isNotEmpty()) {
            stackItems.removeAt(stackItems.lastIndex)
        }
    }

    fun top(): String {
        if (stackItems.isNotEmpty()) {
            return stackItems.last()
        } else {
            return ""
        }
    }
}

fun main(args: Array<String>) {
    println("Fatene EaD 01 - Kotlin POO")
    println("Prof.: Luis Sergio")
    println("Aluno: José de Araújo Filho")

    println("")

    // pilha de historico de navegacao 
    val navigation = Stack()

    // navegando
    navigation.push("/")    
    println(navigation.top())

    navigation.push("/home")    
    println(navigation.top())

    navigation.push("/home/araujo")    
    println(navigation.top())

    navigation.push("/home/araujo/documentos")    
    println(navigation.top())

    navigation.push("/home/araujo/documentos/fateme")    
    println(navigation.top())

    // voltando na navegacao
    navigation.pop()    
    println(navigation.top())

    navigation.pop()    
    println(navigation.top())

    navigation.pop()    
    println(navigation.top())

    navigation.pop()    
    println(navigation.top())

    navigation.pop()    
    println(navigation.top())
}