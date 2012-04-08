package com.ty;

import com.vaadin.ui.AbstractComponentContainer;
import com.vaadin.ui.Button;

public class TheButton implements Button.ClickListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3760794728547843239L;
	Button thebutton;

	/** Creates button into given container. */
	public TheButton(AbstractComponentContainer container) {
		thebutton = new Button("Do not push this button");
		thebutton.addListener(this);
		container.addComponent(thebutton);
	}

	/** Handle button click events from the button. */
	public void buttonClick(Button.ClickEvent event) {
		thebutton.setCaption("Do not push this button again");
	}
}
