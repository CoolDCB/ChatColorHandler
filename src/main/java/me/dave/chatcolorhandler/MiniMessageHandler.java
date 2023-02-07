package me.dave.chatcolorhandler;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class MiniMessageHandler {
    private final MiniMessage miniMessage = MiniMessage.miniMessage();

    public Component deserialize(String string) {
        // Initial character replacements as MiniMessage crashes with '
        string = string.replaceAll("§", "&");

        // Parse message through MiniMessage
        return miniMessage.deserialize(string);
    }
}
