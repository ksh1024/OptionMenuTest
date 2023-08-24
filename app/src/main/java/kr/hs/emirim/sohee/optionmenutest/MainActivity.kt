package kr.hs.emirim.sohee.optionmenutest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "배경색과 버튼 변경"
        linear = findViewById(R.id.linear)
        btn = findViewById(R.id.btn)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemRed->{
                linear.setBackgroundColor(Color.RED)
                return true
            }
            R.id.itemBlue->{
                linear.setBackgroundColor(Color.BLUE)
                return true
            }
            R.id.itemMagenta->{
                linear.setBackgroundColor(Color.MAGENTA)
                return true
            }
            R.id.subRotate->{
               btn.rotation += 45f //시계 방향 45도 회전
                return true
            }
            R.id.subSize->{
                btn.scaleX *= 2f //너비 두배
                return true
            }
            R.id.subInit->{
                btn.rotation = 0f
                btn.scaleX = 1f
                return true
            }
        }
        return false
    }
}