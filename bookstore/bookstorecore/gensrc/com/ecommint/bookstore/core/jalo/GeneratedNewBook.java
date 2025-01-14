/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2024, 11:12:14 PM                   ---
 * ----------------------------------------------------------------
 */
package com.ecommint.bookstore.core.jalo;

import com.ecommint.bookstore.core.constants.BookstoreCoreConstants;
import com.ecommint.bookstore.core.jalo.Book;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem NewBook}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNewBook extends Book
{
	/** Qualifier of the <code>NewBook.newBookDescription</code> attribute **/
	public static final String NEWBOOKDESCRIPTION = "newBookDescription";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Book.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NEWBOOKDESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewBook.newBookDescription</code> attribute.
	 * @return the newBookDescription
	 */
	public String getNewBookDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NEWBOOKDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewBook.newBookDescription</code> attribute.
	 * @return the newBookDescription
	 */
	public String getNewBookDescription()
	{
		return getNewBookDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewBook.newBookDescription</code> attribute. 
	 * @param value the newBookDescription
	 */
	public void setNewBookDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NEWBOOKDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewBook.newBookDescription</code> attribute. 
	 * @param value the newBookDescription
	 */
	public void setNewBookDescription(final String value)
	{
		setNewBookDescription( getSession().getSessionContext(), value );
	}
	
}
