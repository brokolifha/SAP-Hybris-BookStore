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
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CategoryForNewBook}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCategoryForNewBook extends GenericItem
{
	/** Qualifier of the <code>CategoryForNewBook.categoryName</code> attribute **/
	public static final String CATEGORYNAME = "categoryName";
	/** Qualifier of the <code>CategoryForNewBook.book</code> attribute **/
	public static final String BOOK = "book";
	/** Relation ordering override parameter constants for BookAndBookCategoryRelation from ((bookstorecore))*/
	protected static String BOOKANDBOOKCATEGORYRELATION_SRC_ORDERED = "relation.BookAndBookCategoryRelation.source.ordered";
	protected static String BOOKANDBOOKCATEGORYRELATION_TGT_ORDERED = "relation.BookAndBookCategoryRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for BookAndBookCategoryRelation from ((bookstorecore))*/
	protected static String BOOKANDBOOKCATEGORYRELATION_MARKMODIFIED = "relation.BookAndBookCategoryRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CATEGORYNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryForNewBook.book</code> attribute.
	 * @return the book
	 */
	public List<Book> getBook(final SessionContext ctx)
	{
		final List<Book> items = getLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.BOOKANDBOOKCATEGORYRELATION,
			"Book",
			null,
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryForNewBook.book</code> attribute.
	 * @return the book
	 */
	public List<Book> getBook()
	{
		return getBook( getSession().getSessionContext() );
	}
	
	public long getBookCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			BookstoreCoreConstants.Relations.BOOKANDBOOKCATEGORYRELATION,
			"Book",
			null
		);
	}
	
	public long getBookCount()
	{
		return getBookCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryForNewBook.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final SessionContext ctx, final List<Book> value)
	{
		setLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.BOOKANDBOOKCATEGORYRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(BOOKANDBOOKCATEGORYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryForNewBook.book</code> attribute. 
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
		addLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.BOOKANDBOOKCATEGORYRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(BOOKANDBOOKCATEGORYRELATION_MARKMODIFIED)
		);
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
		removeLinkedItems( 
			ctx,
			false,
			BookstoreCoreConstants.Relations.BOOKANDBOOKCATEGORYRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(BOOKANDBOOKCATEGORYRELATION_MARKMODIFIED)
		);
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
	 * <i>Generated method</i> - Getter of the <code>CategoryForNewBook.categoryName</code> attribute.
	 * @return the categoryName
	 */
	public EnumerationValue getCategoryName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CATEGORYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryForNewBook.categoryName</code> attribute.
	 * @return the categoryName
	 */
	public EnumerationValue getCategoryName()
	{
		return getCategoryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryForNewBook.categoryName</code> attribute. 
	 * @param value the categoryName
	 */
	public void setCategoryName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CATEGORYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryForNewBook.categoryName</code> attribute. 
	 * @param value the categoryName
	 */
	public void setCategoryName(final EnumerationValue value)
	{
		setCategoryName( getSession().getSessionContext(), value );
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
			return Utilities.getMarkModifiedOverride(BOOKANDBOOKCATEGORYRELATION_MARKMODIFIED);
		}
		return true;
	}
	
}
