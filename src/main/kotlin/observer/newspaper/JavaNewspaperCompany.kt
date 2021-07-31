package observer.newspaper

/**
 * Java新聞社のクラス
 */
internal class JavaNewspaperCompany: NewspaperPublisher {
    private var subscribers = mutableListOf<NewspaperSubscriber>()

    override fun addSubscriber(subscriber: NewspaperSubscriber) {
        subscribers.add(subscriber)
    }

    override fun removeSubscriber(subscriber: NewspaperSubscriber) {
        subscribers.remove(subscriber)
    }

    override fun publish(newspaper: Newspaper) {
        subscribers.forEach { it.receive(newspaper) }
    }
}