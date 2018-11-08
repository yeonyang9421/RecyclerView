package kr.co.woobi.imyeon.recyclerview;

import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyRecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    int images[]={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4};
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_item,viewGroup,false);
        return new RowCell(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((RowCell)viewHolder).imageView.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    private static class RowCell extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public RowCell(View view) {
            super(view);
            imageView=(ImageView)view.findViewById(R.id.recyclerView);
        }
    }
}
