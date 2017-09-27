package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {

    private EditText edtMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        EditText edtMessage = (EditText) findViewById(R.id.edtMessage);
    }

    public void getOnClick(View view) {
        switch (view.getId()) {
            case R.id.btnOK:
                //1. Recoger el mensaje
                //2. Crear un objeto Bundle y añadir el mensaje
                Bundle bundle = new Bundle();
                bundle.putString("message", edtMessage.getText().toString());
                //3. Crear un objeto Intent
                Intent intent = new Intent(, ViewMessageActivity.class);
                //4. Iniciar la Activity ViewMessage
                break;
        }
    }
}
