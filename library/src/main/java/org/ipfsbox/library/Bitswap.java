package org.ipfsbox.library;

import org.ipfsbox.library.entity.Bitswap_stat;
import org.ipfsbox.library.service.CommandService;

import retrofit2.Call;
import retrofit2.Retrofit;

public class Bitswap {
    Retrofit retrofit;

    public Bitswap(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public void ledger() {

    }

    public void reprovide() {

    }
    public void stat(retrofit2.Callback<Bitswap_stat> callback) {
        CommandService.bitswap commandService = retrofit.create(CommandService.bitswap.class);
        Call<Bitswap_stat> bitswap_statCall = commandService.stat();
        bitswap_statCall.enqueue(callback);

    }
    public void unwant() {

    }
    public void wantlist() {

    }
}
