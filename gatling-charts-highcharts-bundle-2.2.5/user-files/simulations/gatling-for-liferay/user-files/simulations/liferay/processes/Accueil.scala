package liferay.processes

import io.gatling.core.Predef._
import io.gatling.core.session
import io.gatling.http.Predef._

/**
 * A recorded navigation.
 */
object Accueil {

  def run() =
    exec(http("Accueil")
        .get("/accueil")
    )
    .pause(0)
      exec(http("Accueil")
        .get("/accueil")
    )
    .pause(8)
      exec(http("Accueil")
        .get("/accueil")
      )
    .pause(0)
}
