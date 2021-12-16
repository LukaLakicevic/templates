package com.example.testapp.Menu.models

class DataSource {

    companion object{
        fun createDataSet(): ArrayList<AdapterPost> {
            val list = ArrayList<AdapterPost>()
            list.add(
                AdapterPost(
                    "Wolf",
                    "https://cdn.statically.io/img/i.pinimg.com/736x/01/67/7d/01677d5a907d05e62fc3e7db9075dce8.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Fox",
                    "https://wallpaperaccess.com/full/2565477.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Bear",
                    "https://i.pinimg.com/originals/ea/97/5b/ea975b5aebfe89939dedf2d9c0fa8eb9.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Deer",
                    "https://images.hdqwalls.com/wallpapers/deer-digital-art-4k-wz.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Rabbit",
                    "https://c4.wallpaperflare.com/wallpaper/674/479/690/music-rabbit-rabbit-rap-wallpaper-preview.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Lion",
                    "https://www.nawpic.com/media/2020/lion-nawpic-19.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Mountain lion",
                    "https://wallpaperaccess.com/full/1542649.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Eagle",
                    "https://cdn.wallpapersafari.com/57/3/KqQati.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Hawk",
                    "https://images4.alphacoders.com/191/thumb-1920-191496.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Shark",
                    "https://wallpapercave.com/wp/bg9avtL.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Snake",
                    "https://cdn6.aptoide.com/imgs/d/c/b/dcbce0182de5fb7c987b4ae9ea601f9d_screen.jpg"
                )
            )
            list.add(
                AdapterPost(
                    "Rino",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSREIJwRRJHxltg7lFP2tfhOfg_LqJphd1B2Q&usqp=CAU"
                )
            )

            return list
        }
    }
}