package mm.sumyat.samplebindingadapter.binding

import android.app.Activity
import androidx.databinding.DataBindingComponent
import androidx.fragment.app.Fragment

class ActivityDataBindingComponent(activity: Activity) : DataBindingComponent {

    private val adapter = ActivityBindingAdapters(activity)

    override fun getActivityBindingAdapters(): ActivityBindingAdapters {
        return adapter
    }

}