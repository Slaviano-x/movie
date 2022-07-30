package ru.tyryshkin.dev.uikit.presentation.delegate

import android.widget.Button
import ru.tyryshkin.dev.uikit.R
import ru.tyryshkin.dev.uikit.databinding.ItemErrorBinding
import ru.tyryshkin.dev.uikit.presentation.viewobject.ErrorViewObject

fun errorViewObjectDelegate(onRetryClickListener: () -> Unit) =
    baseAdapterDelegate<ErrorViewObject, ItemErrorBinding>(
        { layoutInflater, parent ->
            ItemErrorBinding.inflate(layoutInflater, parent, false)
        }
    ) {
        bind {
            with(binding) {
                val message = item.errorText
                if (message.isNotEmpty()) {
                    errorView.setErrorMessage(message)
                }

                val retryButton = binding.root.findViewById<Button>(R.id.btnRetry)
                retryButton.setOnClickListener {
                    onRetryClickListener()
                }
            }
        }
    }
