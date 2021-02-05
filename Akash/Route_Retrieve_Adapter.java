package com.example.goflight;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Route_Retrieve_Adapter extends RecyclerView.Adapter<Route_Retrieve_Adapter.myviewholder> {
    public Route_Retrieve_Adapter(Context context, List<RouteListRetrieve> list) {
        this.context = context;
        this.list = list;
    }

    private Context context;
private List<RouteListRetrieve> list;


    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_route,parent,false);
        return new Route_Retrieve_Adapter.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.routeid_tv.setText(list.get(position).getRouteid());
        holder.departure_tv.setText(list.get(position).getDeparturecity());
        holder.arrival_tv.setText(list.get(position).getArrivalcity());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{
        TextView routeid_tv,departure_tv,arrival_tv;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            routeid_tv=(TextView)itemView.findViewById(R.id.routeid_tv);
            departure_tv=(TextView)itemView.findViewById(R.id.departure_tv);
            arrival_tv=(TextView)itemView.findViewById(R.id.arrival_tv);
        }
    }
}
