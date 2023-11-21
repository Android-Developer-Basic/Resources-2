package otus.gpb.appresources2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.getColorOrThrow
import androidx.core.content.res.getResourceIdOrThrow
import androidx.core.content.withStyledAttributes

class MainActivity : AppCompatActivity() {

    private lateinit var hello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Делайте это до setContentView!
        setTheme(R.style.Theme_AppResources2)

        setContentView(R.layout.activity_main)

        hello = findViewById(R.id.hello)
        setAttributes()
    }

    private fun setAttributes() {
        val toRetrieve = intArrayOf(
            R.attr.myTextAppearance,
            R.attr.myTextColor,
            com.google.android.material.R.attr.colorError
        )
        withStyledAttributes(R.style.Theme_AppResources2, toRetrieve) {
            hello.setTextAppearance(getResourceIdOrThrow(getIndex(0)))
            hello.setTextColor(getColorOrThrow(getIndex(1)))
            hello.setBackgroundColor(getColorOrThrow(getIndex(2)))
        }
        hello.textSize = 24F
    }
}