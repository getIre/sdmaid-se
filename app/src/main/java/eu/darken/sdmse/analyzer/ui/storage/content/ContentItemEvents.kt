package eu.darken.sdmse.analyzer.ui.storage.content

import eu.darken.sdmse.analyzer.core.content.ContentItem

sealed class ContentItemEvents {
    data class ContentLongPressActions(val item: ContentItem) : ContentItemEvents()
}
