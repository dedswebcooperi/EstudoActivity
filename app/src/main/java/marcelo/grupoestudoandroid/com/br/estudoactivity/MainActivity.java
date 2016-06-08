package marcelo.grupoestudoandroid.com.br.estudoactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {

    EditText edtUsuario = null;
    EditText edtSenha = null;
    Button btnEntrar = null;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        this.edtSenha = (EditText) findViewById(R.id.edtSenha);
        this.btnEntrar = (Button) findViewById(R.id.btnEntrar);

        this.edtUsuario.setOnFocusChangeListener(this.onFocusChangeCamposObrigatorios());
        this.edtSenha.setOnFocusChangeListener(this.onFocusChangeCamposObrigatorios());
        this.btnEntrar.setOnClickListener(this.onClickBtnEntrar());
    }

    public View.OnClickListener onClickBtnEntrar () {
        return new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (edtUsuario.getError() == null && edtSenha.getError() == null) {
                    Intent intent = new Intent(context, BemVindoActivity.class);
                    intent.putExtra(context.getString(R.string.lblUsuario), edtUsuario.getText().toString());
                    intent.putExtra(context.getString(R.string.lblSenha), edtSenha.getText().toString());
                    startActivity(intent);
                }
            }
        };
    }

    public View.OnFocusChangeListener onFocusChangeCamposObrigatorios() {
        return new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View view, boolean b) {
                EditText editText = (EditText) view;

                if (TextUtils.isEmpty(editText.getText().toString())) {
                    editText.setError(context.getString(R.string.msgCampoObrigatorio));
                }
            }
        };
    }




}
