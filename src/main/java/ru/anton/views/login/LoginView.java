package ru.anton.views.login;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import ru.anton.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;

@CssImport("./views/login/login-view.css")
@Route(value = "login", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Login")
public class LoginView extends Div {

    public LoginView() {
        addClassName("login-view");
        add(new Text("Content placeholder"));
    }

}
