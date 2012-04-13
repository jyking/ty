package com.ty;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.CloseEvent;
import com.vaadin.ui.Window.CloseListener;

public class WindowOpener extends CustomComponent implements CloseListener {

	private static final long serialVersionUID = -5799414114565184111L;
	Window mainwindow; // Reference to main window
	Window mywindow; // The window to be opened
	Button openbutton; // Button for opening the window
	Button closebutton; // A button in the window
	Label explanation; // A descriptive text

	public WindowOpener(String label, Window main) {
		mainwindow = main;
		// The component contains a button that opens the window.
		final VerticalLayout layout = new VerticalLayout();
		openbutton = new Button("Open Window11", this, "openButtonClick");
		explanation = new Label("Explanation");
		layout.addComponent(openbutton);
		layout.addComponent(explanation);
		setCompositionRoot(layout);
	}

	/** Handle the clicks for the two buttons. */
	public void openButtonClick(ClickEvent event) {
		/* Create a new window. */
		mywindow = new Window("My Dialog");
		mywindow.setPositionX(200);
		mywindow.setPositionY(100);
		mywindow.setWidth("500px");
		/* Add the window inside the main window. */
		mainwindow.addWindow(mywindow);
		/* Listen for close events for the window. */
		mywindow.addListener(this);
		/* Add components in the window. */
		mywindow.addComponent(new Label("A text label in the window."));
		closebutton = new Button("Close", this, "closeButtonClick");
		mywindow.addComponent(closebutton);
		/* Allow opening only one window at a time. */
		openbutton.setEnabled(false);
		explanation.setValue("Window opened");
	}

	/** Handle Close button click and close the window. */
	public void closeButtonClick(Button.ClickEvent event) {
		/* Windows are managed by the application object. */
		mainwindow.removeWindow(mywindow);
		/* Return to initial state. */
		openbutton.setEnabled(true);
		explanation.setValue("Closed with button");
	}

	/** In case the window is closed otherwise. */
	public void windowClose(CloseEvent e) {
		/* Return to initial state. */
		openbutton.setEnabled(true);
		explanation.setValue("Closed with window controls");
	}
}