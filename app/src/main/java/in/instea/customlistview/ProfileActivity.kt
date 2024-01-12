package `in`.instea.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val picId = intent.getIntExtra("imageId", R.drawable.img)
        val name = intent.getStringExtra("name")
        val phoneNo = intent.getStringExtra("phone")

        val nameTV = findViewById<TextView>(R.id.nameTV)
        val phoneTv  = findViewById<TextView>(R.id.phoneTV)
        val circularIV = findViewById<CircleImageView>(R.id.circleImageView)

        circularIV.setImageResource(picId)
        nameTV.text = name
        phoneTv.text = phoneNo
    }
}