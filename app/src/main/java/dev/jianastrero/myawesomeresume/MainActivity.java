package dev.jianastrero.myawesomeresume;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.jianastrero.myawesomeresume.adapter.MyAdapter;
import dev.jianastrero.myawesomeresume.model.Pokemon;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;
    MyAdapter myAdapter;

    List<Pokemon> pokemonList = List.of(
            new Pokemon("Bulbasaur", R.drawable.charizard),
            new Pokemon("Charmander", R.drawable.settings_ic_edit),
            new Pokemon("Squirtle", R.drawable.charizard),
            new Pokemon("Pikachu", R.drawable.settings_ic_edit),
            new Pokemon("Eevee", R.drawable.charizard),
            new Pokemon("Jigglypuff", R.drawable.settings_ic_edit),
            new Pokemon("Meowth", R.drawable.charizard),
            new Pokemon("Psyduck", R.drawable.settings_ic_edit),
            new Pokemon("Snorlax", R.drawable.charizard),
            new Pokemon("Mewtwo", R.drawable.settings_ic_edit),
            new Pokemon("Bulbasaur", R.drawable.charizard),
            new Pokemon("Charmander", R.drawable.settings_ic_edit),
            new Pokemon("Squirtle", R.drawable.charizard),
            new Pokemon("Pikachu", R.drawable.settings_ic_edit),
            new Pokemon("Eevee", R.drawable.charizard),
            new Pokemon("Jigglypuff", R.drawable.settings_ic_edit),
            new Pokemon("Meowth", R.drawable.charizard),
            new Pokemon("Psyduck", R.drawable.settings_ic_edit),
            new Pokemon("Snorlax", R.drawable.charizard),
            new Pokemon("Mewtwo", R.drawable.settings_ic_edit),
            new Pokemon("Bulbasaur", R.drawable.charizard),
            new Pokemon("Charmander", R.drawable.settings_ic_edit),
            new Pokemon("Squirtle", R.drawable.charizard),
            new Pokemon("Pikachu", R.drawable.settings_ic_edit),
            new Pokemon("Eevee", R.drawable.charizard),
            new Pokemon("Jigglypuff", R.drawable.settings_ic_edit),
            new Pokemon("Meowth", R.drawable.charizard),
            new Pokemon("Psyduck", R.drawable.settings_ic_edit),
            new Pokemon("Snorlax", R.drawable.charizard),
            new Pokemon("Mewtwo", R.drawable.settings_ic_edit)
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        myRecyclerView = findViewById(R.id.myRecyclerView);
        myAdapter = new MyAdapter(pokemonList);

        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myRecyclerView.setAdapter(myAdapter);

    }
}
