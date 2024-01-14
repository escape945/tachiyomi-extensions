package eu.kanade.tachiyomi.extension.en.anchira

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ListEntry(
    val id: Int,
    val key: String,
    val title: String,
    @SerialName("thumb_index") val thumbnailIndex: Int,
    val tags: List<Tag> = emptyList(),
)

@Serializable
data class Tag(
    var name: String,
    var namespace: Int? = null,
)

@Serializable
data class LibraryResponse(
    val entries: List<ListEntry> = emptyList(),
    val total: Int,
    val page: Int,
    val limit: Int,
)

@Serializable
data class Entry(
    val id: Int,
    val key: String,
    @SerialName("published_at") val publishedAt: Long,
    val title: String,
    @SerialName("thumb_index") val thumbnailIndex: Int,
    val tags: List<Tag> = emptyList(),
    val url: String? = null,
)

@Serializable
data class ImageData(
    val id: Int,
    val key: String,
    val hash: String,
    val names: List<String>,
)

@Serializable
data class EntryKey(
    val id: Int,
    val key: String,
    val hash: String,
    val url: String?,
    val names: List<String> = emptyList(),
)

@Serializable
data class AnchiraData(
    val key: String,
    val galleries: List<EntryKey>,
)
