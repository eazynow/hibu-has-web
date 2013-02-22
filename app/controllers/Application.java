package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        renderTemplate("index.html");
    }

    public static void merchants() {
        renderTemplate("merchants.html");
    }
}