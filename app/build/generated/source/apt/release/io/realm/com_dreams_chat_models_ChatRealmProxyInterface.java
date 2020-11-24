package io.realm;


public interface com_dreams_chat_models_ChatRealmProxyInterface {
    public RealmList<com.dreams.chat.models.Message> realmGet$messages();
    public void realmSet$messages(RealmList<com.dreams.chat.models.Message> value);
    public String realmGet$lastMessage();
    public void realmSet$lastMessage(String value);
    public String realmGet$myId();
    public void realmSet$myId(String value);
    public String realmGet$userId();
    public void realmSet$userId(String value);
    public String realmGet$groupId();
    public void realmSet$groupId(String value);
    public long realmGet$timeUpdated();
    public void realmSet$timeUpdated(long value);
    public com.dreams.chat.models.User realmGet$user();
    public void realmSet$user(com.dreams.chat.models.User value);
    public com.dreams.chat.models.Group realmGet$group();
    public void realmSet$group(com.dreams.chat.models.Group value);
    public boolean realmGet$read();
    public void realmSet$read(boolean value);
}
