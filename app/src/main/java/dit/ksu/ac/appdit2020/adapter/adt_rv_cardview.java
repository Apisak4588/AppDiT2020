package dit.ksu.ac.appdit2020.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dit.ksu.ac.appdit2020.R;
import dit.ksu.ac.appdit2020.model.Product;

public class adt_rv_cardview extends RecyclerView.Adapter<adt_rv_cardview.ViewHolder> {
    //ประกาศตัวแปร
    private List<Product> lst;
    private Context ctx;


    public adt_rv_cardview(){
        lst = new ArrayList<>();

        Product p = new Product();
       p.setFullname("aaaaa");
       p.setSchools("aaaaaa");
       p.setFacebook("aaaaaa");
       p.setPhone("aaaaaa");
        p.setCover(R.mipmap.pic1);
        lst.add(p);

        p = new Product();
        p.setFullname("bbbbbb");
        p.setSchools("bbbbb");
        p.setFacebook("bbbbb");
        p.setPhone("bbbbb");
        p.setCover(R.mipmap.pic2);
        lst.add(p);

        p = new Product();
        p.setFullname("ccccc");
        p.setSchools("ccccc");
        p.setFacebook("ccccc");
        p.setPhone("cccc");
        p.setCover(R.mipmap.pic3);
        lst.add(p);

        p = new Product();
        p.setFullname("ddddd");
        p.setSchools("dddddd");
        p.setFacebook("dddd");
        p.setPhone("dddd");
        p.setCover(R.mipmap.pic4);
        lst.add(p);
    }

    @NonNull
    @Override
    public adt_rv_cardview.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_card,parent,false);
        ctx = parent.getContext();
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull adt_rv_cardview.ViewHolder holder, final int position) {
        Product p = lst.get(position);
        holder.imgCover.setImageResource(p.getCover());
        holder.tvFullname.setText(p.getFullname());
        holder.tvSchools.setText(p.getSchools());
        holder.tvFacebook.setText(p.getFacebook());
        holder.tvPhone.setText(p.getPhone());
        holder.cvProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,lst.get(position).getFullname(),Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return lst.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cvProduct;
        private ImageView imgCover;
        private TextView tvFullname;
        private TextView tvSchools;
        private TextView tvFacebook;
        private TextView tvPhone;


        public ViewHolder(@NonNull View v) {
            super(v);
            cvProduct = v.findViewById(R.id.cvProduct);
            imgCover = v.findViewById(R.id.imgCover);
            tvFullname = v.findViewById(R.id.tvFullname);
            tvSchools = v.findViewById(R.id.tvSchools);
            tvFacebook = v.findViewById(R.id.tvFacebook);
            tvPhone = v.findViewById(R.id.tvPhone);


        }
    }


}
