class User(
    id: Int,
    name: String,
    email: String,
    contacts: List<Contact>,
    blocked_users: Set<Int>,
    chats_ids: Set<Int>,
    pending_invites: List<ChatInvite>
)
