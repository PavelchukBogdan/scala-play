// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/play-scala-rest-api-example-master/conf/routes
// @DATE:Tue Sep 22 13:40:10 MSK 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
