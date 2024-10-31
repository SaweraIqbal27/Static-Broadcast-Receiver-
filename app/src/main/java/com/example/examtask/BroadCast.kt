package com.example.examtask

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class ChargerBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_POWER_CONNECTED -> {
                // Show toast when charger is connected
                Toast.makeText(context, "Device Connected to Charger", Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_POWER_DISCONNECTED -> {
                // Show toast when charger is disconnected
                Toast.makeText(context, "Device Disconnected from Charger", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
