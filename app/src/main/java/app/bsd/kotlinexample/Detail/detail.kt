package app.bsd.kotlinexample.Detail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import app.bsd.kotlinexample.Entidades.Person
import app.bsd.kotlinexample.R
import kotlinx.android.synthetic.main.activity_detail.*

class detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        btnLoadData.setOnClickListener {
            listpeople.layoutManager = LinearLayoutManager(this)
            listpeople.adapter = PeopleAdapter(this, loadEntity())
        }
    }

    private fun loadEntity(): ArrayList<Person> {
        val personas = ArrayList<Person>()
        personas.add(Person("Daniel", "Gomez", 28))
        personas.add(Person("Alejandra", "Cervantes", 27))
        personas.add(Person("Camila", "Cervantes", 1))
        personas.add(Person("Oswaldo", "Cervantes", 4))
        return personas
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home -> {
            onBackPressed()
            true
        }
        else -> false
    }
}
