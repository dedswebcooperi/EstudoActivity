package marcelo.grupoestudoandroid.com.br.estudoactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by frdn on 21/06/2016.
 */
public class FrankActivity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frank);

        Button btnFecharActivity = (Button) this.findViewById(R.id.btnFecharActivityF);
        btnFecharActivity.setOnClickListener(this.onClickBtnFechar());

       android.support.v7.app.ActionBar ab = getSupportActionBar();
       ab.setDisplayHomeAsUpEnabled(true); // Transforma o titulo da Action Bar em um botão
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

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return(true);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
//            case android.R.id.home:
//                //Toast.makeText(this, "Cliquei no botão Logo", Toast.LENGTH_SHORT).show();
//                finish();
//                return true;
            case R.id.item1:
                Toast.makeText(this, "Item " + (item.getItemId() + 1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this, "Item " + (item.getItemId() + 1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this, "Item " + (item.getItemId() + 1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(this, "Item " + (item.getItemId() + 1), Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
