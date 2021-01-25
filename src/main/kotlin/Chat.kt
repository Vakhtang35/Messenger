class Chat(
    id: Int,
    name: String,
    ownerId: Int,
    messagesIds: List<Int>,
    participantsIds: List<Int>,
    joinPolicy: JoinPolicy
) {
    enum class JoinPolicy {
        PUBLIC, PRIVATE, BY_INVITE
    }
}