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

class ThirdSingerFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // inflater를 통해 view를 생성하고, fragment_third_singer를 container에 붙여준다.
        val view = inflater.inflate(R.layout.fragment_third_singer, container, false)

        // items라는 이름의 MutableList를 생성한다.
        val items = mutableListOf<String>()

        items.add("진정인가요")
        items.add("밤차에서")
        items.add("무명배우")
        items.add("비 내리는 금강산")
        items.add("내 마음의 사진")
        items.add("당신을 만나")
        items.add("사랑가")
        items.add("찍어")
        items.add("월하가약")
        items.add("물음표")
        items.add("한 많은 대동강")
        items.add("한 많은 이별의 버스 정류장")

        // items라는 이름의 MutableList를 생성한다.
        val rv = view.findViewById<RecyclerView>(R.id.singRV)

        // items를 담은 RvAdapter를 생성하고 rvAdapter에 할당한다.
        val rvAdapter = RvAdapter(items)

        // rvAdapter를 rv에 할당한다.
        rv.adapter = rvAdapter

        // rv의 layout을 LinearLayoutManager로 설정한다.
        rv.layoutManager = LinearLayoutManager(context)

        // view를 통해 fragment_third_singer에 있는 ImageView를 찾아서 img1, img2, img3에 할당한다.
        val img1 = view.findViewById<ImageView>(R.id.img1)
        val img2 = view.findViewById<ImageView>(R.id.img2)

        // img1 클릭 이벤트
        img1.setOnClickListener {
            img1.findNavController().navigate(R.id.action_thirdSingerFragment_to_firstSingerFragment)
        }

        // img2 클릭 이벤트
        img2.setOnClickListener {
            img2.findNavController().navigate(R.id.action_thirdSingerFragment_to_secondSingerFragment)
        }

        return view
    }

}