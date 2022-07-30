package ru.tyryshkin.dev.uikit.presentation.customview

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.widget.LinearLayout
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.tyryshkin.dev.uikit.R
import ru.tyryshkin.dev.uikit.databinding.ViewErrorBinding

class ErrorView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr) {

    private val binding by viewBinding<ViewErrorBinding>()

    init {
        inflate(context, R.layout.view_error, this)
        orientation = VERTICAL
        gravity = Gravity.CENTER
    }

    fun setErrorMessage(text: String) {
        binding.tvErrorMessage.text = text
    }
}
