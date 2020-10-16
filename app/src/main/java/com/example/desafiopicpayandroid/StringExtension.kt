package com.example.desafiopicpayandroid

fun String.unmask(): String {
    return this.replace("[.]".toRegex(), "").replace("[-]".toRegex(), "").replace("[/]".toRegex(), "")
        .replace("[(]".toRegex(), "").replace(
            "[ ]".toRegex(), ""
        ).replace("[:]".toRegex(), "").replace("[)]".toRegex(), "")
}