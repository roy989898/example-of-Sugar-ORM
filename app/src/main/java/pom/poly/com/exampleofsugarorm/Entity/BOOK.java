package pom.poly.com.exampleofsugarorm.Entity;

import com.orm.SugarRecord;

/**
 * Created by User on 27/6/2016.
 */
public class BOOK extends SugarRecord {
    public String title;
    public String author;

    public BOOK() {
    }

    public BOOK(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
