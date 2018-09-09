package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import views.html.params;

public class RequestParamExamplePageController extends Controller {
    public Result renderPage(int age) {
        return ok(params.render("Hi Vishal. You need to wait " + age + " seconds before it finishes"));
    }
}
