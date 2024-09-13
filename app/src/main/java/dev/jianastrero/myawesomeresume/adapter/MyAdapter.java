package dev.jianastrero.myawesomeresume.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

import dev.jianastrero.myawesomeresume.R;
import dev.jianastrero.myawesomeresume.model.Pokemon;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Pokemon> pokemonList;

    public MyAdapter(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_pokemon, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(holder.getAdapterPosition());

        ImageView ivPokemon = holder.itemView.findViewById(R.id.ivPokemon);
        TextView tvPokemon = holder.itemView.findViewById(R.id.tvPokemon);
        ivPokemon.setImageResource(pokemon.getImageResId());
        tvPokemon.setText(pokemon.getName());
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivPokemon;
        TextView tvPokemon;

        public MyViewHolder(View itemView) {
            super(itemView);
            ivPokemon = itemView.findViewById(R.id.ivPokemon);
            tvPokemon = itemView.findViewById(R.id.tvPokemon);
        }

        public void bind(Pokemon pokemon) {
            ivPokemon.setImageResource(pokemon.getImageResId());
            tvPokemon.setText(pokemon.getName());
        }
    }
}
