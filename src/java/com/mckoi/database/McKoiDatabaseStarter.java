/*
 * Created on 19.5.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package com.mckoi.database;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author tryggvil
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class McKoiDatabaseStarter implements ServletContextListener {
	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		startDatabase(arg0.getServletContext());
	}
	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		stopDatabase(arg0.getServletContext());
	}
	
	public static void startDatabase(ServletContext context) {
		//TODO: Implement this
	}
	
	public static void stopDatabase(ServletContext context) {
		//TODO: Implement this
	}			
}
