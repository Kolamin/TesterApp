package ru.anton.views.admin;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import ru.anton.views.main.MainView;

@CssImport("./views/admin/admin-view.css")
@Route(value = "admin", layout = MainView.class)
@PageTitle("Admin")
public class AdminView extends Div {

    public AdminView() {
        addClassName("admin-view");
        add(new Text("Content placeholder"));
    }

}
