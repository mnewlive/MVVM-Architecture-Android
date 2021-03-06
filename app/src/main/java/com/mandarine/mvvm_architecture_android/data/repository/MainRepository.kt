package com.mandarine.mvvm_architecture_android.data.repository

import com.mandarine.mvvm_architecture_android.data.api.ApiHelper
import com.mandarine.mvvm_architecture_android.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}