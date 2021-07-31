package observer.newspaper

/**
 * 新聞社
 */
internal interface NewspaperPublisher {
    fun addSubscriber(subscriber: NewspaperSubscriber)
    fun removeSubscriber(subscriber: NewspaperSubscriber)
    fun publish(newspaper: Newspaper)
}