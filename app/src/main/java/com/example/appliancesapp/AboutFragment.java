package com.example.appliancesapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        // Find the TextView by its ID
        TextView textView = view.findViewById(R.id.textView7);

        // Set the text programmatically
        String paragraphText = "Home decor appliances are essential elements in creating a welcoming and aesthetically pleasing living space. Refrigerators, washers, dryers, and cooktops are integral components of modern households, each serving a unique role in simplifying our daily routines. The refrigerator, often considered the heart of the kitchen, keeps our food fresh and beverages cool, ensuring we have nourishing meals readily available. Washers and dryers are essential for laundry tasks, providing the convenience of clean clothes without the hassle of manual washing and drying. These appliances not only save time but also enhance personal hygiene. On the other hand, cooktops, whether gas or electric, empower us to prepare delicious meals efficiently, with precise temperature control and various cooking options. Together, these appliances are the backbone of a well-functioning home, making daily chores more manageable and allowing us to lead comfortable lives.";
        textView.setText(paragraphText);

        return view;
    }
}
