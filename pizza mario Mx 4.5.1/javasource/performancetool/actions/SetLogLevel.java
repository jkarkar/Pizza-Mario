// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package performancetool.actions;

import nl.mansystems.performancetool.PerformanceToolLogSubscriber;
import com.mendix.core.Core;
import com.mendix.m2ee.log.ILogNode;
import com.mendix.m2ee.log.LogLevel;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * 
 */
public class SetLogLevel extends UserAction<Boolean>
{
	private String NodePar;
	private performancetool.proxies.Level LevelPar;

	public SetLogLevel(String NodePar, String LevelPar)
	{
		super();
		this.NodePar = NodePar;
		this.LevelPar = LevelPar == null ? null : performancetool.proxies.Level.valueOf(LevelPar);
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
        try {
        	ILogNode iLogNode = PerformanceToolLogSubscriber.getInstance().getLogNodeFromFilter(NodePar);
        	if (iLogNode != null)
        		PerformanceToolLogSubscriber.getInstance().setOutputLevel(iLogNode, LogLevel.valueOf(LevelPar.toString()));
        }
        catch (final Throwable ex) {
            Core.getLogger("Logging").error("Exception while setting loglevel.", ex);
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "SetLogLevel";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
