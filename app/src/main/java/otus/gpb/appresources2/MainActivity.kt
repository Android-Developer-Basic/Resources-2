package otus.gpb.appresources2

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var hello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello = findViewById(R.id.hello)
        setFont()
    }

    private fun setFont() {
        hello.setTypeface(resources.getFont(R.font.creato), Typeface.BOLD)
    }
}