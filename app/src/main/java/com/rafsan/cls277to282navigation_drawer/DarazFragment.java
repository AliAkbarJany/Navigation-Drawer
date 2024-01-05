package com.rafsan.cls277to282navigation_drawer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class DarazFragment extends Fragment {

    WebView darazWebView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View myView = inflater.inflate(R.layout.fragment_daraz, container, false);

        darazWebView = myView.findViewById(R.id.darazWebView);

        darazWebView.getSettings().setJavaScriptEnabled(true);
        darazWebView.loadUrl("https://www.daraz.com.bd/");

        if (container != null){
            container.removeAllViews();
        }

        return myView;
    }
}