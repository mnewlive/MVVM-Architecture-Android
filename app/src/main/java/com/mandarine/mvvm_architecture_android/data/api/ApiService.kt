package com.mandarine.mvvm_architecture_android.data.api

import com.mandarine.mvvm_architecture_android.data.model.User
import io.reactivex.Single

/**
 * http://reactivex.io/RxJava/javadoc/io/reactivex/Single.html
 */
interface ApiService {

    fun getUsers(): Single<List<User>>
}