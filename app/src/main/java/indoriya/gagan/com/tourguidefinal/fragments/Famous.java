package indoriya.gagan.com.tourguidefinal.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import indoriya.gagan.com.tourguidefinal.MyAdapter;
import indoriya.gagan.com.tourguidefinal.MyItem;
import indoriya.gagan.com.tourguidefinal.R;


public class Famous extends Fragment {
    ListView lv;
    ArrayList<MyItem> arrayList;
    MyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_famous, container, false);
    }
    //for initializing data
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        loadData();
    }
    private void initViews() {
        lv = getActivity().findViewById(R.id.mylistView_famous);

    }

    private void loadData() {
        //Array List Of songs
        arrayList = new ArrayList<>();
        arrayList.add(new MyItem("Fun N Food Restaurant", "NH 58, Vivek Vihar Colony, Devpura, Opp Indane oil petrol pump, Haridwar, Uttarakhand 249410", R.drawable.place));
        arrayList.add(new MyItem("Sati Kund Mandir", "Sarva Priya Vihar Colony, Jagjeetpur, Haridwar, Uttarakhand 249404", R.drawable.place));
        arrayList.add(new MyItem("Hoshiyarpuri", "Upper Road, Haridwar, Uttarakhand 249401", R.drawable.place));
        arrayList.add(new MyItem("Goel Sweet Haridwar", "Kankhal-Jwalapur Rd, Abhisek Nagar, Jagjeetpur, Haridwar, Uttarakhand 249404", R.drawable.place));
        arrayList.add(new MyItem("Big Ben Restraunt", " Haridwar Main Road, Devpura, Opp.Railway Roag, Haridwar, Uttarakhand 249401", R.drawable.place));
        arrayList.add(new MyItem("Invitation Restaurant", "Haridwar Main Road, Ranipur, More, Govindpuri, Haridwar, Uttarakhand 249401", R.drawable.place));
        arrayList.add(new MyItem("Big Ben Restaurant", "Har Ki Pauri, Haridwar, Uttarakhand 249401", R.drawable.place));
        arrayList.add(new MyItem("Mohan Ji Puri Wale", "Near Police Chowki, Har Ki Pauri, Haridwar, Uttarakhand 249410", R.drawable.place));


        adapter = new MyAdapter(getActivity(), arrayList);
        lv.setAdapter(adapter);

    }
}