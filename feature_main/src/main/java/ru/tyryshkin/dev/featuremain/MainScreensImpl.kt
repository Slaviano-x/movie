package ru.tyryshkin.dev.featuremain

import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.tyryshkin.dev.navigation.screens.MainScreens
import javax.inject.Inject

class MainScreensImpl @Inject constructor() : MainScreens {
    override fun mainFragment() = FragmentScreen {
        MainFragment.newInstance()
    }
}
