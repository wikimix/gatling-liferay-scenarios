package liferay.processes

import io.gatling.core.Predef._
import io.gatling.core.session
import io.gatling.http.Predef._

/**
 * A random navigation.
 */
object SiteMapRandom {

  def run() =
    randomSwitch(
      5.00 -> exec(http("Random page: accueil").get("/accueil")),
      5.00 -> exec(http("Random page: ASSURANCES DE MON AGENCE").get("/mon-agence/assurances-de-mon-agence")),
      5.00 -> exec(http("Random page: TOUS NOS PRODUITS").get("/produits-et-services/tous-nos-produits")),
      5.00 -> exec(http("Random page: accueil").get("/accueil")),
      5.00 -> exec(http("Random page: ASSURANCES DE MON AGENCE").get("/mon-agence/assurances-de-mon-agence")),
      5.00 -> exec(http("Random page: TOUS NOS PRODUITS").get("/produits-et-services/tous-nos-produits")),
      5.00 -> exec(http("Random page: accueil").get("/accueil")),
      5.00 -> exec(http("Random page: ASSURANCES DE MON AGENCE").get("/mon-agence/assurances-de-mon-agence")),
      5.00 -> exec(http("Random page: TOUS NOS PRODUITS").get("/produits-et-services/tous-nos-produits")),
      5.00 -> exec(http("Random page: TOUS NOS PRODUITS").get("/produits-et-services/tous-nos-produits")),
      5.00 -> exec(http("Random page: accueil").get("/accueil")),
      5.00 -> exec(http("Random page: ASSURANCES DE MON AGENCE").get("/mon-agence/assurances-de-mon-agence")),
      5.00 -> exec(http("Random page: TOUS NOS PRODUITS").get("/produits-et-services/tous-nos-produits")),
      5.00 -> exec(http("Random page: accueil").get("/accueil")),
      5.00 -> exec(http("Random page: ASSURANCES DE MON AGENCE").get("/mon-agence/assurances-de-mon-agence")),
      5.00 -> exec(http("Random page: TOUS NOS PRODUITS").get("/produits-et-services/tous-nos-produits")),
      5.00 -> exec(http("Random page: accueil").get("/accueil")),
      5.00 -> exec(http("Random page: ASSURANCES DE MON AGENCE").get("/mon-agence/assurances-de-mon-agence")),
      5.00 -> exec(http("Random page: TOUS NOS PRODUITS").get("/produits-et-services/tous-nos-produits")),
      5.00 -> exec(http("Random page: TOUS NOS PRODUITS").get("/produits-et-services/tous-nos-produits"))
    )

}