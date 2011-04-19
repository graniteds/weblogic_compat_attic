/*
  GRANITE DATA SERVICES (www.graniteds.org)
  
  This class is PUBLIC DOMAIN and comes WITHOUT ANY WARRANTY; without even the
  implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package weblogic.servlet.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class is a just skeleton of the actual WebLogic (Oracle) RequestResponseKey
 * class implementation. It's only purpose is to make possible the compilation of the
 * Gravity module for WebLogic servers.
 * <br>
 * Asynchronous support in WebLogic is available since version 9.1.
 * 
 * @author Franck WOLFF
 */
public class RequestResponseKey {

	public HttpServletRequest getRequest() {
		return null;
	}

	public HttpServletResponse getResponse() {
		return null;
	}

	/*
	Introduced in WebLogic 9.2. Skipped for 9.1 compatibility.
	
	public boolean isValid() {
		return false;
	}
	*/

	public long getTimeout() {
		return 0L;
	}
	public void setTimeout(int timeout) {
	}
}
