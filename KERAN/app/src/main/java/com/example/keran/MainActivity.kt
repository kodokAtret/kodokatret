package com.example.keran

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvKeran: RecyclerView
    private var list: ArrayList<Keran> = arrayListOf()
    private val listKeran = ArrayList<Keran>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKeran = findViewById(R.id.rv_keran)
        rvKeran.setHasFixedSize(true)

        list.addAll(Kerandata)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvKeran.layoutManager = LinearLayoutManager(this)
        val listKeranAdapter = ListKeranAdapter(list)
        rvKeran.adapter = listKeranAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
            }

            R.id.action_grid -> {
            }

            R.id.action_Cardview -> {

            }
        }
    }
}