package com.example.campuslyfe.fragment.club

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.campuslyfe.R
import com.example.campuslyfe.model.Club
import kotlinx.android.synthetic.main.club_rw_row.view.*

class ClubRwAdapter(
    private val clubList: List<Club?>
) : RecyclerView.Adapter<ClubRwAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.club_rw_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = clubList[position]
        holder.itemView.textViewClubRow.text = currentItem?.name
        holder.itemView.rootView.setOnClickListener {
            currentItem?.let { club ->
                val action =
                    ClubFragmentDirections.actionClubFragmentToClubDetayFragment2(club)
                holder.itemView.findNavController().navigate(action)
            }
        }
    }

    override fun getItemCount(): Int {
        return clubList.size
    }
}