package com.example.onveutlamoyenneaumoins.presentation.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onveutlamoyenneaumoins.Constants;
import com.example.onveutlamoyenneaumoins.R;
import com.example.onveutlamoyenneaumoins.Singletons;
import com.example.onveutlamoyenneaumoins.presentation.controller.MainController;
import com.example.onveutlamoyenneaumoins.presentation.model.Pokemon;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    private TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        txtDetail = findViewById(R.id.detail_txt);
        Intent intent = getIntent();
        String pokemonJson = intent.getStringExtra(Constants.POKEMON_KEY);
        Pokemon pokemon = Singletons.getGson().fromJson(pokemonJson, Pokemon.class);

        showDetail(pokemon);

    }

    private void showDetail(Pokemon pokemon) {
        txtDetail.setText(pokemon.getName());
    }

}