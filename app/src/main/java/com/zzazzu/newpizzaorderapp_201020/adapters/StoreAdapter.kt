package com.zzazzu.newpizzaorderapp_201020.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.zzazzu.newpizzaorderapp_201020.R
import com.zzazzu.newpizzaorderapp_201020.datas.Store
import kotlinx.android.synthetic.*

class StoreAdapter(
    val mContext:Context,
    resId:Int,
    val mList:List<Store>) : ArrayAdapter<Store> (mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow == inf.inflate(R.layout.store_list_item, null)
    }

        var row = tempRow!!

        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        val brandNameTxt = row.findViewById<TextView>(R.id.brandNameTxt)

        val storeData = mList[position]

        brandNameTxt.text = storeData.brandName

        Glide.with(mContext).load(storeData.logoUrl).into(logoImg)

        return row

    }
}