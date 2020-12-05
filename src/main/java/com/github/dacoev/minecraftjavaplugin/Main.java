package com.github.dacoev.minecraftjavaplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    Logger logger = getServer().getLogger();

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("minecraftjavaplugin is on");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("minecraftjavaplugin is off");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(label.equalsIgnoreCase("launch")){
            if(sender instanceof Player){
                Player player = (Player) sender;
                //There are two commands that we could use which is /launch and /launch <number>
                if(args.length == 0){
                    //using launch
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Zooooom!");
                    player.setVelocity();
                }
            }else{
                sender.sendMessage("console could not use this command");
                return true;
            }
        }
        return false;
    }
    /*
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(label.equalsIgnoreCase("hello")){
            if(sender instanceof Player){
                Player player = (Player) sender;
                if(player.hasPermission("hello.use")) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Welcome to the server");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&1H&2E&3L&4L&5O&6!"));
                    return true;
                }
                player.sendMessage(ChatColor.RED + "You do not have permission!");
            }
            else{
                sender.sendMessage("Console!");
            }
            return true;
        }
        return false;
    }
    */
}
