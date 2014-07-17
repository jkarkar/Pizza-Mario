// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package performancetool.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Settings
{
	private final IMendixObject settingsMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "PerformanceTool.Settings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Node("Node"),
		Level("Level");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Settings(IContext context)
	{
		this(context, Core.instantiate(context, "PerformanceTool.Settings"));
	}

	protected Settings(IContext context, IMendixObject settingsMendixObject)
	{
		if (settingsMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("PerformanceTool.Settings", settingsMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a PerformanceTool.Settings");

		this.settingsMendixObject = settingsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new Settings(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static performancetool.proxies.Settings create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "PerformanceTool.Settings");
		return new performancetool.proxies.Settings(context, mendixObject);
	}

	/**
	 * @deprecated Use 'Settings.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static performancetool.proxies.Settings initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return performancetool.proxies.Settings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static performancetool.proxies.Settings initialize(IContext context, IMendixObject mendixObject)
	{
		return new performancetool.proxies.Settings(context, mendixObject);
	}

	public static performancetool.proxies.Settings load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return performancetool.proxies.Settings.initialize(context, mendixObject);
	}

	public static java.util.List<performancetool.proxies.Settings> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<performancetool.proxies.Settings> result = new java.util.ArrayList<performancetool.proxies.Settings>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//PerformanceTool.Settings" + xpathConstraint))
			result.add(performancetool.proxies.Settings.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Node
	 */
	public final String getNode()
	{
		return getNode(getContext());
	}

	/**
	 * @param context
	 * @return value of Node
	 */
	public final String getNode(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Node.toString());
	}

	/**
	 * Set value of Node
	 * @param node
	 */
	public final void setNode(String node)
	{
		setNode(getContext(), node);
	}

	/**
	 * Set value of Node
	 * @param context
	 * @param node
	 */
	public final void setNode(IContext context, String node)
	{
		getMendixObject().setValue(context, MemberNames.Node.toString(), node);
	}

	/**
	 * Set value of Level
	 * @param level
	 */
	public final performancetool.proxies.Level getLevel()
	{
		return getLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of Level
	 */
	public final performancetool.proxies.Level getLevel(IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Level.toString());
		if (obj == null)
			return null;

		return performancetool.proxies.Level.valueOf((String) obj);
	}

	/**
	 * Set value of Level
	 * @param level
	 */
	public final void setLevel(performancetool.proxies.Level level)
	{
		setLevel(getContext(), level);
	}

	/**
	 * Set value of Level
	 * @param context
	 * @param level
	 */
	public final void setLevel(IContext context, performancetool.proxies.Level level)
	{
		if (level != null)
			getMendixObject().setValue(context, MemberNames.Level.toString(), level.toString());
		else
			getMendixObject().setValue(context, MemberNames.Level.toString(), null);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return settingsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final performancetool.proxies.Settings that = (performancetool.proxies.Settings) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "PerformanceTool.Settings";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().getGuid();
	}
}