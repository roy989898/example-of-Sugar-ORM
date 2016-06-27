package pom.poly.com.exampleofsugarorm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import pom.poly.com.exampleofsugarorm.Entity.BOOK;

/**
 * Created by User on 27/6/2016.
 */
public class CustomAdapter extends ArrayAdapter<BOOK> {

    private final Context mcontext;


    public CustomAdapter(Context context) {
        super(context, 0);
        mcontext = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;


        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mcontext);
            convertView = inflater.inflate(R.layout.listviewcell, null);
            holder = new ViewHolder();
            holder.title = (TextView) convertView.findViewById(R.id.tvTitle);
            holder.author = (TextView) convertView.findViewById(R.id.tvAuthor);

            convertView.setTag(holder);


        } else {

            holder = (ViewHolder) convertView.getTag();
        }

        //TODO set the content
        BOOK book = getItem(position);
        holder.title.setText(book.title);
        holder.author.setText(book.author);


        return convertView;

    }

    static class ViewHolder {

        TextView title;
        TextView author;

    }
}
