package indoriya.gagan.com.tourguidefinal.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import indoriya.gagan.com.tourguidefinal.MyAdapter;
import indoriya.gagan.com.tourguidefinal.MyAdapter2;
import indoriya.gagan.com.tourguidefinal.MyItem;
import indoriya.gagan.com.tourguidefinal.R;


public class Ghats extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    String name[];
    String description[];

    ArrayList<MyItem> arrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         name = getResources().getStringArray(R.array.gaht_name);
         description= getResources().getStringArray(R.array.gaht_description);
    }

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
        mRecyclerView = getActivity().findViewById(R.id.my_recycler_view_ghats);
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
    }

    private void loadData() {
        //Array List Of songs
        String name[] = getResources().getStringArray(R.array.gaht_name);
        String description[] = getResources().getStringArray(R.array.gaht_description);
        arrayList = new ArrayList<>();
        for(int i=0;i<name.length;i++){
            arrayList.add(new MyItem(name[i], description[i], R.drawable.ghats));
        }

        mAdapter = new MyAdapter2(getActivity(),arrayList);
        mRecyclerView.setAdapter(mAdapter);

    }
}