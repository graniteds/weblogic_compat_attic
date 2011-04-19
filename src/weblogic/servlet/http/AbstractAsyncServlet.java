/*
  GRANITE DATA SERVICES (www.graniteds.org)
  
  This class is PUBLIC DOMAIN and comes WITHOUT ANY WARRANTY; without even the
  implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package weblogic.servlet.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * This class is a just skeleton of the actual WebLogic (Oracle) AbstractAsyncServlet
 * class implementation. It's only purpose is to make possible the compilation of the
 * Gravity module for WebLogic servers.
 * <br>
 * Asynchronous support in WebLogic is available since version 9.1.
 * 
 * @author Franck WOLFF
 */
public abstract class AbstractAsyncServlet extends HttpServlet implements FutureResponseModel {

	private static final long serialVersionUID = 1L;

	public static final int DEFAULT_TIMEOUT = 40000;
	public static final int DEFAULT_SCAVANGE_INTERVAL = 40000;	
	
	protected abstract  boolean doRequest(RequestResponseKey rrk) throws IOException, ServletException;
	
	protected abstract  void doResponse(RequestResponseKey rrk, Object context) throws IOException, ServletException;
	
	protected abstract  void doTimeout(RequestResponseKey rrk) throws IOException, ServletException;

	protected void setTimeout(int period) {
	}

	public static final void setScavangeInterval(int period) {
	}

	public static final void notify(RequestResponseKey id, Object context) throws IOException {    	
    }
}
