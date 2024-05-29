package com.sangmoki.trotsing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController

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

        // view를 통해 fragment_first_singer에 있는 ImageView를 찾아서 img1, img2, img3에 할당한다.
        val img1 = view.findViewById<ImageView>(R.id.img1)
        val img2 = view.findViewById<ImageView>(R.id.img2)
        val img3 = view.findViewById<ImageView>(R.id.img3)

        // img1 클릭 이벤트
        img1.setOnClickListener {
            img1.findNavController()
                .navigate(R.id.action_secondSingerFragment_to_firstSingerFragment)
        }

        // img2 클릭 이벤트
        img2.setOnClickListener {
        }

        // img3 클릭 이벤트
        img3.setOnClickListener {
            img3.findNavController()
                .navigate(R.id.action_secondSingerFragment_to_thirdSingerFragment)
        }

        return view
    }
}