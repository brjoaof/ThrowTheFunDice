package com.devventure.myapplication

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.devventure.myapplication.databinding.FragmentThrowDiceBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ThrowDiceFragment : Fragment() {
    private var binding : FragmentThrowDiceBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThrowDiceBinding.inflate(inflater, container, false)

        val playerName = "playername"

        val dice1 = binding?.dice1IV
        val dice2 = binding?.dice2IV
        val btn = binding?.throwBtn
        val welcomeMessage = binding?.welcomeMessage
        val shareButton = binding?.share

        welcomeMessage?.text = getString(R.string.welcome, playerName)

        val listImages = listOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6,
        )

        btn?.setOnClickListener{
            dice1?.setImageResource(listImages.random())
            dice2?.setImageResource(listImages.random())
        }

        shareButton?.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Voce e Sortudo")
            intent.setPackage("com.whatsapp")
            intent.type = "text/plain"

            activity?.packageManager?.run {
                if(intent.resolveActivity(this) != null) {
                    startActivity(intent)
                } else {
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")))
                }
            }

        }

        return binding?.root
    }

}