package com.ecommint.bookstore.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import java.io.Serializable;

public class UpdateReaderEvent extends AbstractEvent implements Serializable {
    private String readerCode;
    private String firstName;
    private String lastName;

    public String getReaderCode() {
        return readerCode;
    }

    public void setReaderCode(String readerCode) {
        this.readerCode = readerCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UpdateReaderEvent(String readerCode, String firstName, String lastName) {
        this.readerCode = readerCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UpdateReaderEvent(Serializable source, String readerCode, String firstName, String lastName) {
        super(source);
        this.readerCode = readerCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
