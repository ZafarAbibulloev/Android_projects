package tj.example.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.RecViewHolder> {

    String [] string = {"1","2", "3","4","5", "6","7", "8","9", "10","11", "12"};


    @Override
    public RecViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recintarface,parent,false);
        return new RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecViewHolder holder, int position) {
        holder.textView.setText(string[position]);
    }

    @Override
    public int getItemCount() {

        return string.length;
    }


    public class RecViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        public RecViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.TextView);
        }
    }
}
