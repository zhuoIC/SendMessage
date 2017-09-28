package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Esta clase envía un mensaje de un usuario a otro
 * @author Nicolás Hernández Jiménez
 * <p>Conceptos aprendidos:</p>
 * <url>
 *     <li>Concepto Context</li>
 *     <li>Paso de parámetros mediante  el objeto @see android.os.Bundle</li>
 *     <li>Paso de mensajes entre dos actividades mediante la clase @see android.content.Intent</li>
 * </url>
 */

public class SendMessageActivity extends AppCompatActivity {

    private EditText edtMessage;
    private EditText edtUser;
    private Button btnButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        edtMessage = (EditText) findViewById(R.id.edtMessage);
        edtUser = (EditText) findViewById(R.id.edtUser);
        btnButton = (Button) findViewById(R.id.btnOK);
        // 1. Registrar un listener al evento OnClickListener
        btnButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //1. Recoger el mensaje
                //2. Crear un objeto Bundle y añadir el mensaje
                Bundle bundle = new Bundle();
                bundle.putString("message", edtMessage.getText().toString());
                bundle.putString("user", edtUser.getText().toString());
                //3. Crear un objeto Intent
                Intent intent = new Intent(SendMessageActivity.this, ViewMessageActivity.class);
                //4. Añadir el Bundle al Intent
                intent.putExtras(bundle);
                //5. Iniciar la Activity ViewMessage
                startActivity(intent);
            }
        });
        /*
        class MyListener implements View.OnClickListener{
            public void onClick(){

            }
        }*/


    /*public void getOnClick(View view) {
        switch (view.getId()) {
            case R.id.btnOK:
                //1. Recoger el mensaje
                //2. Crear un objeto Bundle y añadir el mensaje
                Bundle bundle = new Bundle();
                bundle.putString("message", edtMessage.getText().toString());
                bundle.putString("user", edtUser.getText().toString());
                //3. Crear un objeto Intent
                Intent intent = new Intent(SendMessageActivity.this, ViewMessageActivity.class);
                //4. Añadir el Bundle al Intent
                intent.putExtras(bundle);
                //5. Iniciar la Activity ViewMessage
                startActivity(intent);
                break;
        }*/
    }
}
