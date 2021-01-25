class User(
    id: Int,
    name: String,
    email: String,
    contacts: List<Contact>,
    blocked_users: List<Int>,
    chats_with_user: List<Int>,
    pending_invites: List<ChatInvite>
)
