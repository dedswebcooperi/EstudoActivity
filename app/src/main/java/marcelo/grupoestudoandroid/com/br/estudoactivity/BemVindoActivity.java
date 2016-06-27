package marcelo.grupoestudoandroid.com.br.estudoactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BemVindoActivity extends BaseActivity {

    private static final int REQUEST_CODE = 1;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        Bundle args = getIntent().getExtras();

        TextView lblTextoBemVindo = (TextView) this.findViewById(R.id.lblTextoBemVindo);
        lblTextoBemVindo.setText(String.format(this.getString(R.string.msgBemVindo), args.get(this.getString(R.string.lblUsuario))));

        Button btnAbrirActivity = (Button) this.findViewById(R.id.btnAbrirActivity);
        btnAbrirActivity.setOnClickListener(this.onClickBtnAbrirActivity());

        Button btnAbrirActivityF = (Button) this.findViewById(R.id.btnAbrirActivityF);
        btnAbrirActivityF.setOnClickListener(this.onClickBtnAbrirActivity());

        Button btnAbrirListView = (Button) this.findViewById(R.id.btnAbrirListView);
        btnAbrirListView.setOnClickListener(this.onClickBtnAbrirActivity());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            Toast.makeText(context, data.getStringExtra("result"), Toast.LENGTH_LONG).show();
        }
    }

    private View.OnClickListener onClickBtnAbrirActivity() {
        return new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent;
                Button btnView = (Button) view;

                if (btnView.getText().toString().equals(context.getString(R.string.btnAbrirActivity))) {
                    intent = new Intent(context, ResultadoActivity.class);
                    startActivityForResult(intent, REQUEST_CODE);
                    return;
                } else if (btnView.getText().toString().equals(context.getString(R.string.btnAbrirActivityF))) {
                    intent = new Intent(context, FrankActivity.class);
                } else {
                    intent = new Intent(context, ProdutoListActivity.class);
                }

                startActivity(intent);
            }
        };
    }
}
