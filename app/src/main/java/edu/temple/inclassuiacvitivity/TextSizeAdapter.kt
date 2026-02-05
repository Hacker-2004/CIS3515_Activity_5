package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter (_context: Context, _size: Array<String>) : BaseAdapter() {
    private val context = _context
    private val size = _size

    override fun getCount(): Int {
        return size.size
    }

    override fun getItem(position: Int): Any {
        return size[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)
        textView.text = size[position]
        textView.textSize = 22f
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val textView = TextView(context)
        textView.text = size[position]
        textView.textSize = size[position].toFloat()
        return textView
    }

}