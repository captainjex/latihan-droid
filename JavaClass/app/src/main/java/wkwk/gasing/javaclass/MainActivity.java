package wkwk.gasing.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String showString;
    public TextView showText;
    public Barang [] arrBarang = new Barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showText = (TextView)findViewById(R.id.show_text);
        showString = "Manipulasi sting java android";
        addSeparator();
        initBarang();
        showText.setText(showString);

    }

    private void addSeparator(){
        showString += "\n============\n";
    }

    public void initBarang(){
        arrBarang[0] = new Barang("Hape", 1, 5000);

    }
}
