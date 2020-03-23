import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.DesignPattern.R;

import com.example.designpattern.Adapter.AdapterMain;
import com.example.designpattern.Builder.MainBuilderActivity;
import com.example.designpattern.FactoryMethod.MainFactoryMethodActivity;
import com.example.designpattern.ProtoType.MainPrototype;
import com.example.designpattern.SimpleFactory.Main_SimpleFactory;
import com.example.designpattern.Singleton.SingletonMain;

public class MainActivity extends AppCompatActivity {

    Button btnSimpleFactory;
    Button btnFactoryMethod;
    Button btnSingleton;
    Button btnBuilder;
    Button btnPrototype;
    Button btnAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();


    }

    private void initView() {
        btnSimpleFactory = findViewById(R.id.btn_simple_factory);
        btnFactoryMethod = findViewById(R.id.btn_factory_method);
        btnBuilder = findViewById(R.id.btn_builder);
        btnSingleton = findViewById(R.id.btn_singleton);
        btnPrototype = findViewById(R.id.btn_prototype);
        btnAdapter = findViewById(R.id.btn_adapter);


    }

    private void initEvent() {
        btnSimpleFactory.setOnClickListener(v ->
                startActivity(new Intent(this, Main_SimpleFactory.class))
        );

        btnFactoryMethod.setOnClickListener(v -> {
            startActivity(new Intent(this, MainFactoryMethodActivity.class));
        });

        btnSingleton.setOnClickListener(v ->
                startActivity(new Intent(this, SingletonMain.class)));

        btnBuilder.setOnClickListener(v ->
                startActivity(new Intent(this, MainBuilderActivity.class)));

        btnPrototype.setOnClickListener(v -> {
            startActivity(new Intent(this , MainPrototype.class));
        });

        btnAdapter.setOnClickListener(v -> {
            startActivity(new Intent(this , AdapterMain.class));
        });
    }
}
