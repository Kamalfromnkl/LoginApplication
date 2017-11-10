package com.xyz.login

class User {

    static constraints = {
        userName(blank:false)
        password(password:true)
        lastName(nullable:true)
    }
    
    String userName
    String password
    String firstName
    String lastName
    
    String toString(){
        return userName
    }
    
}
