package com.islandparadise14.mintable

import android.view.View

class ScheduleEntity(
    var originId: Int? = null,
    var scheduleName: String = "",
    var roomInfo: String = "",
    var scheduleDay: ScheduleDay? = null,
    var startTime: String? = null,
    var endTime: String? = null,
    var backgroundColor: String = "#dddddd",
    var textColor: String = "#ffffff"
) {
    var scheduleClickListener: OnScheduleClickListener? = null

    fun setOnScheduleClickListener(listener: OnScheduleClickListener) {
        scheduleClickListener = listener
    }

    interface OnScheduleClickListener {
        fun scheduleClicked(originId: Int)
    }
}