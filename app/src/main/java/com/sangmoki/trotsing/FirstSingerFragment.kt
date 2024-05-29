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


class FirstSingerFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // inflater를 통해 view를 생성하고, fragment_first_singer를 container에 붙여준다.
        val view = inflater.inflate(R.layout.fragment_first_singer, container, false)

        // items라는 이름의 MutableList를 생성한다.
        val items = mutableListOf<String>()
        items.add("MMM")
        items.add("FORM")
        items.add("영탁 디시아")
        items.add("누나가 딱이야")
        items.add("우리 정말 나쁘다")
        items.add("니가 왜 거기서 나와")
        items.add("이불")
        items.add("전복 먹으러 갈래")
        items.add("니가 왜 거기서 나와")

        // view를 통해 fragment_first_singer에 있는 RecyclerView를 찾아서 rv에 할당한다.
        val rv = view.findViewById<RecyclerView>(R.id.singRV)

        // items를 담은 RvAdapter를 생성하고 rvAdapter에 할당한다.
        val rvAdapter = RvAdapter(items)

        // rvAdapter를 rv에 할당한다.
        rv.adapter = rvAdapter

        // rv의 layout을 LinearLayoutManager로 설정한다.
        rv.layoutManager = LinearLayoutManager(context)

        // view를 통해 fragment_first_singer에 있는 ImageView를 찾아서 img1, img2, img3에 할당한다.
        val img2 = view.findViewById<ImageView>(R.id.img2)
        val img3 = view.findViewById<ImageView>(R.id.img3)



        // img2 클릭 이벤트
        img2.setOnClickListener {
            img2.findNavController().navigate(R.id.action_firstSingerFragment_to_secondSingerFragment)
        }

        // img3 클릭 이벤트
        img3.setOnClickListener {
            img3.findNavController().navigate(R.id.action_firstSingerFragment_to_thirdSingerFragment)
        }

        return view
    }

}