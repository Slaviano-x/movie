package ru.tyryshkin.dev.featuremain

import com.github.terrakok.cicerone.Router
import dagger.hilt.android.AndroidEntryPoint
import ru.tyryshkin.dev.base.BaseFragment
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : BaseFragment(R.layout.fragment_main) {

    @Inject
    lateinit var router: Router

    override fun onBackPressed() {
        router.exit()
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}
