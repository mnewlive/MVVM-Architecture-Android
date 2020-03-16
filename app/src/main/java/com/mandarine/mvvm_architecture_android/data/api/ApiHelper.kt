package com.mandarine.mvvm_architecture_android.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()
}