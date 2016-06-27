package pom.poly.com.exampleofsugarorm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pom.poly.com.exampleofsugarorm.Entity.BOOK;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edTitle)
    EditText edTitle;
    @BindView(R.id.edAuthor)
    EditText edAuthor;
    @BindView(R.id.btSave)
    Button btSave;
    @BindView(R.id.lvBook)
    ListView lvBook;
    private List<BOOK> bookList;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        adapter = new CustomAdapter(MainActivity.this);
        lvBook.setAdapter(adapter);


    }

    @OnClick(R.id.btSave)
    public void onClick() {
        BOOK book = new BOOK(edTitle.getText().toString(), edAuthor.getText().toString());
        book.save();

        bookList = BOOK.listAll(BOOK.class);
        adapter.clear();
        adapter.addAll(bookList);
    }
}
