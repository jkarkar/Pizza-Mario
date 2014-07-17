// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package performancetool.actions;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * 
 */
public class GetHostname extends UserAction<String>
{
	public GetHostname()
	{
		super();
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		try {
			java.net.InetAddress localMachine =
			java.net.InetAddress.getLocalHost();
			Core.getLogger("GetHostname").debug("Hostname of local machine: " +	localMachine.getHostName());
			Core.getLogger("GetHostname").debug("Canonical hostname of local machine: " +	localMachine.getCanonicalHostName());
			return localMachine.getHostName().toLowerCase();
		}
		catch (java.net.UnknownHostException uhe) {
			Core.getLogger("GetHostname").error("UnknownHostException " + uhe.getMessage());
			return "localhost";
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetHostname";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
