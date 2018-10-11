
package com.example.android.bookstore.data;

import android.provider.BaseColumns;

// To prevent someone from accidentally instantiating the contract class,
// give it an empty constructor.
public final class BookContract {

    private BookContract() {
    }

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class BookEntry implements BaseColumns {

        public static final String TABLE_NAME = "books";

        public static final String _ID = BaseColumns._ID;

        public static final String COLUMN_PRODUCT_NAME = "title";
        public static final String COLUMN_PRODUCT_PRICE = "price";
        public static final String COLUMN_PRODUCT_QUANTITY = "quantity";
        public static final String COLUMN_PRODUCT_SUPPLIER_NAME = "suppliername";
        public static final String COLUMN_PRODUCT_PHONE = "supplierphone";
    }
}

