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

public class SearchSongAdapter extends RecyclerView.Adapter<SongSearchView> implements Filterable {
    public SearchSongAdapter(List<Song> songs) {
        this.songs = songs;
        this.songsFiltered=songs;
    }

    List<Song> songs;
    List<Song> songsFiltered;
    Context context;
    @NonNull
    @Override
    //To instantiate all_song layout file into the view
    public SongSearchView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View songView=inflater.inflate(R.layout.all_song,parent,false);
        SongSearchView viewHolder=new SongSearchView(songView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongSearchView holder, int position) {
        Song song=songsFiltered.get(position);
        TextView artist= holder.txtArtist;
        artist.setText(song.getArtist());
        TextView title= holder.txtTitle     ;
        title.setText(song.getTitle());
        ImageView coverArt= holder.imgSearchSong;
        coverArt.setImageResource(song.getDrawable());

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
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                songsFiltered= (List<Song>) filterResults.values;
                notifyDataSetChanged();

            }
        };
    }
}
