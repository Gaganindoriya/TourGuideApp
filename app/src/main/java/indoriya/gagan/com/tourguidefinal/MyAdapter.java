package indoriya.gagan.com.tourguidefinal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {
    Context context;
    ArrayList<MyItem> arrayList;


    public MyAdapter(@NonNull Context context,@NonNull ArrayList arrayLists) {
        super(context, 0, arrayLists);
        this.context=context;
        this.arrayList=arrayLists;
 }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        //inflating layout
        LayoutInflater inflater=LayoutInflater.from(context);

        if(view==null){
            view=inflater.inflate(R.layout.list_item,parent,false);
        }
        //initializing views
        TextView place=view.findViewById(R.id.place);
        TextView description=view.findViewById(R.id.description);
        ImageView image=view.findViewById(R.id.image);

        //setting resources
        MyItem item=arrayList.get(position);
        place.setText(item.getPlace());
        description.setText(item.getDescription());
        image.setImageResource(item.getImage());
         return view;
    }
}
