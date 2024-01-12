package `in`.instea.customlistview

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var usersArray: ArrayList<UserDetail>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("name1", "name2", "name3")
        val time = arrayOf("time1", "time2", "time3")
        val message = arrayOf(
            "this is message1",
            "this is message2. hey my nanme is sadique annd i am currently developing an appp",
            "this is message3"
        )
        val phoneNo = arrayOf("5789564565", "44856216", "2456412313")
        val imageId = intArrayOf(R.drawable.img_1, R.drawable.img_2, R.drawable.img_3)

        usersArray = ArrayList<UserDetail>()

//        for (user in 0..name.size)
        for (userSerial in name.indices) {
            val user = UserDetail(
                name[userSerial],
                time[userSerial], message[userSerial], phoneNo[userSerial], imageId[userSerial]

            )
            usersArray.add(user)
        }

        val myListView = findViewById<ListView>(R.id.lV)

        myListView.adapter = MyAdapter(this, usersArray)

        myListView.isClickable = true

        myListView.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("name", name[i])
            intent.putExtra("phone", phoneNo[i])
            intent.putExtra("imageId", imageId[i])
            startActivity(intent)
        }
    }
}