package com.example.retrofitkosmy;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONFolderApi {
    @GET
    public Call<ArrayList<Pytanie>> getPytania();
}
