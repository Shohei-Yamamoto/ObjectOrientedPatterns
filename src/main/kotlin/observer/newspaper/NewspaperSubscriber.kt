package observer.newspaper

/**
 * 新聞の購読者
 */
internal interface NewspaperSubscriber {
    fun receive(newspaper: Newspaper)
}