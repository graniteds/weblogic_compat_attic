/*
  GRANITE DATA SERVICES (www.graniteds.org)
  
  This class is PUBLIC DOMAIN and comes WITHOUT ANY WARRANTY; without even the
  implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package weblogic.servlet.security;


import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class is only intended to make possible the WebLogicSecurityService compilation
 * without the original WebLogic jars from BEA (Oracle). It must not be deployed.
 * <br><br>
 * It is based on the ServletAuthentication class found in WebLogic 10.3 and just declare
 * constants and functions actually used in GraniteDS WebLogicSecurityService.
 * 
 * @author Franck WOLFF
 */
public class ServletAuthentication {

	public static final int AUTHENTICATED = 0;
	public static final int FAILED_AUTHENTICATION = 1;
	public static final int NEEDS_CREDENTIALS = 2;

	public static boolean logout(HttpServletRequest request) {
		return false;
	}
	
	public static int login(String username, String password, HttpServletRequest request, HttpServletResponse response)
    	throws LoginException {
		return 0;
	}
}
