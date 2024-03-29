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
import com.vaadin.flow.router.RouterLink;
import ru.anton.data.repository.AnswerDetailsRepository;
import ru.anton.data.service.AuthService;

@CssImport("./views/login/login-view.css")
@Route(value = "login")
@PageTitle("Login")
public class LoginView extends Div {

    public LoginView(AuthService authService, AnswerDetailsRepository answerDetailsRepository) {

        addClassName("login-view");
        var username = new TextField("Username");
        var passoword = new PasswordField("Passowrd");
        add(
                new H1("Welcome"),
                username,
                passoword,
                new Button("Login", event -> {
                    try {
                        authService.authenticate(username.getValue(), passoword.getValue());

                        UI.getCurrent()
                                .navigate("questions");
                    } catch (AuthService.AuthException e) {
                        Notification.show("Wrong credentials.");
                    }
                }),
                new RouterLink("Register", RegisterView.class)
        );
    }

}
