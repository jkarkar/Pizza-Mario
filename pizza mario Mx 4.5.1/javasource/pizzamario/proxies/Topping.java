// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pizzamario.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Topping
{
	private final IMendixObject toppingMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "PizzaMario.Topping";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Rating("Rating");

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

	public Topping(IContext context)
	{
		this(context, Core.instantiate(context, "PizzaMario.Topping"));
	}

	protected Topping(IContext context, IMendixObject toppingMendixObject)
	{
		if (toppingMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("PizzaMario.Topping", toppingMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a PizzaMario.Topping");

		this.toppingMendixObject = toppingMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new Topping(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static pizzamario.proxies.Topping create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "PizzaMario.Topping");
		return new pizzamario.proxies.Topping(context, mendixObject);
	}

	/**
	 * @deprecated Use 'Topping.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static pizzamario.proxies.Topping initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return pizzamario.proxies.Topping.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static pizzamario.proxies.Topping initialize(IContext context, IMendixObject mendixObject)
	{
		return new pizzamario.proxies.Topping(context, mendixObject);
	}

	public static pizzamario.proxies.Topping load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return pizzamario.proxies.Topping.initialize(context, mendixObject);
	}

	public static java.util.List<pizzamario.proxies.Topping> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<pizzamario.proxies.Topping> result = new java.util.ArrayList<pizzamario.proxies.Topping>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//PizzaMario.Topping" + xpathConstraint))
			result.add(pizzamario.proxies.Topping.initialize(context, obj));
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
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Rating
	 */
	public final Integer getRating()
	{
		return getRating(getContext());
	}

	/**
	 * @param context
	 * @return value of Rating
	 */
	public final Integer getRating(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Rating.toString());
	}

	/**
	 * Set value of Rating
	 * @param rating
	 */
	public final void setRating(Integer rating)
	{
		setRating(getContext(), rating);
	}

	/**
	 * Set value of Rating
	 * @param context
	 * @param rating
	 */
	public final void setRating(IContext context, Integer rating)
	{
		getMendixObject().setValue(context, MemberNames.Rating.toString(), rating);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return toppingMendixObject;
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
			final pizzamario.proxies.Topping that = (pizzamario.proxies.Topping) obj;
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
		return "PizzaMario.Topping";
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
