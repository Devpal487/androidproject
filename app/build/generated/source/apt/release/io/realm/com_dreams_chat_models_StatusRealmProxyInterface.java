package io.realm;


public interface com_dreams_chat_models_StatusRealmProxyInterface {
    public RealmList<com.dreams.chat.models.StatusImage> realmGet$statusImages();
    public void realmSet$statusImages(RealmList<com.dreams.chat.models.StatusImage> value);
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
