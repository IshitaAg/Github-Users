package com.example.mvpapp.views;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mvpapp.R;
import com.example.mvpapp.models.user;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    List<user> flist;
    public Adapter(Context mcontext,List<user> glist) {
       context=mcontext;
       flist=glist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
            viewHolder.textview.setText(flist.get(i).getUserName());
            viewHolder.parent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent =new Intent(context,UserInfoView.class);
                    intent.putExtra("loginval",flist.get(i).getUserName());
                    context.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return flist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  {
   TextView textview;
   ConstraintLayout parent;
      public ViewHolder(@NonNull View itemView) {
          super(itemView);
          textview=itemView.findViewById(R.id.textView);
          parent=itemView.findViewById(R.id.parent);
      }
    }
}
