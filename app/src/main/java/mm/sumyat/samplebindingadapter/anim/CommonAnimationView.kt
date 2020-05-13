package mm.sumyat.samplebindingadapter.anim

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener

object CommonAnimationView {
    fun animateLikeDisplay(view: View) {
        view.clearAnimation()
        view.visibility = View.VISIBLE
        ViewCompat.animate(view)
                .scaleXBy(1f)
                .scaleYBy(1f)
                .setListener(object : ViewPropertyAnimatorListener {
                    override fun onAnimationStart(view: View) {}
                    override fun onAnimationEnd(view: View) {
                        view.scaleX = 0.5f
                        view.scaleY = 0.5f
                        view.visibility = View.GONE
                    }

                    override fun onAnimationCancel(view: View) {
                        view.scaleX = 0.5f
                        view.scaleY = 0.5f
                        view.visibility = View.GONE
                    }
                })
                .start()
    }
}