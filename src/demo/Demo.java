package demo;

import app.Application;
import factories.GUIFactory;
import factories.MacFactory;
import factories.WinFactory;

public class Demo {
	
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
            factory = new MacFactory();
            app = new Application(factory);
        } else {
            factory = new WinFactory();
            app = new Application(factory);
        }
        return app;
	}

	public static void main(String[] args) {
		 Application app = configureApplication();
	     app.paint();
	}
}
