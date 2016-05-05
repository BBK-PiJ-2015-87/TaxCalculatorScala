package controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import models.Weight

import scala.collection.mutable

class WeightResource extends Controller {

  val db = mutable.Map[String, List[Weight]]()

  post("/weights") { weight: Weight =>
    //measure time time(){}
    val requestTime = time(s"Total time take to post weight for user '${weight.user}' is %d ms"){
      val weightsForUser = db.get(weight.user) match {
        case Some(weights) => weights :+ weight //if user exist ad weight to existing collection
        case None => List(weight) //else create new list with weight
      }
      db.put(weight.user, weightsForUser)
      response.created.location(s"/weights/${weight.user}")
    }
    requestTime
  }

  get("/weights") { request: Request =>
    info("finding all weights for all users...")
    db
  }

  get("/weights/:user") { request: Request =>
    info( s"""finding weight for user ${request.params("user")}""")
    db.getOrElse(request.params("user"), List())
  }

}
