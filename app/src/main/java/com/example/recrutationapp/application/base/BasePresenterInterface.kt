package com.example.recrutationapp.application.base

interface BasePresenterInterface<ViewType> {
    fun attach(view: ViewType)
}