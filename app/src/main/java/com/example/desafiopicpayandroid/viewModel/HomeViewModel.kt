package com.example.desafiopicpayandroid.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.desafiopicpayandroid.model.User

class HomeViewModel : ViewModel() {

    val usersLiveData: MutableLiveData<List<User>> = MutableLiveData()
    private val homeBusiness = HomeBusiness()

    fun getUsers() {
        val users = homeBusiness.getUsers()
        usersLiveData.postValue(users)
    }


}