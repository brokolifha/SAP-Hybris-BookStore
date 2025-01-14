/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2024, 11:12:14 PM                   ---
 * ----------------------------------------------------------------
 */
package com.ecommint.bookstore.fulfilmentprocess.jalo;

import com.ecommint.bookstore.core.jalo.Book;
import com.ecommint.bookstore.core.jalo.Reader;
import com.ecommint.bookstore.fulfilmentprocess.constants.BookstoreFulfilmentProcessConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.processengine.jalo.BusinessProcess BookReadProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedBookReadProcess extends BusinessProcess
{
	/** Qualifier of the <code>BookReadProcess.reader</code> attribute **/
	public static final String READER = "reader";
	/** Qualifier of the <code>BookReadProcess.book</code> attribute **/
	public static final String BOOK = "book";
	/** Qualifier of the <code>BookReadProcess.bookCode</code> attribute **/
	public static final String BOOKCODE = "bookCode";
	/** Qualifier of the <code>BookReadProcess.stock</code> attribute **/
	public static final String STOCK = "stock";
	/** Qualifier of the <code>BookReadProcess.bookStatus</code> attribute **/
	public static final String BOOKSTATUS = "bookStatus";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(READER, AttributeMode.INITIAL);
		tmp.put(BOOK, AttributeMode.INITIAL);
		tmp.put(BOOKCODE, AttributeMode.INITIAL);
		tmp.put(STOCK, AttributeMode.INITIAL);
		tmp.put(BOOKSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.book</code> attribute.
	 * @return the book
	 */
	public Book getBook(final SessionContext ctx)
	{
		return (Book)getProperty( ctx, BOOK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.book</code> attribute.
	 * @return the book
	 */
	public Book getBook()
	{
		return getBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final SessionContext ctx, final Book value)
	{
		setProperty(ctx, BOOK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final Book value)
	{
		setBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.bookCode</code> attribute.
	 * @return the bookCode
	 */
	public String getBookCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BOOKCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.bookCode</code> attribute.
	 * @return the bookCode
	 */
	public String getBookCode()
	{
		return getBookCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.bookCode</code> attribute. 
	 * @param value the bookCode
	 */
	public void setBookCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BOOKCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.bookCode</code> attribute. 
	 * @param value the bookCode
	 */
	public void setBookCode(final String value)
	{
		setBookCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.bookStatus</code> attribute.
	 * @return the bookStatus
	 */
	public EnumerationValue getBookStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BOOKSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.bookStatus</code> attribute.
	 * @return the bookStatus
	 */
	public EnumerationValue getBookStatus()
	{
		return getBookStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.bookStatus</code> attribute. 
	 * @param value the bookStatus
	 */
	public void setBookStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BOOKSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.bookStatus</code> attribute. 
	 * @param value the bookStatus
	 */
	public void setBookStatus(final EnumerationValue value)
	{
		setBookStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.reader</code> attribute.
	 * @return the reader
	 */
	public Reader getReader(final SessionContext ctx)
	{
		return (Reader)getProperty( ctx, READER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.reader</code> attribute.
	 * @return the reader
	 */
	public Reader getReader()
	{
		return getReader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final SessionContext ctx, final Reader value)
	{
		setProperty(ctx, READER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final Reader value)
	{
		setReader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.stock</code> attribute.
	 * @return the stock
	 */
	public Boolean isStock(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STOCK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.stock</code> attribute.
	 * @return the stock
	 */
	public Boolean isStock()
	{
		return isStock( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.stock</code> attribute. 
	 * @return the stock
	 */
	public boolean isStockAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStock( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookReadProcess.stock</code> attribute. 
	 * @return the stock
	 */
	public boolean isStockAsPrimitive()
	{
		return isStockAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.stock</code> attribute. 
	 * @param value the stock
	 */
	public void setStock(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STOCK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.stock</code> attribute. 
	 * @param value the stock
	 */
	public void setStock(final Boolean value)
	{
		setStock( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.stock</code> attribute. 
	 * @param value the stock
	 */
	public void setStock(final SessionContext ctx, final boolean value)
	{
		setStock( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookReadProcess.stock</code> attribute. 
	 * @param value the stock
	 */
	public void setStock(final boolean value)
	{
		setStock( getSession().getSessionContext(), value );
	}
	
}
