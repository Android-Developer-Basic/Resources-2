package otus.gpb.appresources2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Делайте это до setContentView!
        setTheme(R.style.Theme_AppResources2)

        setContentView(R.layout.activity_main)
    }
}