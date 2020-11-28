package com.pv.screendata

import androidx.navigation.NavController
import com.pv.screendata.mock.MockScreens
import com.pv.screendata.screens.SomeScreen
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

object SDScreenHandler {

    // not sure if needed here or passed to each view basically
    lateinit var navController: NavController

    // should logic of the screen be bound to each screen, ie, sdScreen ?
    // keep to some screen and not sd screen boi
    fun getScreen(id: String): Flow<SomeScreen> {
        return flowOf(MockScreens.basic)
    }
}
