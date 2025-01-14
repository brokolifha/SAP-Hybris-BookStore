/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2024, 11:12:14 PM                   ---
 * ----------------------------------------------------------------
 */
package com.ecommint.bookstore.core.jalo;

import com.ecommint.bookstore.core.constants.BookstoreCoreConstants;
import com.ecommint.bookstore.core.jalo.Book;
import com.ecommint.bookstore.core.jalo.Reader;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem TakinBookTime}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTakinBookTime extends GenericItem
{
	/** Qualifier of the <code>TakinBookTime.takingDate</code> attribute **/
	public static final String TAKINGDATE = "takingDate";
	/** Qualifier of the <code>TakinBookTime.returningDate</code> attribute **/
	public static final String RETURNINGDATE = "returningDate";
	/** Qualifier of the <code>TakinBookTime.book</code> attribute **/
	public static final String BOOK = "book";
	/** Qualifier of the <code>TakinBookTime.reader</code> attribute **/
	public static final String READER = "reader";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BOOK's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTakinBookTime> BOOKHANDLER = new BidirectionalOneToManyHandler<GeneratedTakinBookTime>(
	BookstoreCoreConstants.TC.TAKINBOOKTIME,
	false,
	"book",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n READER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTakinBookTime> READERHANDLER = new BidirectionalOneToManyHandler<GeneratedTakinBookTime>(
	BookstoreCoreConstants.TC.TAKINBOOKTIME,
	false,
	"reader",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TAKINGDATE, AttributeMode.INITIAL);
		tmp.put(RETURNINGDATE, AttributeMode.INITIAL);
		tmp.put(BOOK, AttributeMode.INITIAL);
		tmp.put(READER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TakinBookTime.book</code> attribute.
	 * @return the book
	 */
	public Book getBook(final SessionContext ctx)
	{
		return (Book)getProperty( ctx, BOOK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TakinBookTime.book</code> attribute.
	 * @return the book
	 */
	public Book getBook()
	{
		return getBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TakinBookTime.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final SessionContext ctx, final Book value)
	{
		BOOKHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TakinBookTime.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final Book value)
	{
		setBook( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BOOKHANDLER.newInstance(ctx, allAttributes);
		READERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TakinBookTime.reader</code> attribute.
	 * @return the reader
	 */
	public Reader getReader(final SessionContext ctx)
	{
		return (Reader)getProperty( ctx, READER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TakinBookTime.reader</code> attribute.
	 * @return the reader
	 */
	public Reader getReader()
	{
		return getReader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TakinBookTime.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final SessionContext ctx, final Reader value)
	{
		READERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TakinBookTime.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final Reader value)
	{
		setReader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TakinBookTime.returningDate</code> attribute.
	 * @return the returningDate
	 */
	public Date getReturningDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RETURNINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TakinBookTime.returningDate</code> attribute.
	 * @return the returningDate
	 */
	public Date getReturningDate()
	{
		return getReturningDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TakinBookTime.returningDate</code> attribute. 
	 * @param value the returningDate
	 */
	public void setReturningDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RETURNINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TakinBookTime.returningDate</code> attribute. 
	 * @param value the returningDate
	 */
	public void setReturningDate(final Date value)
	{
		setReturningDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TakinBookTime.takingDate</code> attribute.
	 * @return the takingDate
	 */
	public Date getTakingDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TAKINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TakinBookTime.takingDate</code> attribute.
	 * @return the takingDate
	 */
	public Date getTakingDate()
	{
		return getTakingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TakinBookTime.takingDate</code> attribute. 
	 * @param value the takingDate
	 */
	public void setTakingDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TAKINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TakinBookTime.takingDate</code> attribute. 
	 * @param value the takingDate
	 */
	public void setTakingDate(final Date value)
	{
		setTakingDate( getSession().getSessionContext(), value );
	}
	
}
