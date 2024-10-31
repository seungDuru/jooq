/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.generated.tables.JLanguage;
import org.jooq.generated.tables.pojos.Language;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LanguageRecord extends UpdatableRecordImpl<LanguageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.language.language_id</code>.
     */
    public LanguageRecord setLanguageId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.language.language_id</code>.
     */
    public Integer getLanguageId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sakila.language.name</code>.
     */
    public LanguageRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.language.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.language.last_update</code>.
     */
    public LanguageRecord setLastUpdate(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.language.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LanguageRecord
     */
    public LanguageRecord() {
        super(JLanguage.LANGUAGE);
    }

    /**
     * Create a detached, initialised LanguageRecord
     */
    public LanguageRecord(Integer languageId, String name, LocalDateTime lastUpdate) {
        super(JLanguage.LANGUAGE);

        setLanguageId(languageId);
        setName(name);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised LanguageRecord
     */
    public LanguageRecord(Language value) {
        super(JLanguage.LANGUAGE);

        if (value != null) {
            setLanguageId(value.getLanguageId());
            setName(value.getName());
            setLastUpdate(value.getLastUpdate());
            resetChangedOnNotNull();
        }
    }
}
