package dev.luischang.navdrawer.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.luischang.navdrawer.R
import dev.luischang.navdrawer.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    //override fun onCreate(savedInstanceState: Bundle?) {
    //super.onCreate(savedInstanceState)
    //setContentView(R.layout.fragment_slideshow)

    //    val n1 = findViewById<EditText>(R.id.etPrizes)
    //    val r = findViewById<TextView>(R.id.txt1)
    //    val A = findViewById<TextView>(R.id.txt2)
    //   val X = findViewById<TextView>(R.id.txt3)
    //    val btnCalculate = findViewById<Button>(R.id.btnCalculate)

    //    btnCalculate.setOnClickListener {
    //        r.setText( "1 place:  "+(n1.text.toString().toInt() * 0.25))
    //        A.setText( "2 place:  "+(n1.text.toString().toInt() * 0.15))
    //        X.setText( "3 place:  "+(n1.text.toString().toInt() * 0.10))
    //    }
    //}
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.txtPrizes
        slideshowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}