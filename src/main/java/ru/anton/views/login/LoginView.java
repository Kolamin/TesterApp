package ru.anton.views.login;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import ru.anton.data.service.AuthService;

@CssImport("./views/login/login-view.css")
@Route(value = "login")
@PageTitle("Login")
public class LoginView extends Div {

    public LoginView(AuthService authService) {
        addClassName("login-view");
        var username = new TextField("Username");
        var passowrd = new PasswordField("Passowrd");
        add(
                new H1("Welcome"),
                username,
                passowrd,
                new Button("Login", event ->{
                    try {
                        authService.authenticate(username.getValue(), passowrd.getValue());
                        UI.getCurrent().navigate("questions");
                    } catch (AuthService.AuthException e) {
                        Notification.show("Wrong credentials.");
                    }
                })
        );
    }

}
