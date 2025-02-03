/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 30 Oca 2025 18:15:14                        ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem StoryBook}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedStoryBook extends Book
{
	/** Qualifier of the <code>StoryBook.story</code> attribute **/
	public static final String STORY = "story";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Book.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StoryBook.story</code> attribute.
	 * @return the story
	 */
	public String getStory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StoryBook.story</code> attribute.
	 * @return the story
	 */
	public String getStory()
	{
		return getStory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StoryBook.story</code> attribute. 
	 * @param value the story
	 */
	public void setStory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StoryBook.story</code> attribute. 
	 * @param value the story
	 */
	public void setStory(final String value)
	{
		setStory( getSession().getSessionContext(), value );
	}
	
}
