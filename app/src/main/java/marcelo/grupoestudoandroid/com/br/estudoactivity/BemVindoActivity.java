package marcelo.grupoestudoandroid.com.br.estudoactivity;

import android.os.Bundle;
import android.widget.TextView;

public class BemVindoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        Bundle args = getIntent().getExtras();

        TextView lblTextoBemVindo = (TextView) findViewById(R.id.lblTextoBemVindo);
        lblTextoBemVindo.setText(String.format(this.getString(R.string.msgBemVindo), args.get(this.getString(R.string.lblUsuario))));
    }
}
