package com.ecommint.bookstore.fulfilmentprocess.jalo;

import com.ecommint.bookstore.fulfilmentprocess.constants.BookstoreFulfilmentProcessConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class BookstoreFulfilmentProcessManager extends GeneratedBookstoreFulfilmentProcessManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( BookstoreFulfilmentProcessManager.class.getName() );
	
	public static final BookstoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (BookstoreFulfilmentProcessManager) em.getExtension(BookstoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
