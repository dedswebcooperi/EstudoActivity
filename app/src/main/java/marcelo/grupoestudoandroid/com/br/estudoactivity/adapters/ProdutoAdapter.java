package marcelo.grupoestudoandroid.com.br.estudoactivity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import marcelo.grupoestudoandroid.com.br.estudoactivity.Produto;
import marcelo.grupoestudoandroid.com.br.estudoactivity.R;

/**
 * Created by dragonjf on 26/06/16.
 */
public class ProdutoAdapter extends BaseAdapter {

    Context mContext;
    List<Produto> mProdutos;

    public ProdutoAdapter(Context context, List<Produto> produtos) {
        this.mContext = context;
        this.mProdutos = produtos;
    }

    @Override
    public int getCount() {
        return mProdutos.size();
    }

    @Override
    public Object getItem(int i) {
        return mProdutos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mProdutos.get(i).getIdProduto();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ProdutoItemView produtoItemView;

        if (view == null) {
            view = inflater.inflate(R.layout.produto_list_item, null);
            produtoItemView = new ProdutoItemView();
            produtoItemView.imgProdutoFoto = (ImageView) view.findViewById(R.id.imgProdutoFoto);
            produtoItemView.txtProdutoNome = (TextView) view.findViewById(R.id.txtProdutoNome);
            produtoItemView.txtProdutoUnidade = (TextView) view.findViewById(R.id.txtProdutoUnidade);

            view.setTag(produtoItemView);
        } else {
            produtoItemView = (ProdutoItemView) view.getTag();
        }

        Produto produto = mProdutos.get(i);

        produtoItemView.txtProdutoNome.setText(produto.getNomeStr());
        produtoItemView.txtProdutoUnidade.setText(produto.getUnidadeStr());
        produtoItemView.imgProdutoFoto.setImageResource(R.mipmap.ic_launcher);

        return view;
    }

    public static class ProdutoItemView {
        public TextView txtProdutoNome;
        public TextView txtProdutoUnidade;
        public ImageView imgProdutoFoto;
    }
}
