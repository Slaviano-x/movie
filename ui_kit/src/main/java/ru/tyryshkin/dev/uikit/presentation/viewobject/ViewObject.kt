package ru.tyryshkin.dev.uikit.presentation.viewobject

interface ViewObject {
    infix fun areItemsTheSame(otherViewObject: ViewObject): Boolean = this == otherViewObject

    infix fun areContentsTheSame(otherViewObject: ViewObject): Boolean = this == otherViewObject
}
