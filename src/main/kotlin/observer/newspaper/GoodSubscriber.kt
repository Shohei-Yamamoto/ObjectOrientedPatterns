package observer.newspaper

internal class GoodSubscriber(val publisher: NewspaperPublisher): NewspaperSubscriber {
    private val newspapersInHouse = mutableListOf<Newspaper>()

    init {
        publisher.addSubscriber(this)
    }

    override fun receive(newspaper: Newspaper) {
        read(newspaper)
        keep(newspaper)
    }

    private fun read(newspaper: Newspaper) {
        println("I've read ${newspaper.id} !!")
    }

    private fun keep(newspaper: Newspaper) {
        newspapersInHouse.add(newspaper)
    }

    fun countOfNewspaperInHouse(): Int {
        return newspapersInHouse.count()
    }
}