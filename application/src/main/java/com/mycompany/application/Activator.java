package com.mycompany.application;

import com.mycompany.view.MainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(final BundleContext context) throws Exception {
        Logger.getLogger(getClass().getName()).log(Level.INFO, getClass().getName());
        //context.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame.getInstance().setContext(context);
                MainFrame.getInstance().setVisible(true);
                MainFrame.getInstance().notifyActions();
                MainFrame.getInstance().refresh();
            }
        });
    }

    public void stop(BundleContext context) throws Exception {
    }

}
