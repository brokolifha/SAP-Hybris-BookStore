/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 30 Oca 2025 18:15:14                        ---
 * ----------------------------------------------------------------
 */
package com.ecommint.bookstore.core.jalo;

import com.ecommint.bookstore.core.constants.BookstoreCoreConstants;
import com.ecommint.bookstore.core.jalo.Book;
import com.ecommint.bookstore.core.jalo.TakinBookTime;
import com.ecommint.bookstore.core.jalo.Writer;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Reader}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedReader extends GenericItem
{
	/** Qualifier of the <code>Reader.readerCode</code> attribute **/
	public static final String READERCODE = "readerCode";
	/** Qualifier of the <code>Reader.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>Reader.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>Reader.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>Reader.notification</code> attribute **/
	public static final String NOTIFICATION = "notification";
	/** Qualifier of the <code>Reader.book</code> attribute **/
	public static final String BOOK = "book";
	/** Qualifier of the <code>Reader.taking</code> attribute **/
	public static final String TAKING = "taking";
	/** Qualifier of the <code>Reader.writer</code> attribute **/
	public static final String WRITER = "writer";
	/** Relation ordering override parameter constants for ReaderAndWriterRelation from ((bookstorecore))*/
	protected static String READERANDWRITERRELATION_SRC_ORDERED = "relation.ReaderAndWriterRelation.source.ordered";
	protected static String READERANDWRITERRELATION_TGT_ORDERED = "relation.ReaderAndWriterRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for ReaderAndWriterRelation from ((bookstorecore))*/
	protected static String READERANDWRITERRELATION_MARKMODIFIED = "relation.ReaderAndWriterRelation.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n BOOK's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Book> BOOKHANDLER = new OneToManyHandler<Book>(
	BookstoreCoreConstants.TC.BOOK,
	false,
	"reader",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TAKING's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TakinBookTime> TAKINGHANDLER = new OneToManyHandler<TakinBookTime>(
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
		tmp.put(READERCODE, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(NOTIFICATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.book</code> attribute.
	 * @return the book
	 */
	public List<Book> getBook(final SessionContext ctx)
	{
		return (List<Book>)BOOKHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.book</code> attribute.
	 * @return the book
	 */
	public List<Book> getBook()
	{
		return getBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final SessionContext ctx, final List<Book> value)
	{
		BOOKHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.book</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>Reader.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Writer");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(READERANDWRITERRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.notification</code> attribute.
	 * @return the notification
	 */
	public String getNotification(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTIFICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.notification</code> attribute.
	 * @return the notification
	 */
	public String getNotification()
	{
		return getNotification( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.notification</code> attribute. 
	 * @param value the notification
	 */
	public void setNotification(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTIFICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.notification</code> attribute. 
	 * @param value the notification
	 */
	public void setNotification(final String value)
	{
		setNotification( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.readerCode</code> attribute.
	 * @return the readerCode
	 */
	public String getReaderCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, READERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.readerCode</code> attribute.
	 * @return the readerCode
	 */
	public String getReaderCode()
	{
		return getReaderCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.readerCode</code> attribute. 
	 * @param value the readerCode
	 */
	public void setReaderCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, READERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.readerCode</code> attribute. 
	 * @param value the readerCode
	 */
	public void setReaderCode(final String value)
	{
		setReaderCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.taking</code> attribute.
	 * @return the taking
	 */
	public List<TakinBookTime> getTaking(final SessionContext ctx)
	{
		return (List<TakinBookTime>)TAKINGHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.taking</code> attribute.
	 * @return the taking
	 */
	public List<TakinBookTime> getTaking()
	{
		return getTaking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.taking</code> attribute. 
	 * @param value the taking
	 */
	public void setTaking(final SessionContext ctx, final List<TakinBookTime> value)
	{
		TAKINGHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.taking</code> attribute. 
	 * @param value the taking
	 */
	public void setTaking(final List<TakinBookTime> value)
	{
		setTaking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taking. 
	 * @param value the item to add to taking
	 */
	public void addToTaking(final SessionContext ctx, final TakinBookTime value)
	{
		TAKINGHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taking. 
	 * @param value the item to add to taking
	 */
	public void addToTaking(final TakinBookTime value)
	{
		addToTaking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taking. 
	 * @param value the item to remove from taking
	 */
	public void removeFromTaking(final SessionContext ctx, final TakinBookTime value)
	{
		TAKINGHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taking. 
	 * @param value the item to remove from taking
	 */
	public void removeFromTaking(final TakinBookTime value)
	{
		removeFromTaking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.writer</code> attribute.
	 * @return the writer
	 */
	public List<Writer> getWriter(final SessionContext ctx)
	{
		final List<Writer> items = getLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.READERANDWRITERRELATION,
			"Writer",
			null,
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reader.writer</code> attribute.
	 * @return the writer
	 */
	public List<Writer> getWriter()
	{
		return getWriter( getSession().getSessionContext() );
	}
	
	public long getWriterCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			BookstoreCoreConstants.Relations.READERANDWRITERRELATION,
			"Writer",
			null
		);
	}
	
	public long getWriterCount()
	{
		return getWriterCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.writer</code> attribute. 
	 * @param value the writer
	 */
	public void setWriter(final SessionContext ctx, final List<Writer> value)
	{
		setLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.READERANDWRITERRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(READERANDWRITERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reader.writer</code> attribute. 
	 * @param value the writer
	 */
	public void setWriter(final List<Writer> value)
	{
		setWriter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to writer. 
	 * @param value the item to add to writer
	 */
	public void addToWriter(final SessionContext ctx, final Writer value)
	{
		addLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.READERANDWRITERRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(READERANDWRITERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to writer. 
	 * @param value the item to add to writer
	 */
	public void addToWriter(final Writer value)
	{
		addToWriter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from writer. 
	 * @param value the item to remove from writer
	 */
	public void removeFromWriter(final SessionContext ctx, final Writer value)
	{
		removeLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.READERANDWRITERRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(READERANDWRITERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from writer. 
	 * @param value the item to remove from writer
	 */
	public void removeFromWriter(final Writer value)
	{
		removeFromWriter( getSession().getSessionContext(), value );
	}
	
}
