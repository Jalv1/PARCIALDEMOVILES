package dev.luischang.navdrawer.ui.gallery

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.luischang.navdrawer.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.txtTeams
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it


        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    //var arrSO = arrayOf("Argentina", "Brasil", "Uruguay", "Colombia", "Estados Unidos","Peru","Canada"
    //    "Mexico","Trinidad y Tobago")
   // override fun onCreate(savedInstanceState: Bundle?) {
    //      super.onCreate(savedInstanceState)
    //       enableEdgeToEdge()
    //       setContentView(R.layout.fragment)
    //     ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        //           val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
    //          v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
    //        insets
   //       }
    //      val lsvSistemasOperativos: ListView = findViewById(R.id.lsvSO)
    //      val adaptador: Any? = ArrayAdapter<Any?>(this,
    //         R.layout.simple_list_item_1,
    //          arrSO)
    //     lsvSistemasOperativos.adapter = adaptador as ListAdapter?

        //      lsvSistemasOperativos
    //        .setOnItemClickListener { parent, view, position, id ->
    //             Toast.makeText(applicationContext,
    //                "Posición: $position",
    //                 Toast.LENGTH_LONG).show()
    //         }
    //   }
}