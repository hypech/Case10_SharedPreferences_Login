/*
 * Copyright 2021 The Learning Android with Cases Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hypech.case8login_sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DBOpenHelper mDBOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDBOpenHelper = new DBOpenHelper(this);

        SharedPreferences sp = getSharedPreferences("rememberLogin", MODE_PRIVATE);

        if(sp.getBoolean("rememberLogin",false)){
            Intent intent = new Intent(this, BusinessLogic.class);//Jump to Register Activity
            startActivity(intent);
        }

    }

    public void clickRegister(View view){
        Intent intent = new Intent(this, Register.class);//Jump to Register Activity
        startActivity(intent);
    }

    public void clickLogin(View view){
        Intent intent = new Intent(this, Login.class); //Jump to Login Activity
        startActivity(intent);
    }
}