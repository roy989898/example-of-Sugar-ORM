package pom.poly.com.exampleofsugarorm;

import com.orm.SugarApp;

import pom.poly.com.exampleofsugarorm.Entity.BOOK;

/**
 * Created by User on 27/6/2016.
 */
public class App extends SugarApp {
    @Override
    public void onCreate() {
        super.onCreate();

//        BOOK.findById(BOOK.class, (long) 1);
    }
}
