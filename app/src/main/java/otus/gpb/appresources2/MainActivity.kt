package otus.gpb.appresources2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var hello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Делайте это до setContentView!
        setTheme(R.style.Theme_AppResources2)

        setContentView(R.layout.activity_main)

        hello = findViewById(R.id.hello)
        setTextFormat()
    }

    private fun setTextFormat() {
        hello.setTextAppearance(R.style.AllCapsLabel)
    }
}