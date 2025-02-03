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
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Writer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedWriter extends GenericItem
{
	/** Qualifier of the <code>Writer.writerCode</code> attribute **/
	public static final String WRITERCODE = "writerCode";
	/** Qualifier of the <code>Writer.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>Writer.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>Writer.books</code> attribute **/
	public static final String BOOKS = "books";
	/** Relation ordering override parameter constants for WriterAndBookRelation from ((bookstorecore))*/
	protected static String WRITERANDBOOKRELATION_SRC_ORDERED = "relation.WriterAndBookRelation.source.ordered";
	protected static String WRITERANDBOOKRELATION_TGT_ORDERED = "relation.WriterAndBookRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for WriterAndBookRelation from ((bookstorecore))*/
	protected static String WRITERANDBOOKRELATION_MARKMODIFIED = "relation.WriterAndBookRelation.markmodified";
	/** Qualifier of the <code>Writer.reader</code> attribute **/
	public static final String READER = "reader";
	/** Relation ordering override parameter constants for ReaderAndWriterRelation from ((bookstorecore))*/
	protected static String READERANDWRITERRELATION_SRC_ORDERED = "relation.ReaderAndWriterRelation.source.ordered";
	protected static String READERANDWRITERRELATION_TGT_ORDERED = "relation.ReaderAndWriterRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for ReaderAndWriterRelation from ((bookstorecore))*/
	protected static String READERANDWRITERRELATION_MARKMODIFIED = "relation.ReaderAndWriterRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(WRITERCODE, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Writer.books</code> attribute.
	 * @return the books
	 */
	public List<Book> getBooks(final SessionContext ctx)
	{
		final List<Book> items = getLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.WRITERANDBOOKRELATION,
			"Book",
			null,
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Writer.books</code> attribute.
	 * @return the books
	 */
	public List<Book> getBooks()
	{
		return getBooks( getSession().getSessionContext() );
	}
	
	public long getBooksCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			BookstoreCoreConstants.Relations.WRITERANDBOOKRELATION,
			"Book",
			null
		);
	}
	
	public long getBooksCount()
	{
		return getBooksCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Writer.books</code> attribute. 
	 * @param value the books
	 */
	public void setBooks(final SessionContext ctx, final List<Book> value)
	{
		setLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.WRITERANDBOOKRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(WRITERANDBOOKRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Writer.books</code> attribute. 
	 * @param value the books
	 */
	public void setBooks(final List<Book> value)
	{
		setBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to books. 
	 * @param value the item to add to books
	 */
	public void addToBooks(final SessionContext ctx, final Book value)
	{
		addLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.WRITERANDBOOKRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(WRITERANDBOOKRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to books. 
	 * @param value the item to add to books
	 */
	public void addToBooks(final Book value)
	{
		addToBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from books. 
	 * @param value the item to remove from books
	 */
	public void removeFromBooks(final SessionContext ctx, final Book value)
	{
		removeLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.WRITERANDBOOKRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(WRITERANDBOOKRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from books. 
	 * @param value the item to remove from books
	 */
	public void removeFromBooks(final Book value)
	{
		removeFromBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Writer.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Writer.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Writer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Writer.firstName</code> attribute. 
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
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Book");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(WRITERANDBOOKRELATION_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("Reader");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(READERANDWRITERRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Writer.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Writer.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Writer.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Writer.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Writer.reader</code> attribute.
	 * @return the reader
	 */
	public List<Reader> getReader(final SessionContext ctx)
	{
		final List<Reader> items = getLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.READERANDWRITERRELATION,
			"Reader",
			null,
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Writer.reader</code> attribute.
	 * @return the reader
	 */
	public List<Reader> getReader()
	{
		return getReader( getSession().getSessionContext() );
	}
	
	public long getReaderCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			BookstoreCoreConstants.Relations.READERANDWRITERRELATION,
			"Reader",
			null
		);
	}
	
	public long getReaderCount()
	{
		return getReaderCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Writer.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final SessionContext ctx, final List<Reader> value)
	{
		setLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.READERANDWRITERRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(READERANDWRITERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Writer.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final List<Reader> value)
	{
		setReader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reader. 
	 * @param value the item to add to reader
	 */
	public void addToReader(final SessionContext ctx, final Reader value)
	{
		addLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.READERANDWRITERRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(READERANDWRITERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reader. 
	 * @param value the item to add to reader
	 */
	public void addToReader(final Reader value)
	{
		addToReader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reader. 
	 * @param value the item to remove from reader
	 */
	public void removeFromReader(final SessionContext ctx, final Reader value)
	{
		removeLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.READERANDWRITERRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(READERANDWRITERRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(READERANDWRITERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reader. 
	 * @param value the item to remove from reader
	 */
	public void removeFromReader(final Reader value)
	{
		removeFromReader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Writer.writerCode</code> attribute.
	 * @return the writerCode
	 */
	public String getWriterCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WRITERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Writer.writerCode</code> attribute.
	 * @return the writerCode
	 */
	public String getWriterCode()
	{
		return getWriterCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Writer.writerCode</code> attribute. 
	 * @param value the writerCode
	 */
	public void setWriterCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WRITERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Writer.writerCode</code> attribute. 
	 * @param value the writerCode
	 */
	public void setWriterCode(final String value)
	{
		setWriterCode( getSession().getSessionContext(), value );
	}
	
}
