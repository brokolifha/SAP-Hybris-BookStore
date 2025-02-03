/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 30 Oca 2025 18:15:14                        ---
 * ----------------------------------------------------------------
 */
package com.ecommint.bookstore.core.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated(since = "ages", forRemoval = false)
@SuppressWarnings({"unused","cast"})
public class GeneratedBookstoreCoreConstants
{
	public static final String EXTENSIONNAME = "bookstorecore";
	public static class TC
	{
		public static final String APPARELPRODUCT = "ApparelProduct".intern();
		public static final String APPARELSIZEVARIANTPRODUCT = "ApparelSizeVariantProduct".intern();
		public static final String APPARELSTYLEVARIANTPRODUCT = "ApparelStyleVariantProduct".intern();
		public static final String BOOK = "Book".intern();
		public static final String BOOKCATEGORIES = "BookCategories".intern();
		public static final String BOOKSTATUS = "BookStatus".intern();
		public static final String CATEGORYFORNEWBOOK = "CategoryForNewBook".intern();
		public static final String ELECTRONICSCOLORVARIANTPRODUCT = "ElectronicsColorVariantProduct".intern();
		public static final String NEWBOOK = "NewBook".intern();
		public static final String PUBLISHER = "Publisher".intern();
		public static final String READER = "Reader".intern();
		public static final String READINGBOOK = "ReadingBook".intern();
		public static final String REMOVEOLDBOOKCJ = "RemoveOldBookCj".intern();
		public static final String STORYBOOK = "StoryBook".intern();
		public static final String SWATCHCOLORENUM = "SwatchColorEnum".intern();
		public static final String TAKINBOOKTIME = "TakinBookTime".intern();
		public static final String WRITER = "Writer".intern();
	}
	public static class Attributes
	{
		public static class Product
		{
			public static final String PUBLISHER = "publisher".intern();
		}
	}
	public static class Enumerations
	{
		public static class BookCategories
		{
			public static final String ACTION = "Action".intern();
			public static final String KOMEDI = "Komedi".intern();
			public static final String GERILIM = "Gerilim".intern();
			public static final String MACERA = "Macera".intern();
			public static final String POLISIYE = "Polisiye".intern();
			public static final String YENI = "Yeni".intern();
		}
		public static class BookStatus
		{
			public static final String RECEIVABLE = "receivable".intern();
			public static final String CANTREVEIVABLE = "cantReveivable".intern();
			public static final String INSTOCK = "inStock".intern();
			public static final String OUTSTOCK = "outStock".intern();
			public static final String RETURNED = "returned".intern();
		}
		public static class SwatchColorEnum
		{
			public static final String BLACK = "BLACK".intern();
			public static final String BLUE = "BLUE".intern();
			public static final String BROWN = "BROWN".intern();
			public static final String GREEN = "GREEN".intern();
			public static final String GREY = "GREY".intern();
			public static final String ORANGE = "ORANGE".intern();
			public static final String PINK = "PINK".intern();
			public static final String PURPLE = "PURPLE".intern();
			public static final String RED = "RED".intern();
			public static final String SILVER = "SILVER".intern();
			public static final String WHITE = "WHITE".intern();
			public static final String YELLOW = "YELLOW".intern();
		}
	}
	public static class Relations
	{
		public static final String BOOKANDBOOKCATEGORYRELATION = "BookAndBookCategoryRelation".intern();
		public static final String BOOKANDPUBLISHERRELATION = "BookAndPublisherRelation".intern();
		public static final String BOOKANDREADERRELATION = "BookandReaderRelation".intern();
		public static final String BOOKTAKINGRELATION = "BookTakingRelation".intern();
		public static final String READERANDWRITERRELATION = "ReaderAndWriterRelation".intern();
		public static final String READERTAKINGRELATION = "ReaderTakingRelation".intern();
		public static final String WRITERANDBOOKRELATION = "WriterAndBookRelation".intern();
	}
	
	protected GeneratedBookstoreCoreConstants()
	{
		// private constructor
	}
	
	
}
