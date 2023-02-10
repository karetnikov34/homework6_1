object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = 2 + posts.lastIndex)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, currentPost) in posts.withIndex()) {
            if (post.id == currentPost.id) {
                posts[index] = post.copy()
                return true
            }
        }
        return false
    }

    fun printAllPosts () {
        for (post in posts) {
            println(post)
        }
    }

    fun clear() {
        posts = emptyArray()
    }
}