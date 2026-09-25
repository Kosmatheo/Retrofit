package com.example.retrofitkosmy;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
    @SerializedName("tresc")
    public String tresc;
    @SerializedName("odp_a")
    public String odpA;
    @SerializedName("odp_b")
    public String odpB;
    @SerializedName("odp_c")
    public String odpC;
    public int odpowiedzPoprawna;

    public Pytanie(String tresc, String odpA, String odpB, String odpC, int odpowiedzPoprawna) {
        this.tresc = tresc;
        this.odpA = odpA;
        this.odpB = odpB;
        this.odpC = odpC;
        this.odpowiedzPoprawna = odpowiedzPoprawna;
    }
    //https://my-json-server.typicode.com/Kosmatheo/pytania_retrofit
}
