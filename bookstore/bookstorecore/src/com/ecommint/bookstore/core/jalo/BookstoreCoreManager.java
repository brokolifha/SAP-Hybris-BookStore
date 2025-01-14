package com.ecommint.bookstore.core.jalo;

import com.ecommint.bookstore.core.constants.BookstoreCoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class BookstoreCoreManager extends GeneratedBookstoreCoreManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( BookstoreCoreManager.class.getName() );
	
	public static final BookstoreCoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (BookstoreCoreManager) em.getExtension(BookstoreCoreConstants.EXTENSIONNAME);
	}
	
}
