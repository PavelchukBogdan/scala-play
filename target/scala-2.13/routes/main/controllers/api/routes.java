// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/play-scala-rest-api-example-master/conf/routes
// @DATE:Tue Sep 22 13:40:10 MSK 2020

package controllers.api;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.api.ReverseTodoController TodoController = new controllers.api.ReverseTodoController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.api.javascript.ReverseTodoController TodoController = new controllers.api.javascript.ReverseTodoController(RoutesPrefix.byNamePrefix());
  }

}
