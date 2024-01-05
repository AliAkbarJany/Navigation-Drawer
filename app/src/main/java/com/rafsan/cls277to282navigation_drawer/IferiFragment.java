package com.rafsan.cls277to282navigation_drawer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class IferiFragment extends Fragment {

    WebView iferiWebView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View myView = inflater.inflate(R.layout.fragment_iferi, container, false);

        iferiWebView = myView.findViewById(R.id.iferiWebView);

        iferiWebView.getSettings().setJavaScriptEnabled(true);
        iferiWebView.loadUrl("https://www.iferi.com/");

        if (container != null){
            container.removeAllViews();
        }
        return myView;
    }
}