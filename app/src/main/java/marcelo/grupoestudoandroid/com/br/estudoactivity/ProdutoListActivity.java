package marcelo.grupoestudoandroid.com.br.estudoactivity;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.security.Guard;
import java.util.ArrayList;
import java.util.List;

import marcelo.grupoestudoandroid.com.br.estudoactivity.adapters.ProdutoAdapter;

public class ProdutoListActivity extends AppCompatActivity {

    private static final String CAT_BEBIBAS = "Bebidas";
    private static final String CAT_HORTIFRUTI = "Hortifruti";
    private static final String CAT_CARNES = "Carnes";

    ListView lstProdutos;
    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto_list);
        lstProdutos = (ListView) this.findViewById(R.id.lstProdutos);
        lstProdutos.setAdapter(new ProdutoAdapter(this, populaListaProduto()));
        lstProdutos.setOnItemClickListener(onItemClickListener());
    }

    private ListView.OnItemClickListener onItemClickListener() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ProdutoAdapter.ProdutoItemView produtoItemView = (ProdutoAdapter.ProdutoItemView) view.getTag();
                showDialog(produtoItemView.txtProdutoNome.getText().toString() + " " + produtoItemView.txtProdutoUnidade.getText().toString());
            }
        };
    }

    private void showDialog (String conteudo) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.alertProdutoSelecionadoTitle));
        builder.setMessage(conteudo);
        builder.setPositiveButton(R.string.btnAlertOK, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialog.dismiss();
            }
        });

        dialog = builder.create();
        dialog.show();
    }

    private List<Produto> populaListaProduto() {
        List<Produto> produtos = new ArrayList<Produto>();

        Produto coca = new Produto();
        coca.setCategoria(CAT_BEBIBAS);
        coca.setNomeStr("Coca Cola");
        coca.setUnidadeStr("2 LT");
        coca.setIdProduto(1);
        produtos.add(coca);

        Produto guarana = new Produto();
        guarana.setCategoria(CAT_BEBIBAS);
        guarana.setNomeStr("Guaraná Antártica");
        guarana.setUnidadeStr("2 LT");
        guarana.setIdProduto(2);
        produtos.add(guarana);

        Produto laranja = new Produto();
        laranja.setCategoria(CAT_HORTIFRUTI);
        laranja.setNomeStr("Laranja");
        laranja.setUnidadeStr("1 KG");
        laranja.setIdProduto(3);
        produtos.add(laranja);

        Produto maca = new Produto();
        maca.setCategoria(CAT_HORTIFRUTI);
        maca.setNomeStr("Maçã Gala");
        maca.setUnidadeStr("1 KG");
        maca.setIdProduto(4);
        produtos.add(maca);

        Produto banana = new Produto();
        banana.setCategoria(CAT_HORTIFRUTI);
        banana.setNomeStr("Banana Nanica");
        banana.setUnidadeStr("1 KG");
        banana.setIdProduto(5);
        produtos.add(banana);

        Produto uva = new Produto();
        uva.setCategoria(CAT_HORTIFRUTI);
        uva.setNomeStr("Uva");
        uva.setUnidadeStr("1 KG");
        uva.setIdProduto(6);
        produtos.add(uva);

        Produto picanha = new Produto();
        picanha.setCategoria(CAT_CARNES);
        picanha.setNomeStr("Picanha");
        picanha.setUnidadeStr("1 KG");
        picanha.setIdProduto(7);
        produtos.add(picanha);

        Produto maminha = new Produto();
        maminha.setCategoria(CAT_CARNES);
        maminha.setNomeStr("Maminha");
        maminha.setUnidadeStr("1 KG");
        maminha.setIdProduto(8);
        produtos.add(maminha);

        Produto fraldinha = new Produto();
        fraldinha.setCategoria(CAT_CARNES);
        fraldinha.setNomeStr("Fraldinha");
        fraldinha.setUnidadeStr("1 KG");
        fraldinha.setIdProduto(9);
        produtos.add(fraldinha);

        return produtos;
    }
}
