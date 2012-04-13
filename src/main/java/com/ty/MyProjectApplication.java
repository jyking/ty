package com.ty;

import com.vaadin.Application;
import com.vaadin.ui.Window;

public class MyProjectApplication extends Application {

	private static final long serialVersionUID = 742133396374707487L;

	@Override
	public void init() {
		final Window mainWindow = new Window("ty我的应用");
		mainWindow.addComponent(new WindowOpener("Window Opener", mainWindow));
		setMainWindow(mainWindow);
	}

}
