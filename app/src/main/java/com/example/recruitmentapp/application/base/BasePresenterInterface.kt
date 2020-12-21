package com.example.recruitmentapp.application.base

interface BasePresenterInterface<ViewType> {
    fun attach(view: ViewType)
}