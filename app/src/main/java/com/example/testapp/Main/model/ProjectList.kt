package com.example.testapp.Main.model

import com.example.testapp.Menu.MenuActivity


class ProjectList {

    companion object{
        fun createDataSet(): ArrayList<AdapterItem>{
            val list = ArrayList<AdapterItem>()
            list.add(
                AdapterItem(
                    "Picture Swap",
                )
            )
            list.add(
                AdapterItem(
                    "Animal RecyclerView",
                )
            )
            list.add(
                AdapterItem(
                    "Navigation View",
                )
            )
            list.add(
                AdapterItem(
                    "Retrofit",
                )
            )
            return list
        }
    }
}