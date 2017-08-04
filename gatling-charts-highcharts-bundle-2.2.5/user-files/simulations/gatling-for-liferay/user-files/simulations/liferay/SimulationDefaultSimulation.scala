package liferay

import liferay.processes._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

/**
 * Gatling 2.2.X Script generated for Liferay by the plugin
 * "Load Test with Gatling"
 */
class DefaultSimulation extends Simulation {

  val httpProtocol = http
    .baseURL("http://extranet.qa.gal.local")
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("fr,fr-fr;q=0.8,en-us;q=0.5,en;q=0.3")
    .disableWarmUp

  /**
   * List of the differents scenarios
   */
  
  val DefaultScenario = scenario("DefaultScenario")
    .exec(
      Login.successfulLogin("/login", "data/feeders/User_default_login_.csv"),
      SiteMapRandom.run(),
      //pause(3),
      //SiteMapRandom.run(),
      Logout.logout()
    )

  val HomePageScenario = scenario("HomePageScenario") 
     .exec(
      Login.successfulLogin("/login", "data/feeders/User_default_login_.csv"),
      Accueil.run()
    )
        

  setUp(
    //DefaultScenario.inject(rampUsers(6000) over(60 seconds))
     //DefaultScenario.inject(atOnceUsers(8000))
     HomePageScenario.inject(rampUsers(600) over(60 seconds))
  ).protocols(httpProtocol)

}
