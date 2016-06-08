package marcelo.grupoestudoandroid.com.br.estudoactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class ResultadoActivity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Button btnFecharActivity = (Button) this.findViewById(R.id.btnFecharActivity);
        btnFecharActivity.setOnClickListener(this.onClickBtnFechar());
    }

    public View.OnClickListener onClickBtnFechar () {
        return new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("result", context.getString(R.string.msgActivityFechada));
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        };
    }
}
