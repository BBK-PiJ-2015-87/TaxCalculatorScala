package controllers

import com.twitter.finatra.http.Controller
import models.Weight

import scala.collection.mutable

class WeightResource extends Controller {

  val db = mutable.Map[String, List[Weight]]()

  post("/weights") { weight: Weight =>
    val weightsForUser = db.get(weight.user) match {
      case Some(weights) => weights :+ weight //if user exist ad weight to existing collection
      case None => List(weight) //else create new list with weight
    }
    db.put(weight.user, weightsForUser)
    response.created.location(s"/weights/${weight.user}")
  }

}
