package app.bsd.kotlinexample.Detail

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.bsd.kotlinexample.Entidades.Person
import app.bsd.kotlinexample.R
import kotlinx.android.synthetic.main.item.view.*

class PeopleAdapter(private val context: Context, private val items: ArrayList<Person>) : RecyclerView.Adapter<PeopleAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre.text = items.get(position).name
        holder.paterno.text = items.get(position).paterno
        holder.edad.text = items.get(position).edad.toString()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nombre = view.nombre
        val paterno = view.paterno
        val edad = view.edad
    }


}