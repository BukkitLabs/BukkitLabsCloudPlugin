package net.bukkitlabs.bukkitlabscloud.plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class BukkitLabsCloudPlugin extends JavaPlugin {

    private static BukkitLabsCloudPlugin instance;

    @Override
    public void onEnable() {
        setInstance(this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    private static void setInstance(@NotNull final BukkitLabsCloudPlugin instance) {
        BukkitLabsCloudPlugin.instance=instance;
    }

    public static BukkitLabsCloudPlugin getInstance(){
        return instance;
    }
}
