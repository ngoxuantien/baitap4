package com.example.baitap4.Fragment;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baitap4.Adapter.MessageAdapter;
import com.example.baitap4.R;
import com.example.baitap4.model.message;

import java.util.ArrayList;
import java.util.List;

public class TinnhanFragment extends Fragment {
    ImageView imageView;
    View view;
    PopupMenu popupMenu;
    EditText search;
    MessageAdapter messageAdapter;
    RecyclerView recyclerView;
    List<message> messageList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tinnhan, container, false);
        imageView = view.findViewById(R.id.menu);
        search = view.findViewById(R.id.search);
        setonClick();
        messageList= new ArrayList<>();
        messageList.add(new message(R.drawable.ic_nhatky,"j","k","hgh"));
        messageList.add(new message(R.drawable.ic_nhatky,"j1","k","hgh"));
        messageList.add(new message(R.drawable.ic_nhatky,"j3","k","hgh"));
        messageList.add(new message(R.drawable.ic_nhatky,"j4","k","hgh"));
        messageList.add(new message(R.drawable.ic_nhatky,"j5","k","hgh"));
        messageList.add(new message(R.drawable.ic_nhatky,"j6","k","hgh"));

                setadapter();

        popupMenu = new PopupMenu(view.getContext(), imageView);/// tạo menu
        popupMenu.getMenuInflater().inflate(R.menu.menu34, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {

                return true;
            }
        });

        setclikimage();
        return view;
    }

    private void setadapter() {
        recyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        messageAdapter= new MessageAdapter(view.getContext(),messageList);
        recyclerView.setAdapter(messageAdapter);
    }

    private void setonClick() {
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search.setBackground(getResources().getDrawable(R.drawable.backgrowedit));/// cách set backgrow ở ngoài
            }
        });
    }

    private void setclikimage() {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenu.show();
            }
        });
    }


}
