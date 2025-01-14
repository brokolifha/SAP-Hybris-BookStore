/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2024, 11:12:14 PM                   ---
 * ----------------------------------------------------------------
 */
package com.ecommint.bookstore.core.jalo;

import com.ecommint.bookstore.core.constants.BookstoreCoreConstants;
import com.ecommint.bookstore.core.jalo.CategoryForNewBook;
import com.ecommint.bookstore.core.jalo.Publisher;
import com.ecommint.bookstore.core.jalo.Reader;
import com.ecommint.bookstore.core.jalo.TakinBookTime;
import com.ecommint.bookstore.core.jalo.Writer;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Book}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedBook extends GenericItem
{
	/** Qualifier of the <code>Book.bookCode</code> attribute **/
	public static final String BOOKCODE = "bookCode";
	/** Qualifier of the <code>Book.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Book.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Book.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>Book.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>Book.imageList</code> attribute **/
	public static final String IMAGELIST = "imageList";
	/** Qualifier of the <code>Book.selling</code> attribute **/
	public static final String SELLING = "selling";
	/** Qualifier of the <code>Book.sellingCounmt</code> attribute **/
	public static final String SELLINGCOUNMT = "sellingCounmt";
	/** Qualifier of the <code>Book.publisher</code> attribute **/
	public static final String PUBLISHER = "publisher";
	/** Qualifier of the <code>Book.writers</code> attribute **/
	public static final String WRITERS = "writers";
	/** Relation ordering override parameter constants for WriterAndBookRelation from ((bookstorecore))*/
	protected static String WRITERANDBOOKRELATION_SRC_ORDERED = "relation.WriterAndBookRelation.source.ordered";
	protected static String WRITERANDBOOKRELATION_TGT_ORDERED = "relation.WriterAndBookRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for WriterAndBookRelation from ((bookstorecore))*/
	protected static String WRITERANDBOOKRELATION_MARKMODIFIED = "relation.WriterAndBookRelation.markmodified";
	/** Qualifier of the <code>Book.reader</code> attribute **/
	public static final String READER = "reader";
	/** Qualifier of the <code>Book.takingBook</code> attribute **/
	public static final String TAKINGBOOK = "takingBook";
	/** Qualifier of the <code>Book.categories</code> attribute **/
	public static final String CATEGORIES = "categories";
	/** Relation ordering override parameter constants for BookAndBookCategoryRelation from ((bookstorecore))*/
	protected static String BOOKANDBOOKCATEGORYRELATION_SRC_ORDERED = "relation.BookAndBookCategoryRelation.source.ordered";
	protected static String BOOKANDBOOKCATEGORYRELATION_TGT_ORDERED = "relation.BookAndBookCategoryRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for BookAndBookCategoryRelation from ((bookstorecore))*/
	protected static String BOOKANDBOOKCATEGORYRELATION_MARKMODIFIED = "relation.BookAndBookCategoryRelation.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PUBLISHER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBook> PUBLISHERHANDLER = new BidirectionalOneToManyHandler<GeneratedBook>(
	BookstoreCoreConstants.TC.BOOK,
	false,
	"publisher",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n READER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBook> READERHANDLER = new BidirectionalOneToManyHandler<GeneratedBook>(
	BookstoreCoreConstants.TC.BOOK,
	false,
	"reader",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TAKINGBOOK's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TakinBookTime> TAKINGBOOKHANDLER = new OneToManyHandler<TakinBookTime>(
	BookstoreCoreConstants.TC.TAKINBOOKTIME,
	false,
	"book",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BOOKCODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(IMAGELIST, AttributeMode.INITIAL);
		tmp.put(SELLING, AttributeMode.INITIAL);
		tmp.put(SELLINGCOUNMT, AttributeMode.INITIAL);
		tmp.put(PUBLISHER, AttributeMode.INITIAL);
		tmp.put(READER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.bookCode</code> attribute.
	 * @return the bookCode
	 */
	public String getBookCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BOOKCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.bookCode</code> attribute.
	 * @return the bookCode
	 */
	public String getBookCode()
	{
		return getBookCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.bookCode</code> attribute. 
	 * @param value the bookCode
	 */
	public void setBookCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BOOKCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.bookCode</code> attribute. 
	 * @param value the bookCode
	 */
	public void setBookCode(final String value)
	{
		setBookCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.categories</code> attribute.
	 * @return the categories
	 */
	public List<CategoryForNewBook> getCategories(final SessionContext ctx)
	{
		final List<CategoryForNewBook> items = getLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOKANDBOOKCATEGORYRELATION,
			"CategoryForNewBook",
			null,
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.categories</code> attribute.
	 * @return the categories
	 */
	public List<CategoryForNewBook> getCategories()
	{
		return getCategories( getSession().getSessionContext() );
	}
	
	public long getCategoriesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOKANDBOOKCATEGORYRELATION,
			"CategoryForNewBook",
			null
		);
	}
	
	public long getCategoriesCount()
	{
		return getCategoriesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.categories</code> attribute. 
	 * @param value the categories
	 */
	public void setCategories(final SessionContext ctx, final List<CategoryForNewBook> value)
	{
		setLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOKANDBOOKCATEGORYRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(BOOKANDBOOKCATEGORYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.categories</code> attribute. 
	 * @param value the categories
	 */
	public void setCategories(final List<CategoryForNewBook> value)
	{
		setCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categories. 
	 * @param value the item to add to categories
	 */
	public void addToCategories(final SessionContext ctx, final CategoryForNewBook value)
	{
		addLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOKANDBOOKCATEGORYRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(BOOKANDBOOKCATEGORYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categories. 
	 * @param value the item to add to categories
	 */
	public void addToCategories(final CategoryForNewBook value)
	{
		addToCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categories. 
	 * @param value the item to remove from categories
	 */
	public void removeFromCategories(final SessionContext ctx, final CategoryForNewBook value)
	{
		removeLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOKANDBOOKCATEGORYRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(BOOKANDBOOKCATEGORYRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(BOOKANDBOOKCATEGORYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categories. 
	 * @param value the item to remove from categories
	 */
	public void removeFromCategories(final CategoryForNewBook value)
	{
		removeFromCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.category</code> attribute.
	 * @return the category
	 */
	public EnumerationValue getCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.category</code> attribute.
	 * @return the category
	 */
	public EnumerationValue getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final EnumerationValue value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PUBLISHERHANDLER.newInstance(ctx, allAttributes);
		READERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.date</code> attribute. 
	 * @param value the date
	 */
	protected void setDate(final SessionContext ctx, final Date value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+DATE+"' is not changeable", 0 );
		}
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.date</code> attribute. 
	 * @param value the date
	 */
	protected void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.imageList</code> attribute.
	 * @return the imageList
	 */
	public List<Media> getImageList(final SessionContext ctx)
	{
		List<Media> coll = (List<Media>)getProperty( ctx, IMAGELIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.imageList</code> attribute.
	 * @return the imageList
	 */
	public List<Media> getImageList()
	{
		return getImageList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.imageList</code> attribute. 
	 * @param value the imageList
	 */
	public void setImageList(final SessionContext ctx, final List<Media> value)
	{
		setProperty(ctx, IMAGELIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.imageList</code> attribute. 
	 * @param value the imageList
	 */
	public void setImageList(final List<Media> value)
	{
		setImageList( getSession().getSessionContext(), value );
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
			return Utilities.getMarkModifiedOverride(WRITERANDBOOKRELATION_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("CategoryForNewBook");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(BOOKANDBOOKCATEGORYRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final Language value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publisher</code> attribute.
	 * @return the publisher
	 */
	public Publisher getPublisher(final SessionContext ctx)
	{
		return (Publisher)getProperty( ctx, PUBLISHER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publisher</code> attribute.
	 * @return the publisher
	 */
	public Publisher getPublisher()
	{
		return getPublisher( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publisher</code> attribute. 
	 * @param value the publisher
	 */
	public void setPublisher(final SessionContext ctx, final Publisher value)
	{
		PUBLISHERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publisher</code> attribute. 
	 * @param value the publisher
	 */
	public void setPublisher(final Publisher value)
	{
		setPublisher( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.reader</code> attribute.
	 * @return the reader
	 */
	public Reader getReader(final SessionContext ctx)
	{
		return (Reader)getProperty( ctx, READER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.reader</code> attribute.
	 * @return the reader
	 */
	public Reader getReader()
	{
		return getReader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final SessionContext ctx, final Reader value)
	{
		READERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final Reader value)
	{
		setReader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.selling</code> attribute.
	 * @return the selling
	 */
	public Boolean isSelling(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SELLING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.selling</code> attribute.
	 * @return the selling
	 */
	public Boolean isSelling()
	{
		return isSelling( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.selling</code> attribute. 
	 * @return the selling
	 */
	public boolean isSellingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSelling( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.selling</code> attribute. 
	 * @return the selling
	 */
	public boolean isSellingAsPrimitive()
	{
		return isSellingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.selling</code> attribute. 
	 * @param value the selling
	 */
	public void setSelling(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SELLING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.selling</code> attribute. 
	 * @param value the selling
	 */
	public void setSelling(final Boolean value)
	{
		setSelling( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.selling</code> attribute. 
	 * @param value the selling
	 */
	public void setSelling(final SessionContext ctx, final boolean value)
	{
		setSelling( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.selling</code> attribute. 
	 * @param value the selling
	 */
	public void setSelling(final boolean value)
	{
		setSelling( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.sellingCounmt</code> attribute.
	 * @return the sellingCounmt
	 */
	public Integer getSellingCounmt(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SELLINGCOUNMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.sellingCounmt</code> attribute.
	 * @return the sellingCounmt
	 */
	public Integer getSellingCounmt()
	{
		return getSellingCounmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.sellingCounmt</code> attribute. 
	 * @return the sellingCounmt
	 */
	public int getSellingCounmtAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSellingCounmt( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.sellingCounmt</code> attribute. 
	 * @return the sellingCounmt
	 */
	public int getSellingCounmtAsPrimitive()
	{
		return getSellingCounmtAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.sellingCounmt</code> attribute. 
	 * @param value the sellingCounmt
	 */
	public void setSellingCounmt(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SELLINGCOUNMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.sellingCounmt</code> attribute. 
	 * @param value the sellingCounmt
	 */
	public void setSellingCounmt(final Integer value)
	{
		setSellingCounmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.sellingCounmt</code> attribute. 
	 * @param value the sellingCounmt
	 */
	public void setSellingCounmt(final SessionContext ctx, final int value)
	{
		setSellingCounmt( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.sellingCounmt</code> attribute. 
	 * @param value the sellingCounmt
	 */
	public void setSellingCounmt(final int value)
	{
		setSellingCounmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.takingBook</code> attribute.
	 * @return the takingBook
	 */
	public List<TakinBookTime> getTakingBook(final SessionContext ctx)
	{
		return (List<TakinBookTime>)TAKINGBOOKHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.takingBook</code> attribute.
	 * @return the takingBook
	 */
	public List<TakinBookTime> getTakingBook()
	{
		return getTakingBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.takingBook</code> attribute. 
	 * @param value the takingBook
	 */
	public void setTakingBook(final SessionContext ctx, final List<TakinBookTime> value)
	{
		TAKINGBOOKHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.takingBook</code> attribute. 
	 * @param value the takingBook
	 */
	public void setTakingBook(final List<TakinBookTime> value)
	{
		setTakingBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to takingBook. 
	 * @param value the item to add to takingBook
	 */
	public void addToTakingBook(final SessionContext ctx, final TakinBookTime value)
	{
		TAKINGBOOKHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to takingBook. 
	 * @param value the item to add to takingBook
	 */
	public void addToTakingBook(final TakinBookTime value)
	{
		addToTakingBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from takingBook. 
	 * @param value the item to remove from takingBook
	 */
	public void removeFromTakingBook(final SessionContext ctx, final TakinBookTime value)
	{
		TAKINGBOOKHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from takingBook. 
	 * @param value the item to remove from takingBook
	 */
	public void removeFromTakingBook(final TakinBookTime value)
	{
		removeFromTakingBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.writers</code> attribute.
	 * @return the writers
	 */
	public List<Writer> getWriters(final SessionContext ctx)
	{
		final List<Writer> items = getLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.WRITERANDBOOKRELATION,
			"Writer",
			null,
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.writers</code> attribute.
	 * @return the writers
	 */
	public List<Writer> getWriters()
	{
		return getWriters( getSession().getSessionContext() );
	}
	
	public long getWritersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			BookstoreCoreConstants.Relations.WRITERANDBOOKRELATION,
			"Writer",
			null
		);
	}
	
	public long getWritersCount()
	{
		return getWritersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.writers</code> attribute. 
	 * @param value the writers
	 */
	public void setWriters(final SessionContext ctx, final List<Writer> value)
	{
		setLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.WRITERANDBOOKRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(WRITERANDBOOKRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.writers</code> attribute. 
	 * @param value the writers
	 */
	public void setWriters(final List<Writer> value)
	{
		setWriters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to writers. 
	 * @param value the item to add to writers
	 */
	public void addToWriters(final SessionContext ctx, final Writer value)
	{
		addLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.WRITERANDBOOKRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(WRITERANDBOOKRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to writers. 
	 * @param value the item to add to writers
	 */
	public void addToWriters(final Writer value)
	{
		addToWriters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from writers. 
	 * @param value the item to remove from writers
	 */
	public void removeFromWriters(final SessionContext ctx, final Writer value)
	{
		removeLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.WRITERANDBOOKRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(WRITERANDBOOKRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(WRITERANDBOOKRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from writers. 
	 * @param value the item to remove from writers
	 */
	public void removeFromWriters(final Writer value)
	{
		removeFromWriters( getSession().getSessionContext(), value );
	}
	
}
