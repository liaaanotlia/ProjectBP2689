package com.example.projectbp2689

class LoginModel {
    //variabel
    var username = " "
    var password = " "
    //method/func
    fun loginCek():Boolean{
        if(username.equals("amalia") && password.equals("amalia")){
            return true
        }else{
            return false
        }
    }
}