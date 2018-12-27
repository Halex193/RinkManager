package com.example.halex.rinkmanager.adapters;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.halex.rinkmanager.R;
import com.example.halex.rinkmanager.model.Rink;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RinkAdapter extends RecyclerView.Adapter<RinkAdapter.RinkViewHolder>
{
    private List<Rink> mRinkList;

    public RinkAdapter(List<Rink> rinkList)
    {
        mRinkList = rinkList;
    }

    @NonNull
    @Override
    public RinkViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_rink, viewGroup, false);
        return new RinkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RinkViewHolder rinkViewHolder, int i)
    {
        rinkViewHolder.bind(mRinkList.get(i));
    }

    @Override
    public int getItemCount()
    {
        return mRinkList.size();
    }

    public class RinkViewHolder extends RecyclerView.ViewHolder
    {
        private TextView location;
        private TextView companyName;
        private TextView schedule;
        private TextView price;
        private ImageView mImageView;

        public RinkViewHolder(@NonNull View itemView)
        {
            super(itemView);
            location = (TextView) itemView.findViewById(R.id.tv_location);
            companyName = (TextView) itemView.findViewById(R.id.tv_company_name);
            schedule = (TextView) itemView.findViewById(R.id.tv_schedule);
            price = (TextView) itemView.findViewById(R.id.tv_price);
            mImageView = (ImageView) itemView.findViewById(R.id.image);
        }

        public void bind(Rink rink)
        {
            location.setText(rink.getLocation());
            companyName.setText(rink.getCompanyName());
            schedule.setText(rink.getSchedule());
            price.setText(rink.getPrice());
            Picasso.get().load(rink.getImageURL()).into(mImageView);
        }
    }
}
