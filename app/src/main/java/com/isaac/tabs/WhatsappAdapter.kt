package com.isaac.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.isaac.tabs.views.CallFragment
import com.isaac.tabs.views.StatusFragment
import com.isaac.tabs.views.chatFragment

class WhatsappAdapter (fm:FragmentManager): FragmentStatePagerAdapter(fm){

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){

            0 -> return "Chat"
            1 -> return "Status"
            2-> return " Calls"
            else -> return "Chat"
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
       when(position){
           0 -> return chatFragment()
           1 -> return StatusFragment()
           2 -> return CallFragment()
           else -> return chatFragment()
       }
    }
}