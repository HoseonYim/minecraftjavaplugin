package com.github.dacoev.minecraftjavaplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hello implements CommandExecutor {

    @Override
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
}
