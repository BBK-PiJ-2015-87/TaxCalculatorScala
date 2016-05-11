package app

import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.filters.CommonFilters
import com.twitter.finatra.http.routing.HttpRouter
import controllers.{FileController, TagsTestController, WeightResource, HelloController}

class Server extends HttpServer {

  override protected def defaultFinatraHttpPort: String = ":8080" //change port from default 8888
//  override protected def defaultTracingEnabled: Boolean = false
//  override protected def defaultHttpServerName: String = "Taxer"

  override protected def configureHttp(router: HttpRouter): Unit = {
    router
//      .filter[CommonFilters] //filter @Size @Range etc. Alsoif bad request it will return 400 instead 500
      .add(new HelloController)
//      .add[WeightResource]
      .add[TagsTestController]
      .add[FileController]
  }

}
