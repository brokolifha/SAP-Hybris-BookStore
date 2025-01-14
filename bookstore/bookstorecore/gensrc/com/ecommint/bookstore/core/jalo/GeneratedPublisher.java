/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2024, 11:12:14 PM                   ---
 * ----------------------------------------------------------------
 */
package com.ecommint.bookstore.core.jalo;

import com.ecommint.bookstore.core.constants.BookstoreCoreConstants;
import com.ecommint.bookstore.core.jalo.Book;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Publisher}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPublisher extends GenericItem
{
	/** Qualifier of the <code>Publisher.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Publisher.book</code> attribute **/
	public static final String BOOK = "book";
	/**
	* {@link OneToManyHandler} for handling 1:n BOOK's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Book> BOOKHANDLER = new OneToManyHandler<Book>(
	BookstoreCoreConstants.TC.BOOK,
	false,
	"publisher",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.book</code> attribute.
	 * @return the book
	 */
	public List<Book> getBook(final SessionContext ctx)
	{
		return (List<Book>)BOOKHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.book</code> attribute.
	 * @return the book
	 */
	public List<Book> getBook()
	{
		return getBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final SessionContext ctx, final List<Book> value)
	{
		BOOKHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final List<Book> value)
	{
		setBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to book. 
	 * @param value the item to add to book
	 */
	public void addToBook(final SessionContext ctx, final Book value)
	{
		BOOKHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to book. 
	 * @param value the item to add to book
	 */
	public void addToBook(final Book value)
	{
		addToBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from book. 
	 * @param value the item to remove from book
	 */
	public void removeFromBook(final SessionContext ctx, final Book value)
	{
		BOOKHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from book. 
	 * @param value the item to remove from book
	 */
	public void removeFromBook(final Book value)
	{
		removeFromBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Publisher.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Publisher.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
