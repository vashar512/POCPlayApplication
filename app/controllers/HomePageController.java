package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Singleton;

@Singleton
public class HomePageController extends Controller {
    public Result renderPage() {
        return ok(views.html.index.render());
    }
}
