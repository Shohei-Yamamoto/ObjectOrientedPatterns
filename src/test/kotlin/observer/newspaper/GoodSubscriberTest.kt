package observer.newspaper

import org.junit.Assert.assertEquals
import org.junit.Test

internal class GoodSubscriberTest {
    @Test
    fun test_新聞購読ができる() {
        val javaCompany: NewspaperPublisher = JavaNewspaperCompany()
        val javaSubscriber = GoodSubscriber(javaCompany)

        assertEquals(0, javaSubscriber.countOfNewspaperInHouse())
        javaCompany.publish(Newspaper(1, "first"))
        assertEquals(1, javaSubscriber.countOfNewspaperInHouse())
    }
}
