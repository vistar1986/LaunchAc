package com.jccppp.start.jk

fun interface ConditionalJumpLogin {

    //login 是否登录   返回值为是否跳转ac
    fun jump(isLogin: Boolean): Boolean
}