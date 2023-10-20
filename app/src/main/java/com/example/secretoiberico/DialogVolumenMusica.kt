package com.example.secretoiberico

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.media.AudioManager
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment



class DialogVolumenMusica : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireContext())

        val inflater = requireActivity().layoutInflater
        val dialogView = inflater.inflate(R.layout.fragment_dialog_volumen_musica, null)

        val seekBarVolume = dialogView.findViewById<SeekBar>(R.id.seekBarVolume)

        // Configura un AudioManager para controlar el volumen de la música
        val audioManager = requireContext().getSystemService(Context.AUDIO_SERVICE) as AudioManager
        val maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        val currentVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)

        // Configura el SeekBar para reflejar el volumen actual
        seekBarVolume.max = maxVolume
        seekBarVolume.progress = currentVolume

        // Define el Listener para el SeekBar
        seekBarVolume.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Cuando cambia el valor del SeekBar, ajusta el volumen
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Puedes agregar lógica adicional si es necesario cuando comienza el seguimiento del SeekBar
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Puedes agregar lógica adicional si es necesario cuando se detiene el seguimiento del SeekBar
            }
        })

        builder.setView(dialogView)

        return builder.create()
    }
}