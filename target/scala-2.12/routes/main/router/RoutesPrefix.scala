
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphx/slot-machine-web/conf/routes
// @DATE:Sat Dec 30 02:58:15 IST 2017


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
