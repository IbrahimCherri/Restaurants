package com.ibrahimcherri.restaurants.application.injection.component

import com.ibrahimcherri.restaurants.application.injection.module.*
import com.ibrahimcherri.restaurants.presentation.view.RestaurantsActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    ServiceModule::class,
    NetworkModule::class,
    DatabaseModule::class])
interface ApplicationComponent {
    fun inject(restaurantsActivity: RestaurantsActivity)
}