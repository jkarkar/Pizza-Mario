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
public class OrderLine
{
	private final IMendixObject orderLineMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "PizzaMario.OrderLine";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Pizza("Pizza"),
		Amount("Amount"),
		OrderLine_Order("PizzaMario.OrderLine_Order");

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

	public OrderLine(IContext context)
	{
		this(context, Core.instantiate(context, "PizzaMario.OrderLine"));
	}

	protected OrderLine(IContext context, IMendixObject orderLineMendixObject)
	{
		if (orderLineMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("PizzaMario.OrderLine", orderLineMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a PizzaMario.OrderLine");

		this.orderLineMendixObject = orderLineMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new OrderLine(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static pizzamario.proxies.OrderLine create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "PizzaMario.OrderLine");
		return new pizzamario.proxies.OrderLine(context, mendixObject);
	}

	/**
	 * @deprecated Use 'OrderLine.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static pizzamario.proxies.OrderLine initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return pizzamario.proxies.OrderLine.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static pizzamario.proxies.OrderLine initialize(IContext context, IMendixObject mendixObject)
	{
		return new pizzamario.proxies.OrderLine(context, mendixObject);
	}

	public static pizzamario.proxies.OrderLine load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return pizzamario.proxies.OrderLine.initialize(context, mendixObject);
	}

	public static java.util.List<pizzamario.proxies.OrderLine> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<pizzamario.proxies.OrderLine> result = new java.util.ArrayList<pizzamario.proxies.OrderLine>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//PizzaMario.OrderLine" + xpathConstraint))
			result.add(pizzamario.proxies.OrderLine.initialize(context, obj));
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
	 * Set value of Pizza
	 * @param pizza
	 */
	public final pizzamario.proxies.PizzaTypes getPizza()
	{
		return getPizza(getContext());
	}

	/**
	 * @param context
	 * @return value of Pizza
	 */
	public final pizzamario.proxies.PizzaTypes getPizza(IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Pizza.toString());
		if (obj == null)
			return null;

		return pizzamario.proxies.PizzaTypes.valueOf((String) obj);
	}

	/**
	 * Set value of Pizza
	 * @param pizza
	 */
	public final void setPizza(pizzamario.proxies.PizzaTypes pizza)
	{
		setPizza(getContext(), pizza);
	}

	/**
	 * Set value of Pizza
	 * @param context
	 * @param pizza
	 */
	public final void setPizza(IContext context, pizzamario.proxies.PizzaTypes pizza)
	{
		if (pizza != null)
			getMendixObject().setValue(context, MemberNames.Pizza.toString(), pizza.toString());
		else
			getMendixObject().setValue(context, MemberNames.Pizza.toString(), null);
	}

	/**
	 * @return value of Amount
	 */
	public final Integer getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final Integer getAmount(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(Integer amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(IContext context, Integer amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of OrderLine_Order
	 */
	public final pizzamario.proxies.Order getOrderLine_Order() throws CoreException
	{
		return getOrderLine_Order(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderLine_Order
	 */
	public final pizzamario.proxies.Order getOrderLine_Order(IContext context) throws CoreException
	{
		pizzamario.proxies.Order result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OrderLine_Order.toString());
		if (identifier != null)
			result = pizzamario.proxies.Order.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OrderLine_Order
	 * @param orderline_order
	 */
	public final void setOrderLine_Order(pizzamario.proxies.Order orderline_order)
	{
		setOrderLine_Order(getContext(), orderline_order);
	}

	/**
	 * Set value of OrderLine_Order
	 * @param context
	 * @param orderline_order
	 */
	public final void setOrderLine_Order(IContext context, pizzamario.proxies.Order orderline_order)
	{
		if (orderline_order == null)
			getMendixObject().setValue(context, MemberNames.OrderLine_Order.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OrderLine_Order.toString(), orderline_order.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return orderLineMendixObject;
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
			final pizzamario.proxies.OrderLine that = (pizzamario.proxies.OrderLine) obj;
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
		return "PizzaMario.OrderLine";
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
