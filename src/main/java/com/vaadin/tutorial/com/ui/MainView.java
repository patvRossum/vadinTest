package com.vaadin.tutorial.com.ui;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
//Hello
//dd
    //tt
ds
    //gg

    //dw
@Route ("")
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = true)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    public MainView(){
       /*
        Button  button = new Button("Click-me");
       DatePicker datePicker = new DatePicker("Pick a Date");

       HorizontalLayout layout = new HorizontalLayout(button,datePicker);
       layout.setDefaultVerticalComponentAlignment(Alignment.END);

       add(layout);

       button.addClickListener(click -> add (new Paragraph("Clicked: "+ datePicker.getValue())));
       */

    }
}
