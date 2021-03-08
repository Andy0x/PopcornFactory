package mx.edu.itson.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*
import android.os.Bundle


class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle = intent.extras

        if (bundle != null){
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("nombre"))
            tv_pelicula_desc.setText(bundle.getString("sinopsis"))
        }
    }
}