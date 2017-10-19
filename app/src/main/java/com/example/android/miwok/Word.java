package com.example.android.miwok;

import android.content.Context;

/**
 * Created by carlos on 10/18/17.
 * Contains a pair of Strings: one displaying Miwok text, the other displaying the default translation (English)
 */

public class Word {

    // Private Miwok String value
    private String mMiwokTranslation;

    // Private default String value
    private String mDefaultTranslation;

    // Context of the app
    private Context mContext;

    /**
     * Constructs a new Word object with initial values for Miwok and default translations
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    // Setter methods:

    /**
     * Gets the Miwok translation
     *
     * @return current Miwok translation in the object
     */

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Sets the Miwok translation
     */
    public void setMiwokTranslation(String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
    }

    // Getter methods

    /**
     * Gets the Miwok translation
     *
     * @return current Miwok translation in the object
     */

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Sets the default translation
     */
    public void setDefaultTranslation(String defaultTranslation) {
        mDefaultTranslation = defaultTranslation;
    }
}
