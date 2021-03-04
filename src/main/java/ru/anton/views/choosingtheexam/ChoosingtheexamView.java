package ru.anton.views.choosingtheexam;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.RouterLink;
import ru.anton.views.main.MainView;
import ru.anton.views.question.QuestionView;

@CssImport("./views/choosingtheexam/choosingtheexam-view.css")
@Route(value = "exam", layout = MainView.class)
@PageTitle("Choosing the exam")
public class ChoosingtheexamView extends Div {

    public ChoosingtheexamView() {
        addClassName("choosingtheexam-view");
        Div menu = new Div();

        RouterLink testLink = new RouterLink("Г.2.1 Эксплуатация тепловых энергоустановок и тепловых сетей",
                QuestionView.class);
        testLink.setHighlightCondition(HighlightConditions.sameLocation());
        menu.add(testLink);

        add(menu);
    }

}
