package com.ecommint.bookstore.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class NewBookEvent extends AbstractEvent {
    private String bookCode;



    public NewBookEvent(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
}
