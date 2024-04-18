import java.util.*

// Definindo a classe Animal
class Animal(
    val apelido: String,
    val origem: String,
    val dieta: String,
    val tipoGaiola: String,
    val localizacao: String,
    val reino: String,
    val filo: String,
    val classe: String,
    val ordem: String,
    val familia: String,
    val genero: String,
    val especie: String
) {
    // Método para exibir informações do animal
    fun exibirInformacoes() {
        println("Apelido: $apelido")
        println("Origem: $origem")
        println("Dieta: $dieta")
        println("Tipo de Gaiola: $tipoGaiola")
        println("Localização: $localizacao")
        println("Reino: $reino")
        println("Filo: $filo")
        println("Classe: $classe")
        println("Ordem: $ordem")
        println("Família: $familia")
        println("Gênero: $genero")
        println("Espécie: $especie")
    }
}

// Classe para o controle do zoológico
class Zoologico {
    // Lista para armazenar os animais cadastrados
    private val animais = mutableListOf<Animal>()

    // Método para cadastrar um novo animal
    fun cadastrarAnimal(
        apelido: String,
        origem: String,
        dieta: String,
        tipoGaiola: String,
        localizacao: String,
        reino: String,
        filo: String,
        classe: String,
        ordem: String,
        familia: String,
        genero: String,
        especie: String
    ) {
        val animal = Animal(
            apelido, origem, dieta, tipoGaiola, localizacao,
            reino, filo, classe, ordem, familia, genero, especie
        )
        animais.add(animal)
    }

    // Método para listar todos os animais cadastrados
    fun listarAnimais() {
        if (animais.isEmpty()) {
            println("Não há animais cadastrados.")
        } else {
            println("Lista de Animais:")
            animais.forEachIndexed { index, animal ->
                println("${index + 1}. ${animal.apelido}")
            }
        }
    }

    // Método para exibir informações de um animal específico pelo seu índice na lista
    fun exibirInformacoesAnimal(indice: Int) {
        if (indice in 0 until animais.size) {
            animais[indice].exibirInformacoes()
        } else {
            println("Índice inválido.")
        }
    }
}

fun main() {
    val zoo = Zoologico()

// Cadastrando o leão corretamente
zoo.cadastrarAnimal(
    "Leão", "África", "Carnívoro", "Savana", "Savana 1",
    "Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", "Panthera", "leo"
)

    zoo.cadastrarAnimal(
        "Tigre", "Ásia", "Carnívoro", "Savana", "Savana 2",
        "Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", "Panthera", "tigris"
    )
    zoo.cadastrarAnimal(
        "Tubarão", "Oceano", "Carnívoro", "Aquário", "Aquário 1",
        "Animalia", "Chordata", "Chondrichthyes", "Lamniformes", "Lamnidae", "Carcharodon", "carcharias"
    )
       // Cadastrando mais animais
    zoo.cadastrarAnimal(
        "Girafa", "África", "Herbívoro", "Savana", "Savana 3",
        "Animalia", "Chordata", "Mammalia", "Artiodactyla", "Giraffidae", "Giraffa", "camelopardalis"
    )
    zoo.cadastrarAnimal(
        "Pinguim", "Antártica", "Piscívoro", "Aquário", "Aquário 2",
        "Animalia", "Chordata", "Aves", "Sphenisciformes", "Spheniscidae", "Aptenodytes", "forsteri"
    )

    // Listando os animais cadastrados
    zoo.listarAnimais()

    // Exibindo informações de um animal específico
    println("\nExibindo informações do animal 1:")
    zoo.exibirInformacoesAnimal(1)
}

