package marcelo.grupoestudoandroid.com.br.estudoactivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
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

        this.edtUsuario.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (TextUtils.isEmpty(edtUsuario.getText().toString())) {
                    edtUsuario.setError(context.getString(R.string.msgCampoObrigatorio));
                }
            }
        });

        this.edtSenha.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (TextUtils.isEmpty(edtSenha.getText().toString())) {
                    edtSenha.setError(context.getString(R.string.msgCampoObrigatorio));
                }
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}
