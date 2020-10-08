package ru.skillbranch.skillarticles.ui.custom.markdown

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import androidx.core.view.children
import ru.skillbranch.skillarticles.data.repositories.MarkdownElement
import ru.skillbranch.skillarticles.extensions.dpToIntPx
import kotlin.properties.Delegates

class MarkdownContentView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ViewGroup(context, attrs, defStyleAttr) {

    private lateinit var elements: List<MarkdownElement>

    //for restore
    private var ids = arrayListOf<Int>()

    var textSize by Delegates.observable(14f) { _, old, value ->
        if (value == old) return@observable
        this.children.forEach {
            it as IMarkdownView
            it.fontSize = value
        }
    }
    var isLoading: Boolean = true
    val padding = context.dpToIntPx(8)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        //TODO implement me
    }


    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        //TODO implement me
    }

    fun setContent(content: List<MarkdownElement>) {
        //TODO implement me
    }

    fun renderSearchResult(searchResult: List<Pair<Int, Int>>) {
        //TODO implement me
    }

    fun renderSearchPosition(
        searchPosition: Pair<Int, Int>?
    ) {
        //TODO implement me
    }

    fun clearSearchResult() {
        //TODO implement me
    }

    fun setCopyListener(listener: (String) -> Unit) {
        //TODO implement me
    }
}