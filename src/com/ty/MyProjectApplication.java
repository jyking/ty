package com.ty;

import java.util.Date;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Window.Notification;

public class MyProjectApplication extends Application {

	private static final long serialVersionUID = 742133396374707487L;

	@Override
	public void init() {
		final Window mainWindow = new Window("ty�ҵ�Ӧ��");
		mainWindow.addComponent(new WindowOpener("Window Opener", mainWindow));
		setMainWindow(mainWindow);
	}

}
