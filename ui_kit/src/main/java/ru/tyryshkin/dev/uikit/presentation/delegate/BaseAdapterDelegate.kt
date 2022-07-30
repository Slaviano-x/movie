package ru.tyryshkin.dev.uikit.presentation.delegate

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import ru.tyryshkin.dev.uikit.presentation.viewobject.ViewObject

inline fun <reified I : ViewObject, V : ViewBinding> baseAdapterDelegate(
    noinline viewBinding: (layoutInflater: LayoutInflater, parent: ViewGroup) -> V,
    noinline on: (item: ViewObject, items: List<ViewObject>, position: Int) -> Boolean = { item, _, _ -> item is I },
    noinline layoutInflater: (parent: ViewGroup) -> LayoutInflater = { parent ->
        LayoutInflater.from(parent.context)
    },
    noinline block: AdapterDelegateViewBindingViewHolder<I, V>.() -> Unit
): AdapterDelegate<List<ViewObject>> = adapterDelegateViewBinding(
    viewBinding = viewBinding,
    on = on,
    block = block,
    layoutInflater = layoutInflater
)
