package com.sangmoki.trotsing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondSingerFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflater를 통해 view를 생성하고, fragment_first_singer를 container에 붙여준다.
        val view = inflater.inflate(R.layout.fragment_second_singer, container, false)

        val items = mutableListOf<String>()
        items.add("Do or Die")
        items.add("사랑은 늘 도망가")
        items.add("별빛 같은 나의 사랑아")
        items.add("모래 알갱이")
        items.add("이제 나만 믿어요")
        items.add("미운 사랑")
        items.add("I'M HERO")
        items.add("London Boy")
        items.add("A bientot")
        items.add("HERO")

        // view를 통해 fragment_first_singer에 있는 RecyclerView를 찾아서 rv에 할당한다.
        val rv = view.findViewById<RecyclerView>(R.id.singRV)

        // items를 담은 RvAdapter를 생성하고 rvAdapter에 할당한다.
        val rvAdapter = RvAdapter(items)

        // rvAdapter를 rv에 할당한다.
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)


        // view를 통해 fragment_first_singer에 있는 ImageView를 찾아서 img1, img2, img3에 할당한다.
        val img1 = view.findViewById<ImageView>(R.id.img1)
        val img3 = view.findViewById<ImageView>(R.id.img3)

        // img1 클릭 이벤트
        img1.setOnClickListener {
            img1.findNavController()
                .navigate(R.id.action_secondSingerFragment_to_firstSingerFragment)
        }

        // img3 클릭 이벤트
        img3.setOnClickListener {
            img3.findNavController()
                .navigate(R.id.action_secondSingerFragment_to_thirdSingerFragment)
        }

        return view
    }
}