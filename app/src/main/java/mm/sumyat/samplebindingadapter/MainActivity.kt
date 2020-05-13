package mm.sumyat.samplebindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import mm.sumyat.samplebindingadapter.anim.CommonAnimationView.animateLikeDisplay
import mm.sumyat.samplebindingadapter.binding.ActivityDataBindingComponent
import mm.sumyat.samplebindingadapter.databinding.ActivityMainBinding
import mm.sumyat.samplebindingadapter.listener.ActionListener
import mm.sumyat.samplebindingadapter.model.Movie

class MainActivity : AppCompatActivity() {

    var dataBindingComponent: DataBindingComponent = ActivityDataBindingComponent(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main,dataBindingComponent)

        val movieData = Movie("Bloodshot","/8WUVHemHFH2ZIP6NWkwlHWsyrEL.jpg","After he and his wife are murdered, marine Ray Garrison is resurrected by a team of scientists. Enhanced with nanotechnology, he becomes a superhuman, biotech killing machine—'Bloodshot'. As Ray first trains with fellow super-soldiers, he cannot recall anything from his former life. But when his memories flood back and he remembers the man that killed both him and his wife, he breaks out of the facility to get revenge, only to discover that there's more to the conspiracy than he thought.")
        binding.movie = movieData

        binding.listener = object : ActionListener{
            override fun likeMovie() {
                animateLikeDisplay(binding.imgLikeDisplay)
            }

        }
    }
}