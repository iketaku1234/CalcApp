package jp.techacademy.takuya.ikeda.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1)Viewの取得
        var et1: EditText = findViewById(R.id.et1)
        var et2: EditText = findViewById(R.id.et2)
        var button1: Button = findViewById(R.id.button1)

        button1.setOnClickListener {
            object : View.OnClickListener {
                override fun onClick(v: View?) {
                    var sum: Float = et1.text.toString().toFloat() + et2.text.toString().toFloat()

                    //3)Intentのインスタンスを生成
                    val intent = Intent(this@MainActivity, SecondActivity::class.java)

                    //4)IntentクラスのputExtraメソッドで渡すキーと値を設定する
                    intent.putExtra("cal_result","計算結果は" + sum + "です")

                    //5)Intentを引数にしてstartActivityを呼び出す
                    startActivity(intent)

                    Log.d("log","テスト")
                }
            }
        }
    }
}



