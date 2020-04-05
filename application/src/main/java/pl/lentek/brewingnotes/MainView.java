package pl.lentek.brewingnotes;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        // Use TextField for standard text input
        TextField textField = new TextField("Your name");

        Button button = new Button("Say hello", e -> UI.getCurrent().navigate("batch"));


        add(textField, button);
    }
}
