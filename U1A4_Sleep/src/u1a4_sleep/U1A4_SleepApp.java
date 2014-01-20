/*
 * U1A4_SleepApp.java
 */

package u1a4_sleep;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class U1A4_SleepApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new U1A4_SleepView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of U1A4_SleepApp
     */
    public static U1A4_SleepApp getApplication() {
        return Application.getInstance(U1A4_SleepApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(U1A4_SleepApp.class, args);
    }
}
