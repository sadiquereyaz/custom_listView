package `in`.instea.customlistview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<UserDetail>) :
    ArrayAdapter<UserDetail>(context, R.layout.row, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.row, null)

        val image = view.findViewById<CircleImageView>(R.id.circleImageView)
        val name = view.findViewById<TextView>(R.id.nameTV)
        val time = view.findViewById<TextView>(R.id.timeTV)
        val message = view.findViewById<TextView>(R.id.messageTV)

        name.text = arrayList[position].name
        time.text = arrayList[position].msgTime
        image.setImageResource(arrayList[position].image)
        time.text = arrayList[position].messageContent

        return view

    }
}