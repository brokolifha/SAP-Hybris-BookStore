/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 30 Oca 2025 18:15:14                        ---
 * ----------------------------------------------------------------
 */
package com.ecommint.bookstore.core.jalo;

import com.ecommint.bookstore.core.constants.BookstoreCoreConstants;
import com.ecommint.bookstore.core.jalo.Book;
import com.ecommint.bookstore.core.jalo.Reader;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ReadingBook}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedReadingBook extends GenericItem
{
	/** Qualifier of the <code>ReadingBook.reader</code> attribute **/
	public static final String READER = "reader";
	/** Qualifier of the <code>ReadingBook.book</code> attribute **/
	public static final String BOOK = "book";
	/** Qualifier of the <code>ReadingBook.takingDate</code> attribute **/
	public static final String TAKINGDATE = "takingDate";
	/** Qualifier of the <code>ReadingBook.returningDate</code> attribute **/
	public static final String RETURNINGDATE = "returningDate";
	/** Qualifier of the <code>ReadingBook.reading</code> attribute **/
	public static final String READING = "reading";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(READER, AttributeMode.INITIAL);
		tmp.put(BOOK, AttributeMode.INITIAL);
		tmp.put(TAKINGDATE, AttributeMode.INITIAL);
		tmp.put(RETURNINGDATE, AttributeMode.INITIAL);
		tmp.put(READING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.book</code> attribute.
	 * @return the book
	 */
	public Book getBook(final SessionContext ctx)
	{
		return (Book)getProperty( ctx, BOOK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.book</code> attribute.
	 * @return the book
	 */
	public Book getBook()
	{
		return getBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final SessionContext ctx, final Book value)
	{
		setProperty(ctx, BOOK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final Book value)
	{
		setBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.reader</code> attribute.
	 * @return the reader
	 */
	public Reader getReader(final SessionContext ctx)
	{
		return (Reader)getProperty( ctx, READER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.reader</code> attribute.
	 * @return the reader
	 */
	public Reader getReader()
	{
		return getReader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final SessionContext ctx, final Reader value)
	{
		setProperty(ctx, READER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final Reader value)
	{
		setReader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.reading</code> attribute.
	 * @return the reading
	 */
	public Boolean isReading(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, READING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.reading</code> attribute.
	 * @return the reading
	 */
	public Boolean isReading()
	{
		return isReading( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.reading</code> attribute. 
	 * @return the reading
	 */
	public boolean isReadingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReading( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.reading</code> attribute. 
	 * @return the reading
	 */
	public boolean isReadingAsPrimitive()
	{
		return isReadingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.reading</code> attribute. 
	 * @param value the reading
	 */
	public void setReading(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, READING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.reading</code> attribute. 
	 * @param value the reading
	 */
	public void setReading(final Boolean value)
	{
		setReading( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.reading</code> attribute. 
	 * @param value the reading
	 */
	public void setReading(final SessionContext ctx, final boolean value)
	{
		setReading( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.reading</code> attribute. 
	 * @param value the reading
	 */
	public void setReading(final boolean value)
	{
		setReading( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.returningDate</code> attribute.
	 * @return the returningDate
	 */
	public Date getReturningDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RETURNINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.returningDate</code> attribute.
	 * @return the returningDate
	 */
	public Date getReturningDate()
	{
		return getReturningDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.returningDate</code> attribute. 
	 * @param value the returningDate
	 */
	public void setReturningDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RETURNINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.returningDate</code> attribute. 
	 * @param value the returningDate
	 */
	public void setReturningDate(final Date value)
	{
		setReturningDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.takingDate</code> attribute.
	 * @return the takingDate
	 */
	public Date getTakingDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TAKINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReadingBook.takingDate</code> attribute.
	 * @return the takingDate
	 */
	public Date getTakingDate()
	{
		return getTakingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.takingDate</code> attribute. 
	 * @param value the takingDate
	 */
	public void setTakingDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TAKINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReadingBook.takingDate</code> attribute. 
	 * @param value the takingDate
	 */
	public void setTakingDate(final Date value)
	{
		setTakingDate( getSession().getSessionContext(), value );
	}
	
}
