package attachments

interface Attachment {
    val type: String
}

data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val sizes: Array<SizesPhoto>,
    val width: Int,
    val height: Int
)

data class SizesPhoto(
    val type: String,
    val url: String,
    val width: Int,
    val height: Int
)

class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo
) : Attachment

//-------------------------------------------------------------------------------------------

data class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val image: Array<VImage>,
    val firstFrame: Array<VFirstFrame>,
    val date: Int,
    val addingDate: Int,
    val views: Int,
    val localViews: Int,
    val comments: Int,
    val player: String,
    val platform: String,
    val canAdd: Boolean,
    val isPrivate: Boolean = true,
    val accessKey: String,
    val processing: Boolean,
    val isFavorite: Boolean,
    val canComment: Boolean,
    val canEdit: Boolean,
    val canLike: Boolean,
    val canRepost: Boolean,
    val canSubscribe: Boolean,
    val canAddToFaves: Boolean,
    val canAttachLink: Boolean,
    val width: Int,
    val height: Int,
    val userId: Int,
    val converting: Boolean,
    val added: Boolean,
    val isSubscribed: Boolean,
    val repeat: Int,
    val type: String,
    val balance: Int,
    val liveStatus: String,
    val live: Boolean,
    val upcoming: Boolean,
    val spectators: Int,
    val likes: VLikes,
    val reposts: VReposts
)

data class VImage(
    val height: Int,
    val url: String,
    val width: Int,
    val withPadding: Int
)

data class VFirstFrame(
    val height: Int,
    val url: String,
    val width: Int
)

data class VLikes(
    val count: Int,
    val userLikes: Boolean
)

data class VReposts(
    val count: Int,
    val wallCount: Int,
    val MailCount: Int,
    val userReposted: Boolean
)

class VideoAttachment(
    override val type: String = "video",
    val audio: Audio
) : Attachment

//-------------------------------------------------------------------------------------------

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch: Int,
    val isHq: Int,
)

class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio
) : Attachment

//-------------------------------------------------------------------------------------------

data class Sticker(
    val productId: Int,
    val stickerId: Int,
    val images: Array<SImages>,
    val imagesWithBackground: Array<SImagesWithBackground>,
    val animationUrl: String,
    val isAllowed: Boolean
)

data class SImages(
    val url: String,
    val width: Int,
    val height: Int
)

data class SImagesWithBackground(
    val url: String,
    val width: Int,
    val height: Int
)

class StickerAttachment(
    override val type: String = "sticker",
    val sticker: Sticker
) : Attachment

//-------------------------------------------------------------------------------------------

data class Note(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val text: String,
    val date: Int,
    val comments: Int,
    val readComments: Int,
    val viewUrl: String,
    val privacyView: String,
    val privacyComment: String,
    val canComment: Int,
    val text_wiki: String
)

class NoteAttachment(
    override val type: String = "note",
    val note: Note
) : Attachment