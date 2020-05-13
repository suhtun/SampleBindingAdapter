package mm.sumyat.samplebindingadapter.binding

import android.app.Activity
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import coil.api.load

class ActivityBindingAdapters constructor(val activity: Activity) {

    @BindingAdapter(value = ["imageUrl"], requireAll = false)
    fun bindImage(imageView: ImageView, url: String?) {
        imageView.load(url)
    }

    @BindingAdapter("visibleGone")
    fun showHide(view: View, show: Boolean) {
        view.visibility = if (show) View.VISIBLE else View.GONE
    }
}