package dev.jianastrero.myawesomeresume;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.gson.Gson;

import dev.jianastrero.myawesomeresume.model.Pokemon;
import dev.jianastrero.myawesomeresume.sp.AppSharedPreferences;
import dev.jianastrero.myawesomeresume.util.AssetUtil;

public class MainActivity extends AppCompatActivity {

    private AppSharedPreferences appSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0);
            return insets;
        });

        appSharedPreferences = new AppSharedPreferences(this);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Pokemon List");

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavController navController = navHostFragment.getNavController();

        NavigationUI.setupWithNavController(bottomNavigationView, navController);

//        Log.d("JIANDDEBUG", "Is Logged In: " + appSharedPreferences.getIsLoggedIn());
//        Log.d("JIANDDEBUG", "Primary Color" + appSharedPreferences.getPrimaryColor());

        parseJson();
    }

    @Override
    public boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().onBackPressed();
        return true;
    }

    private void parseJson() {
        String pokemonJson = AssetUtil.getJson(this, "bulbasaur.json");
        Log.d("JIANDDEBUG", "Json: " + pokemonJson);
        Gson gson = new Gson();
        Pokemon pokemon = gson.fromJson(pokemonJson, Pokemon.class);
        Log.d("JIANDDEBUG", "Pokemon: " + pokemon.name.english);
        /*
        Pokemon: Bulbasaur
         */
        /*
        Pokemon: Bulbasaur
         */
    }
}
