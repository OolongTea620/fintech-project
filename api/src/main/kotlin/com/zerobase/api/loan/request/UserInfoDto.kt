package com.zerobase.api.loan.request

import com.zerobase.domain.com.zerobase.api.domain.UserInfo

data class UserInfoDto (
    val userKey: String,
    val userName: String,
    val userRegisterationNumber: String,
    val userIncomeAmount: Long
) {
    fun toEntity(): UserInfo = UserInfo(
        userKey, userRegisterationNumber, userName, userIncomeAmount
    )
}