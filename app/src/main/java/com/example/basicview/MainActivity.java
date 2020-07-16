package com.example.basicview;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    EditText editInfor, editEmail;
    CheckBox chkCoding, chkReading, chkTravelling;
    RadioButton rdMale, rdFemale;
    Spinner spinLang;
    Switch switchExpert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCancel = (Button) findViewById(R.id.btnca);
        Button btnInfo = (Button) findViewById(R.id.btnin);
        editInfor = (EditText) findViewById(R.id.textNa);
        editEmail = (EditText) findViewById(R.id.textEm);
        chkCoding = (CheckBox) findViewById(R.id.cboxcod);
        chkReading = (CheckBox) findViewById(R.id.cboxre);
        chkTravelling = (CheckBox) findViewById(R.id.cboxtra);
        rdMale = (RadioButton) findViewById(R.id.rdinam);
        rdFemale = (RadioButton) findViewById(R.id.rdinu);
        spinLang = (Spinner) findViewById(R.id.spin);
        switchExpert = (Switch) findViewById(R.id.swich);
    }

    public void cancel(View v) {
        System.exit(0);
    }

    public void onClick(View v) {
        String msg = "My name: " + editInfor.getText().toString() +
                System.getProperty("line.separator") +
                "Email: " + editEmail.getText().toString();
        msg += System.getProperty("line.separator") + "My hobbies: ";
        if (chkCoding.isChecked())
            msg += chkCoding.getText().toString() + ", ";
        if (chkReading.isChecked())
            msg += chkReading.getText().toString() + ", ";
        if (chkTravelling.isChecked())
            msg += chkTravelling.getText().toString() + ", ";
        msg += System.getProperty("line.separator") + "My Sex: ";
        if (rdFemale.isChecked())
            msg += rdFemale.getText().toString();
        if (rdMale.isChecked())
            msg += rdMale.getText().toString();
        msg += System.getProperty("line.separator") + "My language: " + spinLang.getSelectedItem().toString();
        msg += System.getProperty("line.separator") + "Do you have experience with Jave frameworks: ";
        if (switchExpert.isChecked())
            msg += "Yes";
        else
            msg += "No";
        info(v, msg);
        editInfor.setText("");
        editEmail.setText("");
        chkCoding.setChecked(false);
        chkReading.setChecked(false);
        chkTravelling.setChecked(false);
        rdFemale.setChecked(false);
        rdMale.setChecked(false);
    }
    public void info(View v, String msg){
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(msg);
        dlgAlert.setTitle("My First App");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }
}