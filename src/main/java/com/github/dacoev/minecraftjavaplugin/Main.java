package com.github.dacoev.minecraftjavaplugin;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    Logger logger = getServer().getLogger();

    @Override
    public void onEnable() {
        logger.info("minecraftjavaplugin is on");
        //경고가 떠도 이렇게 하는 것이 좋을 것 같다.
        this.getCommand("Launch").setExecutor(new Fly());
        this.getCommand("Hello").setExecutor(new Hello());
        this.getCommand("Doctor").setExecutor(new Heal());
        this.getCommand("Doctor").setExecutor(new FlyBoots());
    }

    @Override
    public void onDisable() {
        logger.info("minecraftjavaplugin is off");
    }

}
