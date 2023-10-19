package kz.just_code.chipsanddialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kz.just_code.chipsanddialogs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val continentDialog = ContinentBottomSheet(true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clearAll.setOnClickListener {
            showAlertDialog()
            //continentDialog.show(supportFragmentManager, "ContinentBottomSheet")
            //val checkedItems = binding.chipGroup.checkedChipIds
           // Toast.makeText(this, "Checked items: $checkedItems", Toast.LENGTH_SHORT).show()
            //binding.chipGroup.clearCheck()
        }
    }

    private fun showAlertDialog() {
        val items = arrayOf("item 1", "item 2", "item 3")
        val checkedItems = booleanArrayOf(false, true, true)
        MaterialAlertDialogBuilder(this)
            .setTitle("I am a title")
            .setMultiChoiceItems(items, checkedItems) { _, _, _ ->

            }
            /*.setMessage("Hello alert dialog")
            .setPositiveButton("Ok") { _, _ ->
                Toast.makeText(this, "Clicked ok", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancel") { _, _ ->
                Toast.makeText(this, "Clicked cancel", Toast.LENGTH_SHORT).show()
            }
            .setNeutralButton("Decline") { _, _ ->
                Toast.makeText(this, "Clicked Decline", Toast.LENGTH_SHORT).show()
            }*/
            .setCancelable(false)
            .show()
    }
}