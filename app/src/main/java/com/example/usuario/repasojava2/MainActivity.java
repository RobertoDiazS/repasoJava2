package com.example.usuario.repasojava2;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Printer;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Dog currentDog;
    private int dogCount=0;

    private CoffeCups coffeCups=new CoffeCups();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //data type
        //tipos de datos basicos

        String pedrito = "juanito";
        String pedrito2 = "pedro";
        String texto = "123prueba";

        int a = 10;
        int b = 4;
        int result = 15;

        boolean validation = true;
        boolean binary = false;

        //variable: dato ingresado que puede ser numero, alfabetico o caracter
        // que ocupa espacio memoria en el pc, como la memoria ram.
        //tipo nombre=valor

        //texto y texto:etiqueta de registro y logeo?

        Log.d("TAG", "what i want to log");
        String myLogs = "myLogs";
        Log.d(myLogs, pedrito);
        Log.d(myLogs, pedrito + pedrito2);
        String pedroSum = pedrito + " " + pedrito2;
        Log.d(myLogs, pedroSum);
        String numberToText = pedrito + a;
        Log.d(myLogs, numberToText);
        theName();
        theName();

        String z=somebodyElseName();
        String y=String.valueOf(elseNameCount());

        oneParam(z);

        int sum = a + b;
        int div = a / b;
        //int rest=a-b; no se puede restar strings, solo sumarlos
        int modulus = a % b;

        Dog firulais=new Dog();
        Dog Beethoven=new Dog(true);
        Cat Misifuz=new Cat();
        Cat Melody=new Cat(false);
        Dog kiltro=new Dog(3, false);

        Dog mozart=new Dog();
        mozart.setLegs(4);
        mozart.setHasOwner(true);

        Dog fido=new Dog(true);
        fido.setName("FIDO");
        Log.d("DOGS_NAME", fido.getName());

        new Dog(3,false).setName("Lucky");

        currentDog =new Dog();

        dogCount=2;

        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sugar=coffeCups.getSugar();
                coffeCups.setSugar(sugar+1);
                String currentSugar= String.valueOf(coffeCups.getSugar());

            }
        });

    }
    private void theName() {
    }
    private void someName() {
    }
    public void otherName(){
        Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show();
    }
    private String myName() {
        String myName = "Roberto Diaz";
        return myName;
    }
    private String myNamePlusSomething(){
        String pedro=myName()+" something";
        return myName();
    }
    private String somebodyElseName(){
        String charles="charles";
        return charles;
    }
    private int elseNameCount(){
        int count=somebodyElseName().length();
        return count;
    }

    private int onePlusOne(){
        int one=1+1;
        return one;
    }
    private void oneParam(String z){
        Toast.makeText(this, z, Toast.LENGTH_SHORT).show();
        Log.d(z,z);
        String msgPlus=msg+" something";

    }
    private int sum(int a, int b){
        int sum=a+b;
        currentDog =new Dog(true);
        dogCount=3;
        return sum;
    }

    private class LENGHT_SHORT {
    }
}




