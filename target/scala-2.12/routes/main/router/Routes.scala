// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/user/Documents/play-java/conf/routes
// @DATE:Mon May 28 10:58:42 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_5: controllers.Assets,
  // @LINE:19
  GameController_4: controllers.GameController,
  // @LINE:27
  AuthController_1: controllers.AuthController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_5: controllers.Assets,
    // @LINE:19
    GameController_4: controllers.GameController,
    // @LINE:27
    AuthController_1: controllers.AuthController
  ) = this(errorHandler, HomeController_2, CountController_0, AsyncController_3, Assets_5, GameController_4, AuthController_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_0, AsyncController_3, Assets_5, GameController_4, AuthController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cake""", """controllers.HomeController.cake"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app""", """controllers.HomeController.app"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gamejson""", """controllers.GameController.gamejson"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addgame""", """controllers.GameController.newGame"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getgame""", """controllers.GameController.getGame"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.GameController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.AuthController.Authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/name""", """controllers.AuthController.GetName"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updategame""", """controllers.GameController.updateGame"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_cake4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cake")))
  )
  private[this] lazy val controllers_HomeController_cake4_invoker = createInvoker(
    HomeController_2.cake,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cake",
      Nil,
      "GET",
      this.prefix + """cake""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_app5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app")))
  )
  private[this] lazy val controllers_HomeController_app5_invoker = createInvoker(
    HomeController_2.app,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "app",
      Nil,
      "GET",
      this.prefix + """app""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_GameController_gamejson6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gamejson")))
  )
  private[this] lazy val controllers_GameController_gamejson6_invoker = createInvoker(
    GameController_4.gamejson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "gamejson",
      Nil,
      "GET",
      this.prefix + """gamejson""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_GameController_newGame7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addgame")))
  )
  private[this] lazy val controllers_GameController_newGame7_invoker = createInvoker(
    GameController_4.newGame,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "newGame",
      Nil,
      "POST",
      this.prefix + """addgame""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_GameController_getGame8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getgame")))
  )
  private[this] lazy val controllers_GameController_getGame8_invoker = createInvoker(
    GameController_4.getGame,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "getGame",
      Nil,
      "GET",
      this.prefix + """getgame""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_GameController_addUser9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_GameController_addUser9_invoker = createInvoker(
    GameController_4.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "addUser",
      Nil,
      "GET",
      this.prefix + """adduser""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_AuthController_Authenticate10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_AuthController_Authenticate10_invoker = createInvoker(
    AuthController_1.Authenticate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "Authenticate",
      Nil,
      "GET",
      this.prefix + """auth""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_AuthController_GetName11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/name")))
  )
  private[this] lazy val controllers_AuthController_GetName11_invoker = createInvoker(
    AuthController_1.GetName,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "GetName",
      Nil,
      "GET",
      this.prefix + """auth/name""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_GameController_updateGame12_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updategame")))
  )
  private[this] lazy val controllers_GameController_updateGame12_invoker = createInvoker(
    GameController_4.updateGame,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "updateGame",
      Nil,
      "PUT",
      this.prefix + """updategame""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_HomeController_cake4_route(params@_) =>
      call { 
        controllers_HomeController_cake4_invoker.call(HomeController_2.cake)
      }
  
    // @LINE:17
    case controllers_HomeController_app5_route(params@_) =>
      call { 
        controllers_HomeController_app5_invoker.call(HomeController_2.app)
      }
  
    // @LINE:19
    case controllers_GameController_gamejson6_route(params@_) =>
      call { 
        controllers_GameController_gamejson6_invoker.call(GameController_4.gamejson)
      }
  
    // @LINE:21
    case controllers_GameController_newGame7_route(params@_) =>
      call { 
        controllers_GameController_newGame7_invoker.call(GameController_4.newGame)
      }
  
    // @LINE:23
    case controllers_GameController_getGame8_route(params@_) =>
      call { 
        controllers_GameController_getGame8_invoker.call(GameController_4.getGame)
      }
  
    // @LINE:25
    case controllers_GameController_addUser9_route(params@_) =>
      call { 
        controllers_GameController_addUser9_invoker.call(GameController_4.addUser)
      }
  
    // @LINE:27
    case controllers_AuthController_Authenticate10_route(params@_) =>
      call { 
        controllers_AuthController_Authenticate10_invoker.call(AuthController_1.Authenticate)
      }
  
    // @LINE:29
    case controllers_AuthController_GetName11_route(params@_) =>
      call { 
        controllers_AuthController_GetName11_invoker.call(AuthController_1.GetName)
      }
  
    // @LINE:31
    case controllers_GameController_updateGame12_route(params@_) =>
      call { 
        controllers_GameController_updateGame12_invoker.call(GameController_4.updateGame)
      }
  }
}
