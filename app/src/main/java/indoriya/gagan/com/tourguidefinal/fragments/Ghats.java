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


public class Ghats extends Fragment {

    ListView lv;
    ArrayList<MyItem> arrayList;
    MyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ghats, container, false);
    }


    //for initializing data
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        loadData();
    }

    private void initViews() {
        lv = getActivity().findViewById(R.id.mylistView_ghats);

    }
    private void loadData() {
        //Array List Of songs
        arrayList = new ArrayList<>();
        arrayList.add(new MyItem("VIP Ghat - Haridwar", "Haridwar - Dehradun Rd, Har Ki Pauri, Haridwar, Uttarakhand 249401", R.drawable.ghats));
        arrayList.add(new MyItem("Ganga Ghat", "Mayapur, Haridwar, Uttarakhand 249408", R.drawable.ghats));
        arrayList.add(new MyItem("Vishwakarma Ghat", " Roorkee - Haridwar Rd, Gyan Lok Colony, Kankhal, Haridwar, Uttarakhand 249410", R.drawable.ghats));
        arrayList.add(new MyItem("Har Ki Pauri", "Har Ki Pauri is a famous ghat on the banks of the Ganges in Haridwar in the Indian state of Uttarakhand. This revered place is the major landmark of the holy city of Haridwar", R.drawable.ghats));
        arrayList.add(new MyItem("haridwar ghat", "Rodi Belwala, Birla Ghat, Haridwar, Uttarakhand 249401", R.drawable.ghats));
        arrayList.add(new MyItem("Kusha Ghat", "Kusha Ghat, Haridwar, Uttarakhand 249401", R.drawable.ghats));
        arrayList.add(new MyItem("Birla Ghat", " Birla Ghat, Haridwar, Uttarakhand 249401", R.drawable.ghats));
        arrayList.add(new MyItem("Sarvanand Ghat", " Bhagirathi Nagar, Bhoopatwala, Haridwar, Uttarakhand 249411", R.drawable.ghats));

        //creating adapter instance
        adapter = new MyAdapter(getActivity(), arrayList);
        //setting adabpter to listview
        lv.setAdapter(adapter);

    }
}