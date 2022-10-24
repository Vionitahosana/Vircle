package id.kharisma.studio.vircle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitysplashscreen)

        Handler().postDelayed({
            startActivity(Intent(this, Login_Activity::class.java))
            finish()
        },3000)
    }
}
