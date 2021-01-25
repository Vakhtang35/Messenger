class Chat(
    id: Int,
    name: String,
    owner: Int,
    messages: MutableSet<String>,
    joinPolicy: JoinPolicy
) {
    enum class JoinPolicy {
        PUBLIC, PRIVATE, BY_INVITE
    }
}