package com.example.knowledgehub

import android.annotation.SuppressLint
import android.content.Intent
//import android.content.pm.PackageManager
//import android.content.pm.PathPermission
import android.net.Uri
//import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//import android.widget.Toast
//import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
//import androidx.core.app.ActivityCompat
//import androidx.core.content.ContextCompat
//import java.util.jar.Manifest

class SecondActivity : AppCompatActivity() {
//    val CALL_RO = 101
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val iosdev = findViewById<CardView>(R.id.ios)
        val webdev = findViewById<CardView>(R.id.web)
        val blockchain = findViewById<CardView>(R.id.blockchain)
        val ml = findViewById<CardView>(R.id.ml)
        val cloud = findViewById<CardView>(R.id.cloud)
        val androidapp = findViewById<CardView>(R.id.android)
        val support = findViewById<Button>(R.id.button2)
        iosdev.setOnClickListener{
            intent = Intent(applicationContext,IosActivity::class.java)
            startActivity(intent)
        }
        webdev.setOnClickListener{
            intent = Intent(applicationContext,WebActivity::class.java)
            startActivity(intent)
        }
        blockchain.setOnClickListener{
            intent = Intent(applicationContext,BlockchainActivity::class.java)
            startActivity(intent)

        }
        ml.setOnClickListener{
            intent = Intent(applicationContext,MlActivity::class.java)
            startActivity(intent)
        }
        cloud.setOnClickListener{
            intent = Intent(applicationContext,CloudActivity::class.java)
            startActivity(intent)
        }
        androidapp.setOnClickListener{
            intent = Intent(applicationContext,AndroidActivity::class.java)
            startActivity(intent)
        }
        support.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + "1112223334"))
            startActivity(intent)
        }
    }
//    private fun checkForPermissions(permission: String,name: String, requestCode: Int){
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
//             when{
//                 ContextCompat.checkSelfPermission(applicationContext,permission)==PackageManager.PERMISSION_GRANTED ->{
//                     Toast.makeText(applicationContext,"$name permission granted",Toast.LENGTH_SHORT).show()
//                 }
//                 shouldShowRequestPermissionRationale(permission) -> showDialog(permission,name,requestCode)
//                 else -> ActivityCompat.requestPermissions(this, arrayOf(permission), requestCode)
//             }
//        }
//    }
//    private fun showDialog(permission: String,name: String,requestCode: Int){
//        val builder = AlertDialog.Builder(this)
//        builder.apply{
//            setMessage("Permission to access your $name is required to use this app")
//            setTitle("Permission Required")
//            setPositiveButton("OK"){dialog,which ->
//                ActivityCompat.requestPermissions(this@SecondActivity,arrayOf(permission),requestCode)
//            }
//        }
//        val dialog = builder.create()
//        dialog.show()
//    }
}