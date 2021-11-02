package com.example.restapi3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import org.jetbrains.annotations.NotNull;

public class ProfileFragment extends Fragment {

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @org.jetbrains.annotations.NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
         return inflater.inflate(R.layout.fragment_profile, container,false);
    }

    public static String Base_URL2 = "https://github.com/Sirius-aa7";

    private static Retrofit retrofit;
    public static Retrofit getClient2(){
        if (retrofit==null) {
            retrofit = new Retrofit.Builder().baseUrl(Base_URL2).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
