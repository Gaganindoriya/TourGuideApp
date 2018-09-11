package indoriya.gagan.com.tourguidefinal.fragments;

import android.content.Context;
import android.content.Intent;
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


public class Hotels extends Fragment {

    ListView lv;
    ArrayList<MyItem> arrayList;
    MyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotels, container, false);
    }


    //for initializing data
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        loadData();
    }

    private void initViews() {
        lv = getActivity().findViewById(R.id.mylistView_hotel);

    }

    private void loadData() {
        //Array List Of songs
        arrayList = new ArrayList<>();
        arrayList.add(new MyItem("Alpana Hotel", "Simple, chic hotel with free parking, a restaurant, an on-site generator & Puja services (fee). ...", R.drawable.hotel));
        arrayList.add(new MyItem("Lakshya's Hotel", "Relaxed contemporary accommodations, some with Jacuzzis, plus a stylish restaurant. ...", R.drawable.hotel));
        arrayList.add(new MyItem("Hotel Grand Shiva", "Unpretentious rooms & suites in a relaxed hotel with a cafe & an international restaurant. ...", R.drawable.hotel));
        arrayList.add(new MyItem("Hotel Suncity Haridwar", "Down-to-earth rooms & colourful suites in an informal hotel offering free parking & Wi-Fi....", R.drawable.hotel));
        arrayList.add(new MyItem("Classic Residency", "Upscale rooms & suites in an elegant lodging with a formal restaurant, an outdoor pool & a spa. ...", R.drawable.hotel));
        arrayList.add(new MyItem("Hotel Golden", "Unassuming rooms with cable TV in a casual budget hotel offering parking & 24-hour room service....", R.drawable.hotel));
        arrayList.add(new MyItem("Hotel Ganges Rivera", "Understated rooms with traditional Indian furnishings in a riverside hotel offering free breakfast. ...", R.drawable.hotel));
        arrayList.add(new MyItem("The Haveli Hari Ganga Hotel Haridwar", "Elegant hotel with posh rooms & suites, a vegetarian restaurant, a rooftop coffee shop & a spa....", R.drawable.hotel));


        adapter = new MyAdapter(getActivity(), arrayList);
        lv.setAdapter(adapter);
        }
}