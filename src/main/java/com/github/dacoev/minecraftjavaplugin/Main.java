package com.github.dacoev.minecraftjavaplugin;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    Logger logger = getServer().getLogger();

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("minecraftjavaplugin is on");
        this.getCommand("Launch").setExecutor(new Fly());
        this.getCommand("Hello").setExecutor(new Hello());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("minecraftjavaplugin is off");
    }

}
