package com.yogi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.izuku,
                nameSuperhero = "Izuku Midoriya",
                descSuperhero = "Izuku Midoriya (緑谷出久 Midoriya Izuku?), also known as Deku (デク Deku?), is the main protagonist of the My Hero Academia manga and anime series. \n" +
                        "Even though Izuku was born Quirkless, he manages to catch the attention of the legendary hero All Might, due to his innate heroism and a strong sense of justice, and has since become his close pupil, as well as a student in Class 1-A at U.A. High School. All Might passed on his transferable Quirk to Izuku, making him the ninth and current holder of One For All."
            ),
            Superhero(
                R.drawable.katsuki,
                nameSuperhero = "Bakugo Katsuki",
                descSuperhero = "Katsuki Bakugo (爆豪勝己 Bakugō Katsuki?), also known as Kacchan (かっちゃん Katchan?) by his childhood friends,[2] and his hero name Great Explosion Murder God Dynamight (大•爆•殺•神ダイナマイト Daibakusasshin Dainamaito?),[3] is a student in Class 1-A at U.A. High School, training to become a Pro Hero. He is the deuteragonist of the series."
            ),
            Superhero(
                R.drawable.shoto,
                nameSuperhero = "Shoto Todoroki",
                descSuperhero = "Shoto Todoroki (轟焦凍 Todoroki Shōto?), also known as Shoto (ショート Shōto?), is the tritagonist of the My Hero Academia manga and anime series."
            ),
            Superhero(
                R.drawable.himiko,
                nameSuperhero = "Toga Himiko",
                descSuperhero = "Himiko Toga (渡我被身子 Toga Himiko?)[2] is a major antagonist of the My Hero Academia manga and anime series.\n" +
                        "She was a member of the League of Villains, affiliated with the Vanguard Action Squad,[3] and later becoming one of the nine lieutenants of the Paranormal Liberation Front.[4]\n" +
                        "She is featured as an antagonist in the Forest Training Camp Arc, Provisional Hero License Exam Arc, Shie Hassaikai Arc, Paranormal Liberation War Arc, and Final War Arc."
            ),
            Superhero(
                R.drawable.tomura,
                nameSuperhero = "Shigaraki Tomura",
                descSuperhero = "Tomura Shigaraki (死柄木弔 Shigaraki Tomura?), real name Tenko Shimura (志村転弧 Shimura Tenko?), is the main antagonist of the My Hero Academia manga and anime series.\n" +
                        "He is the leader of the League of Villains, making his first major appearance as one of the main antagonists of the U.S.J. Arc. He was raised by his master, All For One, with the goal to kill All Might, the \"Symbol of Peace\", and ultimately destroying the society he represents. He soon merged his organization and the Meta Liberation Army to form the Paranormal Liberation Front, becoming its Grand Commander and later inheriting the All For One Quirk."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}