package consulting.hewittenterprises.gearstabs

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.electroteach.mytabs.R
import consulting.hewittenterprises.gearstabs.PlaceholderFragment
import kotlin.Int as KotlinInt

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    "Tab 3"
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: KotlinInt): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: KotlinInt): CharSequence {
        return context.resources.getString(TAB_TITLES[position] as KotlinInt)
    }

    override fun getCount(): KotlinInt {
        // Show 2 total pages.
        return 2
    }
}