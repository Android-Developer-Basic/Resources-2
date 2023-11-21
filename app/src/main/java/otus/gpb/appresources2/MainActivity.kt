package otus.gpb.appresources2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.imageLoader
import coil.load
import coil.request.ImageRequest

private const val pic1 = "https://picsum.photos/id/63/200/300"
private const val pic2 = "https://picsum.photos/id/85/300/200"

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Делайте это до setContentView!
        setTheme(R.style.Theme_AppResources2)

        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        findViewById<Button>(R.id.button1).setOnClickListener {
            loadPic1()
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            loadPic2()
        }
    }

    private fun loadPic1() {
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        val request = ImageRequest.Builder(this)
            .data(pic1)
            .crossfade(true)
            .target(imageView)
            .build()

        imageLoader.enqueue(request)
    }

    private fun loadPic2() {
        imageView.scaleType = ImageView.ScaleType.FIT_CENTER
        imageView.load(pic2) {
            crossfade(true)
            crossfade(2000)
        }
    }
}