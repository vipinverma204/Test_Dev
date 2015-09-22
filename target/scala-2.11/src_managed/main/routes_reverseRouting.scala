// @SOURCE:/home/scriptuit/Play/PlayProjects/modern-web-template/conf/routes
// @HASH:e204af193c07eab974a36f46de5de46d84136637
// @DATE:Tue Sep 22 12:00:46 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
package controllers {

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseUsers {


// @LINE:14
def updateUser(firstName:String, lastName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("firstName", dynamicString(firstName)) + "/" + implicitly[PathBindable[String]].unbind("lastName", dynamicString(lastName)))
}
                        

// @LINE:12
def findUsers(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                        

// @LINE:13
def createUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "user")
}
                        

}
                          

// @LINE:17
class ReverseAssets {


// @LINE:17
def versioned(file:Asset): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
}
                        

}
                          

// @LINE:9
// @LINE:8
class ReverseApplication {


// @LINE:9
def randomUUID(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "randomUUID")
}
                        

// @LINE:8
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseUsers {


// @LINE:14
def updateUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.updateUser",
   """
      function(firstName,lastName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("firstName", encodeURIComponent(firstName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lastName", encodeURIComponent(lastName))})
      }
   """
)
                        

// @LINE:12
def findUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.findUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:13
def createUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.createUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
      }
   """
)
                        

}
              

// @LINE:17
class ReverseAssets {


// @LINE:17
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:9
// @LINE:8
class ReverseApplication {


// @LINE:9
def randomUUID : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.randomUUID",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "randomUUID"})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
package controllers.ref {


// @LINE:14
// @LINE:13
// @LINE:12
class ReverseUsers {


// @LINE:14
def updateUser(firstName:String, lastName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).updateUser(firstName, lastName), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "updateUser", Seq(classOf[String], classOf[String]), "PUT", """""", _prefix + """user/$firstName<[^/]+>/$lastName<[^/]+>""")
)
                      

// @LINE:12
def findUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).findUsers(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "findUsers", Seq(), "GET", """ User management API""", _prefix + """users""")
)
                      

// @LINE:13
def createUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).createUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Users", "createUser", Seq(), "POST", """""", _prefix + """user""")
)
                      

}
                          

// @LINE:17
class ReverseAssets {


// @LINE:17
def versioned(path:String, file:Asset): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:9
// @LINE:8
class ReverseApplication {


// @LINE:9
def randomUUID(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).randomUUID(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "randomUUID", Seq(), "GET", """""", _prefix + """randomUUID""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Single endpoint for serving AngularJS""", _prefix + """""")
)
                      

}
                          
}
        
    