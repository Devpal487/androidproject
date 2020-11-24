package io.realm;


public interface com_dreams_chat_models_UserRealmProxyInterface {
    public String realmGet$id();
    public void realmSet$id(String value);
    public String realmGet$name();
    public void realmSet$name(String value);
    public String realmGet$status();
    public void realmSet$status(String value);
    public String realmGet$image();
    public void realmSet$image(String value);
    public String realmGet$pincode();
    public void realmSet$pincode(String value);
    public String realmGet$statename();
    public void realmSet$statename(String value);
    public String realmGet$membername();
    public void realmSet$membername(String value);
    public String realmGet$wallpaper();
    public void realmSet$wallpaper(String value);
    public long realmGet$timestamp();
    public void realmSet$timestamp(long value);
    public RealmList<com.dreams.chat.models.solochat> realmGet$solochat();
    public void realmSet$solochat(RealmList<com.dreams.chat.models.solochat> value);
    public RealmList<String> realmGet$blockedUsersIds();
    public void realmSet$blockedUsersIds(RealmList<String> value);
}
