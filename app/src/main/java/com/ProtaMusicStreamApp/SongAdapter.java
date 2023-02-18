package com.ProtaMusicStreamApp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<MyView> implements Filterable {
    //create constructor of  List<Song> songs
    public SongAdapter(List<Song> songs) {

        this.songs = songs;
        this.songsFiltered=songs;
    }
    List<Song> songs;
    List<Song> songsFiltered;
    Context context;
    @NonNull
    @Override
    //To instantiate item_song layout file into the view
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View songView=inflater.inflate(R.layout.item_song,parent,false);
        MyView viewHolder=new MyView(songView);
        return viewHolder; }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
        Song song=songsFiltered.get(position);
        TextView artist= holder.txtPlaylistArtist;
        artist.setText(song.getArtist());
        TextView title= holder.txtPlaylistTitle     ;
        title.setText(song.getTitle());
        ImageView coverArt= holder.imgAddPlaylist;
        coverArt.setImageResource(song.getDrawable());
        holder.removePlaylistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreatePlaylist.favList.remove(position);
                notifyDataSetChanged();}
        });
    }
    @Override
    public int getItemCount() {
        return songsFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            //To filter the recycleView matching with user input and the title of the song
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString=charSequence.toString();
                if(charString.isEmpty()){
                    songsFiltered=songs;
                }else {
                    List<Song> filteredList= new ArrayList<Song>();
                    for (int i = 0; i < songs.size(); i++) {
                        if (songs.get(i).getTitle().toLowerCase().contains(charString.toLowerCase())){
                            filteredList.add(songs.get(i));
                        }
                    }
                    songsFiltered=filteredList;
                }
                FilterResults filterResults=new FilterResults();
                filterResults.values=songsFiltered;
                return filterResults; }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                songsFiltered= (List<Song>) filterResults.values;
                notifyDataSetChanged();

            }
        };
    }
}
