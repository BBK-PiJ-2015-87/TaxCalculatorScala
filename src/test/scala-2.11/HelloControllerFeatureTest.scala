import app.Server
import com.twitter.finagle.http.Status
import com.twitter.finatra.http.test.EmbeddedHttpServer
import com.twitter.inject.server.FeatureTest

class HelloControllerFeatureTest extends FeatureTest {
  override val server: EmbeddedHttpServer = new EmbeddedHttpServer(
    twitterServer = new Server)

  "Say Hello" in {
    server.httpGet(
      path = "/hello",
      andExpect = Status.Ok,
      withBody = "Vlad says hello"
    )
  }
}