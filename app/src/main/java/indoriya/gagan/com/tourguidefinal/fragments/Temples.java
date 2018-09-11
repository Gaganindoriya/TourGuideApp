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


public class Temples extends Fragment {

    ListView lv;
    ArrayList<MyItem> arrayList;
    MyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_temples, container, false);
    }


    //for initializing data
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        loadData();
    }

    private void initViews() {
        lv = getActivity().findViewById(R.id.mylistView_temples);

    }

    private void loadData() {
        //Array List Of songs
        arrayList = new ArrayList<>();
        arrayList.add(new MyItem(" Mansa Devi ", "Perched on a hilltop, this ancient Hindu temple honors Mansa Devi, the folk goddess of snakes.", R.drawable.haridwar));
        arrayList.add(new MyItem("Chandi Devi Temple", "Historic Hindu temple accessible by cable car offering picturesque mountaintop views.", R.drawable.haridwar));
        arrayList.add(new MyItem("Shri Maya Devi Mandir", "Sacred Hindu sanctuary featuring colorful statues, dedicated to the Goddess Maya", R.drawable.haridwar));
        arrayList.add(new MyItem("Bharat Mata Mandir", "This Hindu shrine dedicated to the goddess symbolizing India has a map of the undivided country.", R.drawable.haridwar));
        arrayList.add(new MyItem("Har Ki Pauri", "Har Ki Pauri is a famous ghat on the banks of the Ganges in Haridwar in the Indian state of Uttarakhand", R.drawable.haridwar));
        arrayList.add(new MyItem("Bilkeshwar Mahadev ", "Compact, remote temple dedicated to Lord Shiva & featuring smaller temples to other gods.", R.drawable.haridwar));
        arrayList.add(new MyItem("Vaishno Devi Mandir", "Replica of the Vaishno Devi Temple in Jammu & Kashmir, with caves & tunnels leading to the shrine.", R.drawable.haridwar));
        arrayList.add(new MyItem("ISKCON Haridwar", "N/A", R.drawable.haridwar));


        adapter = new MyAdapter(getActivity(), arrayList);
        lv.setAdapter(adapter);

    }
}